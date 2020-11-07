<%@ page import= "java.util.*"%>
<!DOCTYPE html>
<html lang="en">

<body>
<center>
    <h1>
        Available Brands
    </h1>
    <%
        List results = (List) request.getAttribute("brands");
        int stockQuantity = (int) request.getAttribute("quantity");
        Iterator it = results.iterator();
        out.println("<p>We have </p>");
        while(it.hasNext()){
            out.println("<p>" + it.next() + "</p>");
        }

        out.println("<p>Stock Quantity " + stockQuantity + "</p>");
    %>
</center>
</body>
</html>