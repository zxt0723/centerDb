<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>校区管理</h2>

<div class="operate panel panel-default">
	<div class="panel-body">
		<div class="pull-left">
			<ul class="nav nav-pills">
				<li></li>
			</ul>
		</div>
		<div class="pull-right">
			<a href="${pageContext.request.contextPath}/building/schoolArea/edit" target="navTab" class="btn btn-sm btn-primary">添加校区</a>
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
					<th class="text-center">序号</th>
					<th class="text-center">校区名称</th>
					<th class="text-center">负责人职工编号</th>
					<th class="text-center">地址</th>
					<th class="text-center">电话</th>
					<th class="text-center">传真</th>
					<th class="text-center">操作</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${xqList}" var="item" varStatus="status">
					<tr>
						<td class="text-center"><span class="num">${status.index + 1}</span></td>
						<td>${item.xqmc}</td>
						<td class="text-center">${item.xqfzrzgh}</td>
						<td>${item.xqdz}</td>
						<td class="text-center">${item.xqlxdh}</td>
						<td class="text-center">${item.xqczdh}</td>
						<td class="text-center">
							<a href="${pageContext.request.contextPath}/building/schoolArea/del?id=${item.wid}"
							 target="navTab" class="btn btn-default">查看</a> 
							 <a href="${pageContext.request.contextPath}/building/schoolArea/edit?id=${item.wid}"
							 target="navTab"  class="btn btn-default">修改</a> 
							 <a	href="${pageContext.request.contextPath}/building/schoolArea/del?id=${item.wid}"
							target="ajaxTodo" title="确定要删除吗？" class="btn btn-default">删除</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>


	</div>
	<!-- col-lg-12 end here -->
</div>