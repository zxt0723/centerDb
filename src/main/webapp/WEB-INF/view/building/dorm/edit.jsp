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
                                    <h3 class="panel-title">宿舍信息</h3>
                                </div>
                                <div class="panel-body">
                                    <form class="form-horizontal group-border hover-stripped" role="form" method="post" action="${pageContext.request.contextPath}/building/dorm/save" onsubmit="return validateCallback(this, navTabAjaxDone);">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍编号</label>
                                            <div class="col-lg-10">
                                           		<input type="hidden" name="ss.wid"  value="${ss.wid}" >
                                                <input type="text" class="form-control" name="ss.ssbh" required="required"  value="${ss.ssbh}"  placeholder="请填写校区编号">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍楼代码</label>
                                            <div class="col-lg-10">
                                           		<input type="hidden" name="ss.pwid"  value="${ss.pwid}" >
                                                <input type="text" class="form-control" name="ss.ssldm" required="required"  value="${ss.ssldm}"  placeholder="请填写校区编号">
                                            </div>
                                        </div>
                                        
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">楼层</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ss.lc" required="required" value="${ss.lc}" placeholder="请填写校区名称">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">单元</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ss.dy" required="required" value="${ss.dy}" placeholder="请填写校区行政负责人职工号">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">房间号</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ss.fjh" required="required" value="${ss.fjh}" placeholder="请填写校区党委负责人职工号">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">电话</label>
                                            <div class="col-lg-10">
                                               <input type="text" class="form-control" name="ss.dh" required="required" value="${ss.dh}" placeholder="请填写校区邮政编码">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">床位数</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.cws" required="required" value="${ss.cws}" placeholder="请填写校区地址">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">租金</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ss.zj" required="required" value="${ss.zj}" placeholder="请填写校区联系电话">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">房间类型(代码)</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.fjlxdm" required="required" value="${ss.fjlxdm}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                          <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">面向学生层次</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.mxxscc" required="required" value="${ss.mxxscc}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                          <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">面向学生性别代码</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.mxxsxbdm" required="required" value="${ss.mxxsxbdm}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                         <div class="form-group">
                                            <label class="col-lg-2 control-label">是否可用</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.sfkzapzs" required="required" value="${ss.sfkzapzs}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                         <div class="form-group">
                                            <label class="col-lg-2 control-label">朝向</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.cx" required="required" value="${ss.cx}" placeholder="请填写校区传真号码">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                         <div class="form-group">
                                            <label class="col-lg-2 control-label">备注</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ss.bz" required="required" value="${ss.bz}" placeholder="请填写校区传真号码">
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