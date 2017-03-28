<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<h2>校区管理</h2>
<div class="operate panel panel-default">
	<div class="panel-body">
		<div class="pull-left">
			<ul class="nav nav-pills">
				<li></li>
			</ul>
		</div>
		<div class="pull-right">
			<a href="#" id="return" target="navTab" class="btn btn-sm btn-primary">返回</a>
		</div>
	</div>
</div>

                <!-- Page start here ( usual with .row ) -->
                <div class="outlet">
                    <!-- Start .outlet -->
                    <div class="row">
                        <!-- Start .row -->
                        <div class="col-lg-12">
                            <!-- Start col-lg-12 -->
                            <div class="panel panel-default toggle">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h3 class="panel-title">校区信息</h3>
                                </div>
                                <div class="panel-body">
                                    <form class="form-horizontal group-border hover-stripped" role="form" method="post" action="${pageContext.request.contextPath}/building/schoolArea/save" onsubmit="return validateCallback(this, navTabAjaxDone);">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">校区编号</label>
                                            <div class="col-lg-10">
                                           		<input type="hidden" name="xq.wid"  value="${xq.wid}" >
                                                <input type="text" class="form-control" name="xq.xqh" required="required"  value="${xq.xqh}"  placeholder="请填写校区编号">
                                            </div>
                                        </div>
                                        
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">校区名称</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="xq.xqmc" required="required" value="${xq.xqmc}" placeholder="请填写校区名称">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">行政负责人职工号</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="xq.xqfzrzgh" required="required" value="${xq.xqfzrzgh}" placeholder="请填写校区行政负责人职工号">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">党委负责人职工号</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="xq.xqdwfzrzgh" required="required" value="${xq.xqdwfzrzgh}" placeholder="请填写校区党委负责人职工号">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">邮政编码</label>
                                            <div class="col-lg-10">
                                               <input type="text" class="form-control" name="xq.xqyzbm" required="required" value="${xq.xqyzbm}" placeholder="请填写校区邮政编码">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">地址</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="xq.xqdz" required="required" value="${xq.xqdz}" placeholder="请填写校区地址">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">联系电话</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="xq.xqlxdh" required="required" value="${xq.xqlxdh}" placeholder="请填写校区联系电话">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">校区传真</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="xq.xqczdh" required="required" value="${xq.xqczdh}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <div class="col-lg-2 pull-right">
                                                <button class="btn btn-default ml15" type="submit">保存</button>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                    </form>
                                </div>
                            </div>
                            <!-- End .panel -->
                        </div>
                        <!-- End col-lg-12 -->
                    </div>
                    <!-- End .row -->
                    <!-- Page End here -->
                </div>
                <!-- End .outlet -->