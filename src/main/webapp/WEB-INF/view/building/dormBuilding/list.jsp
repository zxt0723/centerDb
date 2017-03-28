<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>宿舍楼管理</h2>

<div class="operate panel panel-default">
	<div class="panel-body">
		<div class="pull-left">
			<ul class="nav nav-pills">
				<li></li>
			</ul>
		</div>
		<div class="pull-right">
			<a href="${pageContext.request.contextPath}/building/dormBuilding/edit" target="navTab" class="btn btn-sm btn-primary">添加宿舍楼</a>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<!-- col-lg-12 start here -->


		<table id="tabletools"
			class="table table-striped table-bordered table-hover"
			cellspacing="0" width="100%">
			<thead>
				<tr>
				
					<th class="text-center">宿舍楼号</th>
					<th class="text-center">宿舍楼名称</th>
					<th class="text-center">管理员</th>
					<th class="text-center">楼管电话</th>
					<th class="text-center">宿舍区</th>
					<th class="text-center">楼层数</th>
					<th class="text-center">宿舍性别</th>
					<th class="text-center">操作</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
					<tr>
						
						<td class="text-center">${item.sslh}</td>
						<td class="text-center">${item.sslmc}</td>
						<td>${item.gly}</td>
						<td class="text-center">${item.lgdh}</td>
						<td class="text-center">${item.ssqbh}</td>
						<td class="text-center">${item.lcs}</td>
						<td class="text-center">${item.ssllb}</td>
						<td class="text-center">
							<a href="${pageContext.request.contextPath}/building/dormBuilding/view?id=${item.wid}"
							 target="navTab" class="btn btn-default">查看</a> 
							 <a href="${pageContext.request.contextPath}/building/dormBuilding/edit?id=${item.wid}"
							 target="navTab"  class="btn btn-default">修改</a> 
							 <a	href="${pageContext.request.contextPath}/building/dormBuilding/del?id=${item.wid}"
							target="ajaxTodo" title="确定要删除吗？" class="btn btn-default">删除</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>


	</div>
	<!-- col-lg-12 end here -->
</div>