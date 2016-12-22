package bitcamp.java89.ems2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java89.ems2.dao.impl.ManagerMysqlDao;
import bitcamp.java89.ems2.dao.impl.MemberMysqlDao;
import bitcamp.java89.ems2.dao.impl.StudentMysqlDao;
import bitcamp.java89.ems2.dao.impl.TeacherMysqlDao;

@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<div id ='header' style='background-color:gray; height: 50px;'>");
    out.println("<img src='../image/black-chalkboard-icon.jpg' height='40' "
        + "style='float:left; margin-top:7px; margin-left:7px;'>");
    out.println("<div style='color:white; font-weight:bold; margin-left:90px; "
        + "padding-top:10px; font-family: 돋움체, sans-serif; font-size: xx-large'>교육센터관리시스템</div>");
    out.println("</div>");
    
  }
}
