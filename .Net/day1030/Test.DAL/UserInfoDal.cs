using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using test.Model;
using System.Data;
using System.Data.SqlClient;
namespace Test.DAL
{
    public class UserInfoDal
    {
        /// <summary>
        /// 查询全部
        /// </summary>
        /// <returns></returns>
        public List<UserInfo> GetEntityList(){
            string str = "select * from Table_1";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text);
            List<UserInfo> list = null;
            if (da.Rows.Count>0)
            {
                list = new List<UserInfo>();
                UserInfo userInfo = null;

                foreach (DataRow row in da.Rows)
                {
                    userInfo = new UserInfo();
                    LoadEntity(row, userInfo);
                    list.Add(userInfo);
                } 
            }
            return list;
        }
        public void LoadEntity(DataRow row, UserInfo userInfo) {
            userInfo.ID = Convert.ToInt32(row["编号"]);
            //userInfo.UserName = row["姓名"].ToString();
            userInfo.UserName = row["用户名"] != DBNull.Value ? row["用户名"].ToString() : string.Empty;
            userInfo.UserPass = row["密码"] != DBNull.Value ? row["密码"].ToString() : string.Empty;
            userInfo.Email = row["邮箱"] != DBNull.Value ? row["邮箱"].ToString() : string.Empty;
            userInfo.Regtime = Convert.ToDateTime(row["时间"]); 

        }

        /// <summary>
        /// 查询详情
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public UserInfo GetEntityList(int id)
        {
            string str = "select * from Table_1 where 编号=@id";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text,new SqlParameter("@ID",id));
            UserInfo userInfo = null;
            if (da.Rows.Count>0)
            {
                userInfo = new UserInfo();
                LoadEntity(da.Rows[0], userInfo);
            }
            return userInfo;
        }
        /// <summary>
        /// 删除一条命令
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int DeleteEntity(int id)
        {
            string str = "delete from Table_1 where 编号=@id";
            int num = SqlHelper.ExecuteNonQuery(str, CommandType.Text, new SqlParameter("@id", id));
            return num;
            
        }
        /// <summary>
        /// 修改信息
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int UpdateUserInfo(int id)
        {
            string str = "update Table_1 set 姓名=@useName,密码=@pwd,邮箱=@email,时间=@regtime where 编号=@id";
            UserInfo userInfo=new UserInfo();
            SqlParameter[] pars ={
                                     new SqlParameter("@useName",SqlDbType.NVarChar,32),
                                    new SqlParameter("@pwd",SqlDbType.NVarChar,32),
                                    new SqlParameter("@email", SqlDbType.NVarChar,32),
                                    new SqlParameter("@regtime", SqlDbType.DateTime),
                                    new SqlParameter("@id", id)
                                   
                                 };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = DateTime.Now;
            int num = SqlHelper.ExecuteNonQuery(str, CommandType.Text, pars);
            return num;
        
        }
        

    }
}
