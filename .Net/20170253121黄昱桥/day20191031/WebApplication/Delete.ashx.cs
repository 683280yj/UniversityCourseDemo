using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Web;
using Test.BLL;
using Test.Model;

namespace WebApplication
{

    public class Delete : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            UserInfoServer userInfoServer = new UserInfoServer();
           
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id)) 
            {
                        if (userInfoServer.DeleteEntityList(id) == 1 )
                        {
                            context.Response.Redirect("UserInfoList.ashx");
                        }
                        else
                        {
                            context.Response.Redirect("Error1.html");
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