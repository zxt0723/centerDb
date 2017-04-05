<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="http://202.118.87.61:8989/dorm/resource/dorm/css/list-style.css">

<h2>宿舍楼管理</h2>


<div class="operate panel panel-default">

	<form id="pagerForm" method="post" action="http://localhost:8088/centerDb/building/dormBuilding">
		<input type="hidden" name="page.pageNum" value="1" /> <input type="hidden" name="page.numPerPage" value="${model.numPerPage}" /> <input type="hidden" name="page.orderField" value="${param.orderField}" />
		<div class="sub-term" style="margin: 0px auto 0">
			<span> 毕业日期：</span> <span> <input class="detail-input ng-isolate-scope ng-pristine ng-valid" type="text" ng-model="beginDate" cs-datepicker="" maxvalue="endDate" on-change="queryGridContent()" click-id="sd"> <a id="sd" href="javascript:void(0);" class="date-time"></a>- <input class="detail-input ng-isolate-scope ng-pristine ng-valid" type="text" ng-model="endDate" cs-datepicker="" minvalue="beginDate" on-change="queryGridContent()" click-id="ed"> <a id="ed" href="javascript:void(0);" class="date-time"></a>
			</span>
		</div>
		<div class="sushe-sub-header mar-tb ng-isolate-scope" style="border-bottom: 0px; margin: 0;" >
			<div class="sub-term clearfix ng-hide" style="">
				<h4>当前条件：</h4>
				<div style="padding: 0px 80px;">
					<ul style="list-style: none outside none;">
						<!-- ngRepeat: obj in result track by $index -->
					</ul>
				</div>
				<div class="fright">
					<a class="forterm-more" href="javascript:void(0)" ng-click="cancleQueryAll()">清空条件</a>
				</div>
			</div>
			<div style="position: relative; border-bottom: 1px solid #d0dddf;">
				
				<div  class="ng-scope">
					
					<div  class="sub-term clearfix ng-scope" style="">
						<h4 class="ng-binding">性 别：</h4>
						<div style="padding: 0px 80px;">
							<ul style="list-style: none outside none;">
								
								<li class="forterm ng-scope" style="padding: 0px 20px 0px 0px;" ng-show="obj.show" ng-repeat="obj in q.items">
									 <a href="javascript:void(0)" ng-if="!obj.checked" ng-click="change(obj,q)" class="ng-binding ng-scope">男</a> 
								</li>
								<li class="forterm ng-scope" style="padding: 0px 20px 0px 0px;" ng-show="obj.show" ng-repeat="obj in q.items">
									<a href="javascript:void(0)" ng-if="!obj.checked" ng-click="change(obj,q)" class="ng-binding ng-scope">女</a>
									
								</li>
								
								<li style="clear: both;"></li>
							</ul>
						</div>
					</div>					
				</div>
				<div  class="ng-scope">
					<div ng-if="q.queryType == 'comboTree'" class="sub-term clearfix ng-scope" style="">
						<h4 class="ng-binding">组织机构：</h4>
						<div cg-combo-tree="" source="q.items" code="q.queryCode" result="innerTreeResult" style="padding: 0px 80px;" class="ng-isolate-scope">
							<div class="clearfix" style="color: #6b6b6b;">
								<div class="forterm ng-scope" ng-repeat="st in selectTree track by $index" style="padding-right: 5px;"></div>
							</div>
						</div>
					</div>
				</div>
				<div style="position: absolute; right: 10px; top: 7px;" ng-click="expandALL()" ng-show="queryArray.length >= 2" class="">
					<a class="forterm-est" href="javascript:void(0)">高级筛选&nbsp;&nbsp;<span class="est-bg"></span></a>
				</div>
			</div>
		</div>
		<div class="panel-body">
			<div class="pull-left">
				<ul class="nav nav-pills">
					<li></li>

					<li></li>

				</ul>

			</div>
			<div class="pull-right">
				<a href="${pageContext.request.contextPath}/building/dormBuilding/edit" target="navTab" class="btn btn-sm btn-primary">添加宿舍楼</a>
			</div>
		</div>
	</form>
</div>
<div class="row">
	<div class="col-lg-12">
		<!-- col-lg-12 start here -->


		<table id="tabletools" class="table table-striped table-bordered table-hover" cellspacing="0" width="100%">
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
						<td class="text-center"><a href="${pageContext.request.contextPath}/building/dormBuilding/view?id=${item.wid}" target="navTab" class="btn btn-default">查看</a> <a href="${pageContext.request.contextPath}/building/dormBuilding/edit?id=${item.wid}" target="navTab" class="btn btn-default">修改</a> <a href="${pageContext.request.contextPath}/building/dormBuilding/del?id=${item.wid}" target="ajaxTodo" title="确定要删除吗？" class="btn btn-default">删除</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<!-- page start -->
		<div class="panel-body">
			<div class="row">
				<div class="pull-left">
					<div class="dataTables_info" id="tabletools_info" role="status" aria-live="polite">
						<span>显示</span> <select class="combox" name="numPerPage" onchange="pageBreak({numPerPage:this.value})">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select> <span>条，共200条</span>
					</div>
				</div>
				<div class="pull-right">
					<div class="pagination dataTables_paginate paging_bootstrap" totalCount="300" numPerPage="20" pageNumShown="10" currentPage="1"></div>

				</div>
			</div>
		</div>
		<!--page end -->
	</div>
	<!-- col-lg-12 end here -->
</div>
