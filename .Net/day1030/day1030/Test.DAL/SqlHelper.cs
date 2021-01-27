using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Test.DAL
{
    public class SqlHelper
    {
        private readonly static string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//找个配置文件中的数据库
        /// <summary>
        /// 输入sql语句得到一张带有数据的表格
        /// </summary>
        /// <param name="str">输入sql语句</param>
        /// <param name="type">交代方法执行的类型</param>
        /// <param name="pars">可以替换的参数</param>
        /// <returns></returns>
        public static DataTable GetTable(String str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr))//打开数据库链接
            {
                using (SqlDataAdapter apter = new SqlDataAdapter(str, conn))
                {  //输入数据库命令，获得数据

                    apter.SelectCommand.CommandType = type;

                    if (pars!=null)
                    {
                        apter.SelectCommand.Parameters.AddRange(pars);
                    }
                    DataTable dt = new DataTable();//创建存储数据的表格
                    apter.Fill(dt);//把获取的数据放入表格中
                    return dt;
                }
            }
        }


        /// <summary>
        /// 输入sql语句可以得到受影响的行数
        /// </summary>
        /// <param name="str">输入sql语句</param>
        /// <param name="type">交代方法执行的类型</param>
        /// <param name="pars">可以替换的参数</param>
        /// <returns></returns>
        public static int ExecuteNonQuery(String str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr))//打开数据库链接
            {
                using (SqlCommand cmd = new SqlCommand(str,conn)) //新建储存对象
                {
                    cmd.CommandType = type;
                    if (pars!=null)
                    {
                        cmd.Parameters.AddRange(pars);
                    }
                    conn.Open();
                    return cmd.ExecuteNonQuery();
                }
            }
        }
    }
}
