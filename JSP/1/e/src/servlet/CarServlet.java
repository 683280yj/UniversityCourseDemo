package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GoodsDao;
import entity.Goods;

public class CarServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HashMap<Goods, Integer> car = new HashMap<Goods, Integer>();
        //1. 根据ID查询对应的商品
        int gid = -1;
        if(request.getParameter("gid")!=null){
            gid = Integer.parseInt(request.getParameter("gid"));
            Goods goods = GoodsDao.selectById(gid);
            //2. 将商品保存到集合（hashMap）
            if(request.getSession().getAttribute("car")!=null){
                car = (HashMap<Goods, Integer>)request.getSession().getAttribute("car");
            }
            //3. 判断商品是否已在购物车，如果是，则数量+1，否则添加新商品,同时计算总价
            boolean bl = false;
            double countPrice = 0;
            for (Goods g : car.keySet()) {
                if(g.getGid()==gid){
                    car.put(g, car.get(g)+1);
                    bl = true;
                }
                countPrice += g.getPrice()*car.get(g);
            }
            if(!bl){
                car.put(goods, 1);
                countPrice += goods.getPrice();
            }
            request.getSession().setAttribute("car", car);
            request.getSession().setAttribute("countPrice", countPrice);
            //5. 跳转到car.jsp页面
            request.getRequestDispatcher("car.jsp").forward(request, response);
        }
        else{
            response.sendRedirect("car.jsp");
        }

    }

}
