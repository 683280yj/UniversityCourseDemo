using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using test.Model;
using Test.BLL;

namespace WebApplication
{
    /// <summary>
    /// UserInf 的摘要说明
    /// </summary>
    public class UserInf : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";


            TestService testService = new TestService();
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id)) {
                UserInfo userInfo = testService.GetEntityList(id);
                string strPath = context.Request.MapPath("UserInf.html");
                string countStr = File.ReadAllText(strPath);
                countStr = countStr.Replace("$name",userInfo.UserName);
                countStr = countStr.Replace("$pwd", userInfo.UserPass);
                countStr = countStr.Replace("$email", userInfo.Email);
                context.Response.Write(countStr);

            }

            


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