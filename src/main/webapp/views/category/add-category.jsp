<%--
  Created by IntelliJ IDEA.
  User: nhatt
  Date: 1/10/2024
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <div class="panel panel-primary">
                <div class="panel-heading mt-5">
                    <h2 class="text-center">ADD NEW CATEGORIES</h2>
                </div>
                <f:form action="/post-category" method="post" modelAttribute="category">
                    <div class="panel-body">
                        <div class="form-group">
                            <label>Name Category:</label>
                            <f:input required="true" type="text" class="form-control" id="user" path="categoryName" />
                        </div>
                        <div class="btn-group" data-toggle="buttons">
                            <label class="btn btn-outline-primary active out-line-0">
                                <f:radiobutton cssClass="btn-outline-none" id=""  value="1" path="status" checked="checked" /> Hoạt động
                            </label>
                            <label class="btn btn-outline-primary ml-2">
                                <f:radiobutton cssClass="btn-outline-none" id=""  value="0" path="status" />Không hoạt động
                            </label>

                        </div>

                    </div>
                    <button type="submit" class="btn btn-success">Submit</button>
                </f:form>
            </div>
        </div>
    </div>

</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
