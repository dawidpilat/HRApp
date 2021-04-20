package pl.hrapp.client.home;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.hrapp.domain.api.DataInfo;
import pl.hrapp.domain.api.DataService;


import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"", "/index"})

public class HomeController extends HttpServlet {
    private DataService dataService = new DataService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<DataInfo> datas = dataService.findAll();
        request.setAttribute("datas", datas);

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }

}