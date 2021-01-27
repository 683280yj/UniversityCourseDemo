using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;

namespace WebApplication1
{
    /// <summary>
    /// upload 的摘要说明
    /// </summary>
    public class upload : IHttpHandler
    {
        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            HttpPostedFile file = context.Request.Files["fileUp"];
            if (file != null)
            {
                string fileName = Path.GetFileName(file.FileName);
                string fileExt = Path.GetExtension(fileName);
                string time = DateTime.Now.ToString();
                if (fileExt == ".jpg" || fileExt == ".gif" || fileExt == ".png")
                {
                    file.SaveAs(context.Request.MapPath("/Img/" + fileName + time));
                    context.Response.Write("<html><head></head><body><imgsrc='/Img/" + fileName + time + "'/></body></html>");
                    context.Response.Write("文件上传成功");
                }
                else
                {
                    context.Response.Write("请上传Jpg，Gif，Png格式的图片！");
                    context.Response.Redirect("uploaderror.html");
                }
            }
            else
            {
                context.Response.Write("<script>alert('未选择文件')</script>");
                context.Response.Redirect("uploaderror.html");
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