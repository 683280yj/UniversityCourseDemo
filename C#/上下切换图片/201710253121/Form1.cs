using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace _201710253121
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        string[] str = Directory.GetFiles(@"C:\Users\Administrator\Desktop\素材");
        int index = 0;
        private void Form1_Load(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile(@"C:\Users\Administrator\Desktop\素材\哆啦A梦.jpg");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            label1.Text = DateTime.Now.ToString("yyyy年MM月dd日HH时mm分ss秒");
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label1.Text = DateTime.Now.ToString("yyyy年MM月dd日HH时mm分ss秒");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            index--;
            if (index == -1)
            {
                index = str.Length - 1;
            }
            pictureBox1.Image = Image.FromFile(str[index]);

        }
        private void ImageListForm_Load(object sender, EventArgs e)
        {
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            index++;
            if (index == str.Length)
            {
                index = 0;
            }
            pictureBox1.Image = Image.FromFile(str[index]);
        }
    }
}
