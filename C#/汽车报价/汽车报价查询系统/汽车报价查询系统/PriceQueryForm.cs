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
    public partial class PriceQueryForm : Form
    {
        public PriceQueryForm()
        {
            InitializeComponent();
        }

        private void PriceQueryForm_Load(object sender, EventArgs e)
        {
            LoadBrandTree();
            LoadTypeList();
            LoadCarList("全部品牌","所有车型");
        }

        //品牌节点图片索引
        int imageIndex_tree = 1;
        //加载品牌树型列表
        private void LoadBrandTree()
        {
            //创建根节点
            TreeNode rootNode = new TreeNode("全部品牌");
            rootNode.ImageIndex = 0;
            rootNode.SelectedImageIndex = 0;
            //将跟节点挂到树控件上
            this.tv_brand.Nodes.Add(rootNode);
            //遍历品牌列表
            foreach (Brand brand in Data.BrandList)
            {
                //创建品牌节点
                TreeNode brandNode = new TreeNode(brand.BrandName);
                //设置品牌图片
                brandNode.ImageIndex = imageIndex_tree;
                brandNode.SelectedImageIndex = imageIndex_tree;
                //将品牌节点挂到根节点上
                rootNode.Nodes.Add(brandNode);
                //更新品牌图片索引
                imageIndex_tree++;
            }
            //展开根节点
            rootNode.Expand();
        }

        //加载车型列表
        private void LoadTypeList()
        {
            this.cb_type.Items.Add("所有车型");
            foreach (Type type in Data.TypeList)
            {
                this.cb_type.Items.Add(type.TypeName);
            }
        }

        //根据品牌和车型，加载汽车列表
        private void LoadCarList(string brand, string type)
        {
            //清空汽车列表
            this.lv_car.Items.Clear();

            foreach (Car car in Data.CarList)
            {
                if (car == null) break;

                if (brand == "全部品牌" && type == "所有车型")
                {
                    AddItemToCarList(car);
                }
                else if (brand != "全部品牌" && type == "所有车型")
                {
                    if (car.Brand == brand)
                    {
                        AddItemToCarList(car);
                    }
                }
                else if (brand == "全部品牌" && type != "所有车型")
                {
                    if (car.Type == type)
                    {
                        AddItemToCarList(car);
                    }
                }
                else
                {
                    if (car.Brand==brand && car.Type == type)
                    {
                        AddItemToCarList(car);
                    }
                }
            }
        }

        //将汽车对象加入汽车列表中
        private  void AddItemToCarList(Car car)
        {
            ListViewItem item = new ListViewItem(car.Name);
            item.SubItems.Add(car.Brand);
            item.SubItems.Add(car.Type);
            item.SubItems.Add(car.Color);
            item.SubItems.Add(car.Price);
            item.ImageIndex = car.ImageIndex;
            this.lv_car.Items.Add(item);
        }

      
        //选中树节点触发事件
        private void tv_brand_AfterSelect(object sender, TreeViewEventArgs e)
        {
            if (this.tv_brand.SelectedNode == null) return;
            string brand = this.tv_brand.SelectedNode.Text;
            string type = this.cb_type.Text;
            LoadCarList(brand, type);
        }

        //更改车型后触发的事件
        private void cb_type_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (this.tv_brand.SelectedNode == null) return;
            string brand = this.tv_brand.SelectedNode.Text;
            string type = this.cb_type.Text;
            LoadCarList(brand, type);
        }


    }
}
