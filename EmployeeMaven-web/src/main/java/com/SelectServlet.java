package com;

import com.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BigDecimal salary = new BigDecimal(req.getParameter("salary"));
        String username = req.getParameter("username");
        EmployeeService service = new EmployeeService();
        req.setAttribute("employeeList",service.getEmps(salary,username));
        req.setAttribute("salary",salary);
        req.setAttribute("username",username);
        req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req,resp);
    }
}
