using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication2
{
    /// <summary>
    /// Xz 的摘要说明
    /// </summary>
    public class Xz : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            string encodeFileName = "1.jpg";
            context.Response.AddHeader("Content-Disposition",
            string.Format("attachment;filename=\"{0}\"", encodeFileName));
            context.Response.WriteFile("1.jpg"); 
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