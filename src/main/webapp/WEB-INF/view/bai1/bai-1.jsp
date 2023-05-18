<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<form action="/lab34/bai-1/add" method="post" class="container">
    <div class="mb-3">
        <label for="maMon" class="form-label">Mã Môn:</label>
        <input type="text" class="form-control" id="maMon" name="maMon">
    </div>
    <div class="mb-3">
        <label for="tenMon" class="form-label">Tên Môn:</label>
        <input type="text" class="form-control" id="tenMon" name="tenMon">
    </div>
    <div class="mb-3">
        <label for="soTinChi" class="form-label">Số Tín Chỉ:</label>
        <input type="text" class="form-control" id="soTinChi" name="soTinChi">
    </div>
    <div class="mb-3">
        <label for="chuyenNganh" class="form-label">Chuyên Ngành:</label>
        <select class="form-select" aria-label="Default select example" id="chuyenNganh" name="chuyenNganh">
            <%--            <option selected>Open this select menu</option>--%>
            <option value="PTPM">Phát Triển Phần Mềm</option>
            <option value="WEB">WEB</option>
        </select>
    </div>
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
    <div class="mb-3">
        <label class="form-label">Bắt Buộc:</label>
        <div class="row">
            <div class="col-6">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="batBuoc" id="flexRadioDefault2" value="true"
                           checked>
                    <label class="form-check-label" for="flexRadioDefault2">
                        Có
                    </label>
                </div>
            </div>
            <div class="col-6">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="batBuoc" id="flexRadioDefault1" value="false"
                           >
                    <label class="form-check-label" for="flexRadioDefault1">
                        Không
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
<section class="container">
    <table class="table table-striped table-hover text-center">
        <thead>
        <tr>
            <th scope="col">Mã Môn</th>
            <th scope="col">Tên Môn</th>
            <th scope="col">Số Tín Chỉ</th>
            <th scope="col">Chuyên Ngành</th>
            <th scope="col">Giảng Viên</th>
            <th scope="col">Bắt Buộc</th>
            <th scope="col">Chức Năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lstMH}" var="x">
            <tr>
                <td>${x.maMon}</td>
                <td>${x.tenMon}</td>
                <td>${x.soTinChi}</td>
                <td>${x.chuyenNganh}</td>
                <td>${x.giangVien}</td>
                <c:if test="${x.batBuoc}">
                    <td>Có</td>
                </c:if>
                <c:if test="${x.batBuoc == false}">
                    <td>Không</td>
                </c:if>
                <td><a href="/lab34/bai-1/delete/${x.maMon}" class="btn btn-danger">Xoá</a></td>
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