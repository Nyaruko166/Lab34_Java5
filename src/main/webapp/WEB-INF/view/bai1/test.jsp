<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<form action="/lab34/bai-1/test" method="post" class="container">

    <div class="mb-3">
        <label class="form-label">Giảng Viên:</label>
        <div class="row">
            <div class="col-6">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="MinhDQ8" id="flexCheckChecked" checked
                           name="giangVien">
                    <label class="form-check-label" for="flexCheckChecked">
                        MinhDQ8
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="TienNH21" id="flexCheckDefault"
                           name="giangVien">
                    <label class="form-check-label" for="flexCheckDefault">
                        TienNH21
                    </label>
                </div>
            </div>
            <div class="col-6">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="DungNA29" id="flexCheckChecked2"
                           name="giangVien">
                    <label class="form-check-label" for="flexCheckChecked2">
                        DungNA29
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="NguyenVV4" id="flexCheckDefault1"
                           name="giangVien">
                    <label class="form-check-label" for="flexCheckDefault1">
                        NguyenVV4
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-12 text-center">
        <button type="submit" class="btn btn-success">Thêm</button>
        <%--        <a href="http://localhost:27325" class="btn btn-success">Trang Chủ</a>--%>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>