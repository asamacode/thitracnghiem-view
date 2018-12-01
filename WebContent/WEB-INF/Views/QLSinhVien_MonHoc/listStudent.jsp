<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<t:WrapperAdmin>
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">
					<div class="row">
						<div class="col-md-3">
							<h5 class="card-title">Danh sách Sinh viên</h5>
						</div>
						<div class="col-md-3">
							<a class="btn btn-success" href="./addStudent.jsp"> <i
								class="fa fa-plus"></i> Thêm sinh viên
							</a>
						</div>
						<div class="navbar navbar-light">
							<a class="navbar-brand"> Navbar </a>
							<form class="form-inline">
								<input class="form-control " type="search"
									placeholder="Tìm kiếm .." aria-label="Search">
								<button class="btn btn-outline-success  py-2 my-sm-0"
									type="submit">
									<i class="fa fa-search"></i>
								</button>
							</form>
						</div>
					</div>
				</div>
				<div class="card-body">
					<div class="row justify-content-center">
						<div class="col-md-8">
							<select class="custom-select" id="inputGroupSelect01" onchange="location = this.value;">
								<option selected>Chọn lớp ...</option>

								<c:forEach items="${lsCourses}" var="item">
									<option value="${pageContext.request.contextPath}/ListStudent?idCourse=${item.courseId}">${item.courseId}----${item.subjectIdObject.subjectName}-----${item.dateOfStarting}-----${item.dateOfWeek}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="table-responsive">
						<table class="table">
							<thead class=" text-primary">
								<tr>
									<th width="2%"><input type="checkbox"
										aria-label="Radio button for following text input"></th>
									<th width="8%">Mã SV</th>
									<th width="20%">Họ tên</th>

									<th width="10%">Ngành</th>
									<th width="10%">Lớp</th>
									<th width="10%">Khóa</th>
									<th>Ngày thêm</th>
									<th class="20%">Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list}" var="item">

									<tr>
										<td><input type="checkbox"
											aria-label="Radio button for following text input"></td>
										<td>${item.studentId}</td>
										<td>${item.name}</td>
										<td>${item.name}</td>
										<td>161101</td>
										<td>2016</td>
										<td>2/2/2018 15:30 GMT</td>
										<td>
											<button class="btn btn-success" data-toggle="modal"
												data-target="#modalStudent">
												<i class="fa fa-eye"></i>
											</button> <a href="./editStudent.jsp" class="btn btn-warning"><i
												class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal"
												data-target="#modalConfirmDeleting">
												<i class="fa fa-trash"></i>
											</button>
										</td>
									</tr>

								</c:forEach>


							</tbody>
						</table>
						<nav aria-label="Page navigation example">
							<ul class="pagination justify-content-center">
								<li class="page-item disabled"><a class="page-link"
									href="#" tabindex="-1">Previous</a></li>
									<c:forEach var="i" begin="1" end="${numberPage}">
										<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/ListStudent?page=${i}">${i}</a></li>
									</c:forEach>
								<li class="page-item"><a class="page-link" href="#">Next</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>

	</div>
</t:WrapperAdmin>