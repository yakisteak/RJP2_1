package fox;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fox.bean.UserBean;

@WebServlet("/foxServlet")
public class FoxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException{
            req.setCharacterEncoding("Windows-31J");
            String userName = req.getParameter("name");
            String passWord = req.getParameter("pass");
            UserBean bean = new UserBean();
            bean.setName(userName);
            bean.setPass(passWord);
            req.setAttribute("user",bean);
            RequestDispatcher dis = req.getRequestDispatcher("foxresult");
            dis.forward(req,res);
    }
}