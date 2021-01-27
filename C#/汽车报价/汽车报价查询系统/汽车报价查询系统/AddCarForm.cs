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
    public partial class AddCarForm : Form
    {
        public AddCarForm()
        {
            InitializeComponent();
        }

        //加载品牌列表
        private void LoadBrandList()
        {
            foreach (Brand brand in Data.BrandList)
            {
                this.cb_brand.Items.Add(brand.BrandName);
            }
        }
        //加载车型列表
        private void LoadTypeList()
        {
            foreach (Type type in Data.TypeList)
            {
                this.cb_type.Items.Add(type.TypeName);
            }
        }

        //窗体加载事件
        private void AddCarForm_Load(object sender, EventArgs e)
        {
            LoadBrandList();
            LoadTypeList();
        }

        //添加按钮单击事件
        private void button1_Click(object sender, EventArgs e)
        {
            //创建汽车对象
            Car newCar = new Car();
            newCar.Name = this.txt_name.Text;
            newCar.Brand = this.cb_brand.Text;
            newCar.Type = this.cb_type.Text;
            if (rb_white.Checked)
                newCar.Color = rb_white.Text;
            if (rb_black.Checked)
                newCar.Color = rb_black.Text;
            if (rb_gray.Checked)
                newCar.Color = rb_gray.Text;
            newCar.Price = this.txt_price.Text;
            newCar.ImageIndex = 4;

            //将汽车对象加入汽车列表
            bool isFull = true; 
            for (int i = 0; i < 10; i++)
            {
                if (Data.CarList[i] == null)
                {
                    Data.CarList[i] = newCar;
                    isFull = false;
                    break;
                }
            }
            if (isFull)
                MessageBox.Show("列表已满！");
            else
                MessageBox.Show("添加成功！");
        }

        //取消按钮单击事件
        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

      
    }
}
