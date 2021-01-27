using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using test.Model;
using Test.BLL;
using System.Data;
using System.Data.SqlClient;
using System.Text;
using System.IO;
namespace WebApplication
{

    public class UserInfoList : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            TestService testService = new TestService();
             List<UserInfo> list = testService.GetEntityList();

             StringBuilder sb = new StringBuilder();
             foreach (UserInfo userInfo in list)
             {
                 sb.AppendFormat("<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='userInf.ashx?id={5}'>详情</a></td><td><a href='delete.ashx?id={5}' class='del'>删除</a></td><td><a href='update.ashx?id={5}'>修改</a></td></tr>"
                        , userInfo.ID, userInfo.UserName, userInfo.UserPass, userInfo.Regtime, userInfo.Email, userInfo.ID);
             }
             string strPath = context.Request.MapPath("UserInfoList.html");
             string countStr = File.ReadAllText(strPath);
             countStr = countStr.Replace("$tbody", sb.ToString());
             context.Response.Write(countStr);
        }
        public bool IsReusable
        {
            get
            {
                return false;
            }
        }
    }
}