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
        private readonly static string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;

        public static DataTable GetTable(String str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlDataAdapter apter = new SqlDataAdapter(str, conn))
                {  

                    apter.SelectCommand.CommandType = type;

                    if (pars!=null)
                    {
                        apter.SelectCommand.Parameters.AddRange(pars);
                    }
                    DataTable dt = new DataTable();
                    apter.Fill(dt);
                    return dt;
                }
            }
        }



        public static int ExecuteNonQuery(String str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlCommand cmd = new SqlCommand(str,conn)) 
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

        internal static int GetExecuteNonQuery(string str, CommandType commandType, SqlParameter[] pars)
        {
            throw new NotImplementedException();
        }
    }
}