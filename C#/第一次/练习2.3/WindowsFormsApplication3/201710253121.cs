using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class LoginForm : Form
    {
        public LoginForm()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == string.Empty || textBox2.Text == string.Empty)
            {
                MessageBox.Show("用户名和密码不能为空");
                textBox1.Clear();
                textBox2.Clear();
                textBox2.Focus();
                return;
            }
            if (!textBox1.Text.Equals("admin") || !textBox2.Text.Equals("admin"))
            {
                MessageBox.Show("登陆失败");
                return;
            }
            else
            {
                MessageBox.Show("登陆成功");
                Form2 Mdichild=new Form2();
                Mdichild.Show();


            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
                
        }

        private void LoginForm_Load(object sender, EventArgs e)
        {
            
        }
    }
}
