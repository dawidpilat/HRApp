package pl.hrapp.client.data;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import pl.hrapp.domain.api.*;
import pl.hrapp.domain.data.Data;


import java.io.IOException;
import java.util.List;

@WebServlet("/new-data")
@ServletSecurity(
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "GET", rolesAllowed = "USER"),
                @HttpMethodConstraint(value = "POST", rolesAllowed = "USER")
        }
)
public class AddDataController extends HttpServlet {

    private DataService dataService = new DataService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/new-data.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataSaveRequest saveRequest = createSaveRequest(request);
        dataService.add(saveRequest);
        response.sendRedirect(request.getContextPath());
    }

    private DataSaveRequest createSaveRequest(HttpServletRequest request) {
        String loggedInUsername = request.getUserPrincipal().getName();
        return new DataSaveRequest(
                request.getParameter("name"),
                request.getParameter("surname"),
                request.getParameter("username"),
                request.getParameter("address"),
                request.getParameter("email"),
                request.getParameter("marital_status"),

                loggedInUsername
        );
    }
}
