package servlet;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet", value = "/customer")
public class customerServlet extends HttpServlet {
    protected static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Mai Văn Hoàn", "1983-08-20", "Hà Nội","https://kenh14cdn.com/thumb_w/660/2020/7/17/brvn-15950048783381206275371.jpg"));
        customerList.add(new Customer(2, "Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","https://static-images.vnncdn.net/files/publish/2022/9/3/bien-vo-cuc-thai-binh-346.jpeg"));
        customerList.add(new Customer(3, "Nguyễn Thái Hoà", "1983-08-22", "Nam Định","https://giadinh.mediacdn.vn/296230595582509056/2022/2/17/27212817110061775266623491256080737665900375n-16450863187391857196552.jpg"));
        customerList.add(new Customer(4, "Trần Đăng Khoa", "1983-08-17", "Hà Tây","https://noithatbinhminh.com.vn/wp-content/uploads/2022/08/anh-dep-40.jpg"));
        customerList.add(new Customer(5, "Nguyễn Đình Thi", "1983-08-19", "Hà Nội","https://thuthuatphanmem.vn/uploads/2018/09/11/hinh-anh-dep-1_044126531.jpg"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customer", customerList);
        request.getRequestDispatcher("/display-customer.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
