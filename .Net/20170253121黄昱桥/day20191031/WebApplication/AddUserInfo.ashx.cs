using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using Test.BLL;

namespace WebApplication
{

    public class AddUserInfo : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            SqlCommand cmd = new SqlCommand();

            UserInfoServer userInfoServer = new UserInfoServer();

            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id))
            {
                if (userInfoServer.AddentityList(id) == 1)
                {
                    context.Response.Redirect("UserInfoList.ashx");
                }
                else
                {
                    context.Response.Redirect("Error.html");
                }
            }
            else
            {
                context.Response.Write("参数有误");
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