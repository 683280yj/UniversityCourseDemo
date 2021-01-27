using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _201710253121HYQ
{
    public partial class Form2 : Form
    {
        //定义数组，存储歌曲对象
        private song[] SongArray;
        //定义方法，初始化数据
        private void InitData()
        {
            //实例化歌曲对象
            song song1 = new song();
            song1.Title = "菊花台";
            song1.Type = "热门经典";
            song1.Singer = "周杰伦";

            song song2 = new song();
            song2.Title = "爱你一万年";
            song2.Type = "经典老歌";
            song2.Singer = "刘德华";

            song song3 = new song();
            song3.Title = "北京北京";
            song3.Type = "影视经典";
            song3.Singer = "汪峰";
            //Song2、Song3初始化代码略……	
            //初始化歌曲数组
            SongArray = new song[] { song1, song2, song3 };
        }
        //定义方法，加载所有歌曲，绑定ListView控件
        private void LoadAllSong()
        {
            //遍历所有的歌曲
            foreach (song song in SongArray)
            {
                //创建ListViewItem项
                ListViewItem item = new ListViewItem(song.Title,0);
                item.SubItems.Add(song.Type);
                item.SubItems.Add(song.Singer);
                //添加ListViewItem项
                this.listView1.Items.Add(item);
            }
        }


        public Form2()
        {
            InitializeComponent();
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
          
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            InitData();
            LoadAllSong();

            /* ListViewItem item1 = new ListViewItem("菊花台",0);
            item1.SubItems.Add("热门经典");
            item1.SubItems.Add("周杰伦");
            listView1.Items.Add(item1);

            ListViewItem item2 = new ListViewItem("爱你一万年",0);
            item2.SubItems.Add("经典老歌");
            item2.SubItems.Add("刘德华");
            listView1.Items.Add(item2);

            ListViewItem item3 = new ListViewItem("北京北京",0);
            item3.SubItems.Add("影视金曲");
            item3.SubItems.Add("汪峰");
            listView1.Items.Add(item3);*/
        }

        private void 大图标ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.View = View.LargeIcon;
        }

        private void 小图标ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.View = View.SmallIcon;
        }

        private void 详情ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.View = View.Details;
        }

        private void 列表ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.View = View.List;
        }

        private void 平铺ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.View = View.LargeIcon;
        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {

        }
       
    }
}
