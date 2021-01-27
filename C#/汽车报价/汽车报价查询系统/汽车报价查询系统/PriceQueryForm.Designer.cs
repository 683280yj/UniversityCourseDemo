namespace 汽车报价查询系统
{
    partial class PriceQueryForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(PriceQueryForm));
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.tv_brand = new System.Windows.Forms.TreeView();
            this.imageList1 = new System.Windows.Forms.ImageList(this.components);
            this.lv_car = new System.Windows.Forms.ListView();
            this.columnHeader5 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader3 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader4 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.il_car = new System.Windows.Forms.ImageList(this.components);
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.cb_type = new System.Windows.Forms.ComboBox();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.tv_brand);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.lv_car);
            this.splitContainer1.Panel2.Controls.Add(this.panel1);
            this.splitContainer1.Size = new System.Drawing.Size(701, 384);
            this.splitContainer1.SplitterDistance = 182;
            this.splitContainer1.TabIndex = 0;
            // 
            // tv_brand
            // 
            this.tv_brand.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tv_brand.ImageIndex = 0;
            this.tv_brand.ImageList = this.imageList1;
            this.tv_brand.Location = new System.Drawing.Point(0, 0);
            this.tv_brand.Name = "tv_brand";
            this.tv_brand.SelectedImageIndex = 0;
            this.tv_brand.Size = new System.Drawing.Size(182, 384);
            this.tv_brand.TabIndex = 0;
            this.tv_brand.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.tv_brand_AfterSelect);
            // 
            // imageList1
            // 
            this.imageList1.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imageList1.ImageStream")));
            this.imageList1.TransparentColor = System.Drawing.Color.Transparent;
            this.imageList1.Images.SetKeyName(0, "0.jpg");
            this.imageList1.Images.SetKeyName(1, "0.jpg");
            this.imageList1.Images.SetKeyName(2, "1.jpg");
            this.imageList1.Images.SetKeyName(3, "2.jpg");
            this.imageList1.Images.SetKeyName(4, "3.jpg");
            // 
            // lv_car
            // 
            this.lv_car.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader5,
            this.columnHeader1,
            this.columnHeader2,
            this.columnHeader3,
            this.columnHeader4});
            this.lv_car.LargeImageList = this.il_car;
            this.lv_car.Location = new System.Drawing.Point(3, 50);
            this.lv_car.Name = "lv_car";
            this.lv_car.Size = new System.Drawing.Size(512, 331);
            this.lv_car.TabIndex = 1;
            this.lv_car.UseCompatibleStateImageBehavior = false;
            this.lv_car.View = System.Windows.Forms.View.Tile;
            // 
            // columnHeader5
            // 
            this.columnHeader5.Text = "名称";
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "品牌";
            // 
            // columnHeader2
            // 
            this.columnHeader2.Text = "车型";
            // 
            // columnHeader3
            // 
            this.columnHeader3.Text = "颜色";
            // 
            // columnHeader4
            // 
            this.columnHeader4.Text = "价格";
            // 
            // il_car
            // 
            this.il_car.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("il_car.ImageStream")));
            this.il_car.TransparentColor = System.Drawing.Color.Transparent;
            this.il_car.Images.SetKeyName(0, "s_201304031740570554122.jpg");
            this.il_car.Images.SetKeyName(1, "s_201211261859181314122.jpg");
            this.il_car.Images.SetKeyName(2, "s_201301111855358514136.jpg");
            this.il_car.Images.SetKeyName(3, "s_201210292011164344136.jpg");
            this.il_car.Images.SetKeyName(4, "s_201210311850125073765.jpg");
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.Ivory;
            this.panel1.Controls.Add(this.label1);
            this.panel1.Controls.Add(this.cb_type);
            this.panel1.Location = new System.Drawing.Point(3, 3);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(512, 47);
            this.panel1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(62, 21);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 1;
            this.label1.Text = "车型：";
            // 
            // cb_type
            // 
            this.cb_type.FormattingEnabled = true;
            this.cb_type.Location = new System.Drawing.Point(109, 17);
            this.cb_type.Name = "cb_type";
            this.cb_type.Size = new System.Drawing.Size(121, 20);
            this.cb_type.TabIndex = 0;
            this.cb_type.Text = "所有车型";
            this.cb_type.SelectedIndexChanged += new System.EventHandler(this.cb_type_SelectedIndexChanged);
            // 
            // PriceQueryForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(701, 384);
            this.Controls.Add(this.splitContainer1);
            this.Name = "PriceQueryForm";
            this.Text = "报价查询";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.PriceQueryForm_Load);
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.TreeView tv_brand;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox cb_type;
        private System.Windows.Forms.ImageList imageList1;
        private System.Windows.Forms.ImageList il_car;
        private System.Windows.Forms.ListView lv_car;
        private System.Windows.Forms.ColumnHeader columnHeader5;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader2;
        private System.Windows.Forms.ColumnHeader columnHeader3;
        private System.Windows.Forms.ColumnHeader columnHeader4;
    }
}