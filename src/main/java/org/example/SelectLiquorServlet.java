package org.example;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.example.model.LiquorType;

@WebServlet (name = "selectliquorservlet", urlPatterns = "/SelectLiquor" )

public class SelectLiquorServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String liquorType = request.getParameter("type");
        LiquorService liquorService = new LiquorService();
        LiquorType lType = LiquorType.valueOf(liquorType);
        List liquorBrands = liquorService.getAvailableBrands(lType);
        int liquorCount = liquorService.getBrandStock(lType);

        request.setAttribute("quantity", liquorCount);

        request.setAttribute("brands", liquorBrands);
        RequestDispatcher view = request.getRequestDispatcher("results.jsp");
        view.forward(request, response);
    }

}
