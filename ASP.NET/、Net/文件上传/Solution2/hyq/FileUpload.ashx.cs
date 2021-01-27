using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;

namespace hyq
{
    /// <summary>
    /// FileUpload 的摘要说明
    /// </summary>
    public class FileUpload : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            HttpPostedFile file = context.Request.Files["fileUp"];
            if (file == null)
            {
                context.Response.Write("请选择文件！");
            }
            else
            {
                string fileName = Path.GetFileName(file. FileName);
                string fileExt = Path.GetExtension(fileName);
                if (fileExt == ".jpg" || fileExt == ".gif" || fileExt == ".png")
                {
                    file.SaveAs(context.Request.MapPath("/ImagePath/" + fileName));
                    context.Response.Write("<html><head></head><body><imgsrc='/ImagePath/" + fileName + "'/></body></html>");
                    context.Response.Write("文件上传成功");
                }
                else 
                {
                    context.Response.Write("请上传图片！");
                }
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