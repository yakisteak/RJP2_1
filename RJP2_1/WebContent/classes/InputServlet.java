import java.io.IOException;
import bean.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class InputServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        req.setCharacterEncoding("utf-8");
        String userName = req.getParameter("name");
        String userPass = req.getParameter("pass");

        UserBean bean = new UserBean();
        bean.setName(userName);
        bean.setPass(userPass);
        req.setAttribute("user",bean);
        RequestDispatcher dis = req.getRequestDispatcher("result");
        dis.forward(req,res); 
    }
}