<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 2</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<form action="/lab34/bai-2/add" method="post" class="container">
    <div class="mb-3">
        <label for="maLoa" class="form-label">Mã Loa:</label>
        <input type="text" class="form-control" id="maLoa" name="maLoa" value="${loa.maLoa}">
    </div>
    <div class="mb-3">
        <label for="tenLoa" class="form-label">Tên Loa:</label>
        <input type="text" class="form-control" id="tenLoa" name="tenLoa" value="${loa.tenLoa}">
    </div>
    <div class="mb-3">
        <label for="congSuat" class="form-label">Công suất:</label>
        <input type="text" class="form-control" id="congSuat" name="congSuat" value="${loa.congSuat}">
    </div>
    <div class="mb-3">
        <label for="mauSac" class="form-label">Màu Sắc:</label>
        <select class="form-select" aria-label="Default select example" id="mauSac" name="mauSac">
            <%--            <option selected>Open this select menu</option>--%>
            <option value="Đỏ" ${loa.mauSac == "Đỏ" ? 'selected' : ""}>Đỏ</option>
            <option value="Hồng" ${loa.mauSac == "Hồng" ? 'selected' : ""}>Hồng</option>
            <option value="Cam" ${loa.mauSac == "Cam" ? 'selected' : ""}>Cam</option>
        </select>
    </div>
    <div class="mb-3">
        <label for="kenhAmThanh" class="form-label">Kênh Âm Thanh:</label>
        <input type="text" class="form-control" id="kenhAmThanh" name="kenhAmThanh" value="${loa.kenhAmThanh}">
    </div>
    <div class="col-md-12 text-center">
        <button type="submit" class="btn btn-success" name="add">Thêm</button>
        <button type="submit" class="btn btn-success" name="update">Sửa</button>
        <a href="http://localhost:27325/lab34/bai-1" class="btn btn-success">Bài 1</a>
    </div>
</form>
<section class="container">
    <table class="table table-striped table-hover text-center">
        <thead>
        <tr>
            <th scope="col">Mã Loa</th>
            <th scope="col">Tên Loa</th>
            <th scope="col">Công Suất</th>
            <th scope="col">Màu Sắc</th>
            <th scope="col">Kênh âm thanh</th>
            <th scope="col">Chức Năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lstLoa}" var="x">
            <tr>
                <td>${x.maLoa}</td>
                <td>${x.tenLoa}</td>
                <td>${x.congSuat}</td>
                <td>${x.mauSac}</td>
                <td>${x.kenhAmThanh}</td>
                <td><a href="/lab34/bai-2/delete/${x.maLoa}" class="btn btn-danger">Xoá</a>
                    <a href="/lab34/bai-2/detail/${x.maLoa}" class="btn btn-info">Detail</a>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>