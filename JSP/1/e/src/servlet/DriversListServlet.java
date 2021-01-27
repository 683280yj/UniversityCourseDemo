package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GoodsDao;
import entity.Goods;

public class DriversListServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. 编写dao层代码，查询所有零食
        List<Goods> list = GoodsDao.selectAll();
        //2. 保存到Session，并跳转页面
        request.setAttribute("goodsList", list);
        request.getRequestDispatcher("drivers.jsp").forward(request, response);
    }

}
