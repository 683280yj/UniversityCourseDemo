using System;
using System.Collections.Generic;
using System.Drawing;
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
                 //   file.SaveAs(context.Request.MapPath("/ImagePath/" + fileName));
                    string dir = "/ImagPath/" + DateTime.Now.Year + "/" + DateTime.Now.Month + "/" + DateTime.Now.Day + "/";
                    Directory.CreateDirectory(Path.GetDirectoryName(context .Request.MapPath(dir )));
                    string newfileName = Guid.NewGuid().ToString();
                    string fullDir  = dir + newfileName + fileExt;

                    file.SaveAs(context.Request.MapPath(fullDir));

                    using (Image imge = Image.FromStream(file.InputStream))
                    {
                        using (Bitmap map = new Bitmap (imge.Width,imge.Height))
                        {
                            using(Graphics g = Graphics.FromImage (map))
                            {
                                g.InterpolationMode=System.Drawing.Drawing2D.InterpolationMode.High;
                                g.SmoothingMode=System.Drawing.Drawing2D.SmoothingMode.HighQuality;
                                g.DrawImage(imge,new Rectangle(0,0,imge.Width,imge.Height));
                                g.DrawString("曹梦阮", new Font("华文行楷", 14.0f, FontStyle.Bold), Brushes.YellowGreen, new PointF(imge.Width - 100, imge.Height - 30)); 
                                map.Save(context.Request.MapPath(fullDir), System.Drawing.Imaging.ImageFormat.Jpeg);
                            }
                        }
                    }
                    context.Response.Write("<html><head></head><body><imgsrc='/ImagePath/" + fullDir + "'/></body></html>");
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