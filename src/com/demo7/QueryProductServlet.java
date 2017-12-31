package com.demo7;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection dbconn = null;

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		try {
			dbconn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productId = request.getParameter("productId");

		try {
			String sql = " SELECT * FROM Products WHERE prod_id = ? ";
			PreparedStatement pstmt = dbconn.prepareStatement(sql); // 创建查询对象
			pstmt.setString(1, productId); // 拼接查询语句
			ResultSet rs = pstmt.executeQuery(); // 执行查询
			
			if (rs.next()) {
				Product product = new Product();
				product.setProd_id(rs.getString("prod_id"));
				product.setPname(rs.getString("pname"));
				product.setPrice(rs.getDouble("price"));
				product.setStock(rs.getInt("stock"));
				// 创建session对象,并将 product对象存入其中
				request.getSession().setAttribute("product", product);
				response.sendRedirect("ch7/displayProduct.jsp");
			}else {
				response.sendRedirect("ch7/error.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		ArrayList<Product> productList = new ArrayList<Product>();
		
		try {
			String sql = " SELECT * FROM Products ";
			PreparedStatement pstmt = dbconn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Product product = new Product();
				product.setProd_id(rs.getString("prod_id"));
				product.setPname(rs.getString("pname"));
				product.setPrice(rs.getDouble("price"));
				product.setStock(rs.getInt("stock"));
				
				productList.add(product);
			}
			if (!productList.isEmpty()) {
				request.getSession().setAttribute("productList", productList);
				response.sendRedirect("ch7/displayAllProduct.jsp");
			} else {
				response.sendRedirect("ch7/error.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 初始化数据库连接
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() {
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";// 驱动
		String dburl = "jdbc:odbc:ProductsDB"; // 数据库 URL ProductsDB 数据库连接名,在ODBC中配置
		String username = "";
		String password = "";
		
		try {
			Class.forName(driver); // 加载驱动
			dbconn = DriverManager.getConnection(dburl, username, password); // 创建连接
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
