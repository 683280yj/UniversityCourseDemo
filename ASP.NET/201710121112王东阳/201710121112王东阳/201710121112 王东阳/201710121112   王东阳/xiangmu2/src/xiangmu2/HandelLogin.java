package xiangmu2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
		public class HandelLogin extends HttpServlet{
			UserOper oper=new UserOper();
			public void init(ServletConfig config)throws ServletException{
				super.init(config);
			}
			public void destroy() {
				super.destroy(); 
				
			}
			public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
					this.doPost(request, response);
			}
			public void doPost(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException{
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");		
				HttpSession session=request.getSession(true);
				String op = request.getParameter("op");
				String opg= request.getParameter("opg");
				String opyh = request.getParameter("opyh");
				String zdgroup=request.getParameter("zdgroup");
				System.out.println(zdgroup);
				String gysgroup=request.getParameter("gysgroup");
				Login judgeLogin = (Login)(session.getAttribute("login"));
				if ("doLogin".equals(op)) {
					doLogin(request, response);
					return;
				}
				if (judgeLogin!=null&&!"".equals(judgeLogin)){
					if("经理".equals(judgeLogin.getYh_quanxian())){
						if ("ZD".equals(op)){
								doLnquiresZD(request,response);							
						}else if("ZDAdd".equals(op)){
								doZDAdd(request,response);
						}else if("ZDXinXi".equals(op)){
							    doZDXinXi(request,response);
						}else if("修 改".equals(op)){
							    doZDXiuGai(request,response);
						}else if("删 除".equals(op)){
							    doZDDel(request,response);
						}else if("组合查询".equals(zdgroup)){
								doZDChaXun(request,response);
						}else if("GYS".equals(op)){			
								doLnquiresGYS(request,response);				
						}else if("GYSAdd".equals(op)){
							    doGYSAdd(request,response);
						}else if("GYSXinXi".equals(op)){
							    doGYSXinXi(request,response);
						}else if("修 改".equals(opg)){
								doGYSXiuGai(request,response);
		}else if("删 除".equals(opg)){
								doGYSDel(request,response);
						}else if("组合查询".equals(gysgroup)){
								doGYSChaXun(request,response);
						}else if("YH".equals(op)){
								doLnquiresYH(request,response);					
						}else if("YHAdd".equals(op)){
							    doYHAdd(request,response);
						}else if("YHXinXi".equals(op)){
							    doYHXinXi(request,response);
						}else if("修 改".equals(opyh)){
								doYHXiuGai(request,response);
						}else if("删 除".equals(opyh)){
								doYHDel(request,response);
						}else if ("查询".equals(opyh)) {
								doYhChaXun(request,response);
						}else if("修改密码".equals(opyh)){
							    doYHMiMa(request,response);
						}else if("修改密码".equals(op)){
								doAdminMiMaXiuGai(request,response);
						}
					}
					if("普通用户".equals(judgeLogin.getYh_quanxian())){
						if ("ZD".equals(op)){
								doLnquiresZD(request,response);							
						}else if("ZDAdd".equals(op)){
								doZDAdd(request,response);
						}else if("ZDXinXi".equals(op)){
							    doZDXinXi(request,response);
						}else if("修 改".equals(op)){
							    doZDXiuGai(request,response);
						}else if("删 除".equals(op)){
							    doZDDel(request,response);
						}else if("组合查询".equals(zdgroup)){
								doZDChaXun(request,response);
						}else if("GYS".equals(op)){			
								doLnquiresGYS(request,response);				
						}else if("GYSAdd".equals(op)){
							    doGYSAdd(request,response);
						}else if("GYSXinXi".equals(op)){
							    doGYSXinXi(request,response);
						}else if("修 改".equals(opg)){
								doGYSXiuGai(request,response);
						}else if("删 除".equals(opg)){
								doGYSDel(request,response);
						}else if("组合查询".equals(gysgroup)){
								doGYSChaXun(request,response);
						}else if("YH".equals(op)||"修改密码".equals(op)||"修改密码".equals(opyh)||
								"查询".equals(opyh)||"删 除".equals(opyh)||"修 改".equals(opyh)||
								"YHXinXi".equals(op)||"YHAdd".equals(op)){
								Information info=new Information();
								String msg="对不起您没有那么高的权限";
								info.setMsg(msg);
								request.setAttribute("info", info);
								request.getRequestDispatcher("mainWindow.jsp").forward(request, response);
						}
					}
				}else{
					response.sendRedirect("login.jsp");	
				}
				
				
			}
			private void doGYSChaXun(HttpServletRequest request,
					HttpServletResponse response) throws ServletException,IOException{
					String gys_name=request.getParameter("commodityname").trim();
					String gys_miaoshu=request.getParameter("commoditymiaoshu").trim();
					List<GYSBean> list=oper.GYSChaXun(gys_name,gys_miaoshu);
					if(list!=null){
						request.setAttribute("list", list);
						request.getRequestDispatcher("admin_supplier_list.jsp").forward(request, response);
					}else {
						response.sendRedirect("admin_supplier_list.jsp");
					}
			}


		private void doLnquiresGYS(HttpServletRequest request,
					HttpServletResponse response)throws ServletException,IOException {
					List<GYSBean> list=oper.GYSLnquires();
					if(list!=null){
						request.setAttribute("list", list);
						request.getRequestDispatcher("admin_supplier_list.jsp").forward(request, response);
					}else {
						response.sendRedirect("admin_supplier_list.jsp");
					}
				
			}
		private void doGYSAdd(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,IOException{
				String gys_id = request.getParameter("gysid").trim();
				String gys_name =request.getParameter("gysname").trim();
				String gys_miaoshu=request.getParameter("gysmiaoshu").trim();
				String gys_lianxiren=request.getParameter("gyslianxi").trim();
				String gys_phone=request.getParameter("gysphone").trim();
				String gys_chuanzhen=request.getParameter("gyschuanzhen").trim();
				String gys_address=request.getParameter("gysaddress").trim();
				List params = new ArrayList();
				params.add(gys_id);
				params.add(gys_name);
				params.add(gys_miaoshu);
				params.add(gys_lianxiren);
				params.add(gys_phone);
				params.add(gys_chuanzhen);
				params.add(gys_address);
				Information info=oper.GYSAdd(params);
				request.setAttribute("info", info);
				request.getRequestDispatcher("admin_supplier_add.jsp").forward(request, response);
			
		}
		private void doGYSXinXi(HttpServletRequest request,
				HttpServletResponse response)throws ServletException,IOException {
				String gys_id = request.getParameter("id");
				GYSBean gysbean=new GYSBean();
				gysbean = oper.GYSXinXi(gys_id);
				
				request.setAttribute("gysbean", gysbean);
				request.getRequestDispatcher("admin_supplier_update.jsp").forward(request, response);
		}
		private void doGYSXiuGai(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,IOException{
			   	String gys_id= request.getParameter("gysid").trim();
			   	String gys_miaoshu = request.getParameter("gysmiaoshu").trim();
			   	String gys_lianxiren=request.getParameter("gyslianxi").trim();
			   	String gys_phone=request.getParameter("gysphone").trim();
			   	String gys_chuanzhen=request.getParameter("gyschuanzhen").trim();
			   	String gys_address=request.getParameter("gysaddress").trim();
			   	String gys_name=request.getParameter("gysname").trim();
			   	List params=new ArrayList();
			   	params.add(gys_id);
			   	params.add(gys_miaoshu);
			   	params.add(gys_lianxiren);
			   	params.add(gys_phone);
			   	params.add(gys_chuanzhen);
			   	params.add(gys_address);
			   	params.add(gys_name);
			   	
			   	Information info=oper.GYSXiuGai(params);
			   	request.setAttribute("info", info);
			   	request.getRequestDispatcher("admin_supplier_update.jsp").forward(request, response);
		}


	private void doGYSDel(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,IOException{
				String gys_id= request.getParameter("gysid").trim();
				Information info=oper.GYSDel(gys_id);
				request.setAttribute("info", info);
				request.getRequestDispatcher("admin_supplier_update.jsp").forward(request, response);
	}

	}


