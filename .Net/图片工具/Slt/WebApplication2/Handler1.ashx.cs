using DotNet.Utilities;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Web;

namespace WebApplication1
{
    /// <summary>
    /// Handler1 的摘要说明
    /// </summary>
    public class Handler1 : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            string FilePath = context.Request.MapPath("/Image/1.jpg");

            #region
            using (Bitmap map = new Bitmap(140, 140))
            {
                using (Graphics g = Graphics.FromImage(map))
                {
                    using (Image img = Image.FromFile(FilePath))
                    {
                        g.DrawImage(img, new Rectangle(0, 0, map.Width, map.Width));
                        string newFileName = Guid.NewGuid().ToString();
                        map.Save(context.Request.MapPath("/Image/" + newFileName + ".jpg"), System.Drawing.Imaging.ImageFormat.Jpeg);

                        
                        //string newFileName = Guid.NewGuid().ToString();
                        //ImageClass.MakeThumbnail(FilePath, context.Request.MapPath(("/Image/" + newFileName + ".jpg")), 140, 140, "Cut");
                        //context.Request.Write("111");
                    }
                }
            }
            #endregion

            
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