using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 汽车报价查询系统
{
    class Data
    {
        //车型列表
        public static Type[] TypeList;
        //品牌列表
        public static Brand[] BrandList;
        //汽车列表
        public static Car[] CarList;

        //初始化数据
        public static void InitData()
        {
            #region 初始化车型列表
            //创建车型对象
            Type type1 = new Type();
            type1.TypeID = "XXC";
            type1.TypeName = "小型车";
            Type type2 = new Type();
            type2.TypeID = "JCX";
            type2.TypeName = "紧凑型车";
            Type type3 = new Type();
            type3.TypeID = "ZXC";
            type3.TypeName = "中型车";
            Type type4 = new Type();
            type4.TypeID = "HHC";
            type4.TypeName = "豪华车";
            Type type5 = new Type();
            type5.TypeID = "SUV";
            type5.TypeName = "SUV";
            //初始化车型列表
            TypeList = new Type[] { type1, type2, type3, type4, type5};
            #endregion
            #region 初始化品牌列表
            Brand brand1 = new Brand();
            brand1.BrandID = "SHVW";
            brand1.BrandName = "上海-大众";
            Brand brand2 = new Brand();
            brand2.BrandID = "YQVW";
            brand2.BrandName = "一汽-大众";
            Brand brand3 = new Brand();
            brand3.BrandID = "BMW";
            brand3.BrandName = "宝马";
            Brand brand4 = new Brand();
            brand4.BrandID = "BENZ";
            brand4.BrandName = "奔驰";
            //初始化品牌列表
            BrandList = new Brand[] { brand1, brand2, brand3, brand4 };
            #endregion
            #region 初始化汽车列表
            Car car1 = new Car();
            car1.Name = "速腾1.4TSI自动豪华";
            car1.Type = "紧凑型车";
            car1.Brand = "一汽-大众";
            car1.Color = "糖果白";
            car1.Price = "16.78万";
            car1.ImageIndex = 0;
            Car car2 = new Car();
            car2.Name = "帕萨特2.0TSI御尊版";
            car2.Type = "中型车";
            car2.Brand = "上海-大众";
            car2.Color = "金黑";
            car2.Price = "25.48万";
            car2.ImageIndex = 1;
            Car car3 = new Car();
            car3.Name = "宝马740Li豪华型";
            car3.Type = "豪华车";
            car3.Brand = "宝马";
            car3.Color = "冰河银";
            car3.Price = "117.8万";
            car3.ImageIndex = 2;
            Car car4 = new Car();
            car4.Name = "奔驰GLK300动感型";
            car4.Type = "SUV";
            car4.Brand = "奔驰";
            car4.Color = "北极白";
            car4.Price = "39.8万";
            car4.ImageIndex = 3;
            //初始化汽车列表
            CarList = new  Car[10];
            CarList[0] = car1;
            CarList[1] = car2;
            CarList[2] = car3;
            CarList[3] = car4;
            #endregion
        }

    }
}
