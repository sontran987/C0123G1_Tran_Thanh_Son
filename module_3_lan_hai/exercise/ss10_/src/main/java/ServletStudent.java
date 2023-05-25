import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletStudent", value = "/Servlet-Student")
public class ServletStudent extends HttpServlet {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "thanh", "nam", 90));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (studentList.size() == 0) {
            String thongBao = "Danh Sách Rỗng";
            request.setAttribute("message", thongBao);
            request.getRequestDispatcher("/display-student.jsp").forward(request,response);
        }
        String xepLoai="";
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getDiemSo() >= 90) {
                xepLoai = "Giỏi";
            }
            else if (studentList.get(i).getDiemSo() >= 80) {
                xepLoai = "Khá";
            }else if (studentList.get(i).getDiemSo()>=50) {
                xepLoai = "Trung Bình";
            }else {
                xepLoai = "Yếu";
            }
            request.setAttribute("maHocVien",studentList.get(i).getMaHocVien());
            request.setAttribute("tenHocVien",studentList.get(i).getTenHocVien());
            request.setAttribute("gioiTinh",studentList.get(i).getGioiTinh());
            request.setAttribute("diemSo",studentList.get(i).getDiemSo());
            request.setAttribute("xepLoai",xepLoai);
            request.getRequestDispatcher("/display-student.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
