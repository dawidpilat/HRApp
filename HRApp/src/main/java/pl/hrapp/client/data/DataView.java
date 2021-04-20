package pl.hrapp.client.data;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HttpMethodConstraint;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.hrapp.domain.api.DataInfo;
import pl.hrapp.domain.api.DataService;

import java.io.IOException;
import java.util.List;

@WebServlet("/personal-data-view")
@ServletSecurity(
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "GET", rolesAllowed = "USER"),
                @HttpMethodConstraint(value = "POST", rolesAllowed = "USER")
        }
)
public class DataView extends HttpServlet {
    private DataService dataService = new DataService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<DataInfo> datas = dataService.findAll();
        request.setAttribute("datas", datas);

        request.getRequestDispatcher("/WEB-INF/personal-data-view.jsp").forward(request, response);


    }

}