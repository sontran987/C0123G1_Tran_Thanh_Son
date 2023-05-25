import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";

        }
        switch (action){
            case "login":
                String userName = request.getParameter("name");
                String password = request.getParameter("pass");
                if (userName.equals("admin")&& password.equals("123abc")){
                    Date now = new Date();
                    String thongBao = "Ban da dang nhap thanh cong vao" + now;
                    request.setAttribute("thongbao",thongBao);
                    request.getRequestDispatcher("/WEB-INF/hienthi.jsp").forward(request,response);
                }else {
                    String thongBao = "Pass hoặc usename không đúng";
                    request.setAttribute("thongbao",thongBao);
                    request.getRequestDispatcher("/index.jsp").forward(request,response);
                }
                break;
            default:

                request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
