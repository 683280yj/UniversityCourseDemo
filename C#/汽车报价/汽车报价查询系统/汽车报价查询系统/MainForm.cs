using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 汽车报价查询系统
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //初始化数据
            Data.InitData();
        }

        //报价列表
        private void toolStripButton4_Click(object sender, EventArgs e)
        {
            PriceQueryForm priceQueryForm = new PriceQueryForm();
            priceQueryForm.MdiParent = this;
            priceQueryForm.WindowState = FormWindowState.Maximized;
            priceQueryForm.Show();
        }

        //新增报价
        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            AddCarForm addCarForm = new AddCarForm();
             addCarForm.Show();
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {

        }

        private void 品牌管理ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 车讯管理ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 汽车报价ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

    }
}
