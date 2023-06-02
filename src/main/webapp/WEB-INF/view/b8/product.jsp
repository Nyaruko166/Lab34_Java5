<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<form class="container">
    <div class="mb-3">
        <label for="tenSanPham" class="form-label">Tên sản phẩm:</label>
        <input type="text" class="form-control" id="tenSanPham" name="tenSanPham" value="${param.tenSanPham}">
    </div>
    <div class="col-md-12 text-center">
        <button type="submit" class="btn btn-success">Search</button>
        <%--        <a href="http://localhost:27325" class="btn btn-success">Trang Chủ</a>--%>
    </div>
</form>
<section class="container">
    <c:if test="${page.isEmpty()}">
        <h2>Not found any record!!</h2>
    </c:if>
    <c:if test="${not page.isEmpty()}">
        <p>Found ${page.getTotalElements()} records</p>
        <table class="table table-striped table-hover text-center">
            <thead>
            <tr>
                <th scope="col">Mã sản phẩm</th>
                <th scope="col">Tên Sản Phẩm</th>
                    <%--            <th scope="col">Price</th>--%>
                    <%--            <th scope="col">Quantity</th>--%>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${page.getContent()}" var="x">
                <tr>
                    <td>${x.maSanPham}</td>
                    <td>${x.tenSanPham}</td>
                        <%--                <td>${x.price}</td>--%>
                        <%--                <td>${x.quantity}</td>--%>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:if test="${page.getNumber() + 1 > 1}">
                <li class="page-item"><a class="page-link"
                                         href="?page=${page.getNumber()}&tenSanPham=${param.tenSanPham}">Previous</a>
                </li>
            </c:if>
            <li class="page-item"><span> ${page.getNumber() + 1} / ${page.getTotalPages()} </span></li>
            <c:if test="${page.getNumber() + 1 lt page.getTotalPages()}">
                <li class="page-item"><a class="page-link"
                                         href="?page=${page.getNumber() + 2}&tenSanPham=${param.tenSanPham}">Next</a>
                </li>
            </c:if>
        </ul>
    </nav>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>