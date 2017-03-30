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
                                    <h3 class="panel-title">宿舍楼信息</h3>
                                </div>
                                <div class="panel-body">
                                    <form class="form-horizontal group-border hover-stripped" role="form" method="post" id="validate" action="${pageContext.request.contextPath}/building/dormBuilding/save" onsubmit="return validateCallback(this, navTabAjaxDone);">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">校区编号</label>
                                            <div class="col-lg-10">
                                           		<input type="hidden" name="ssl.wid"  value="${ssl.wid}" >
                                                <input type="text" class="form-control" name="ssl.pwid" required="required"  value="${ssl.pwid}"  placeholder="请填写校区编号">
                                            </div>
                                        </div>
                                        
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍楼号</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ssl.sslh" required="required"  maxlength="20" value="${ssl.sslh}" placeholder="请填写校区名称">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍楼名称</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ssl.sslmc" required="required"  maxlength="20" value="${ssl.sslmc}" placeholder="请填写宿舍楼名称">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">管理员</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ssl.gly"   maxlength="20" value="${ssl.gly}" placeholder="请填写宿舍楼的管理员">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">楼管电话</label>
                                            <div class="col-lg-10">
                                               <input type="text" class="form-control" name="ssl.lgdh"  maxlength="12" value="${ssl.lgdh}" placeholder="请填写楼管电话">
                                         
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">楼层数</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.lcs" required="required" min="1" max="30" value="${ssl.lcs}" placeholder="请填写宿舍楼的楼层数">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">管理单位</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="ssl.gldw" maxlength="50" value="${ssl.gldw}" placeholder="请填写宿舍楼的管理单位">
                                         
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍楼类别</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.ssllb" required="required"  value="${ssl.ssllb}" placeholder="请填写宿舍类别">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">建筑物编号</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.jzwbh" maxlength="20" value="${ssl.jzwbh}" placeholder="请填写宿舍楼的建筑编号">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">宿舍区</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.ssqbh" maxlength="20" value="${ssl.ssqbh}" placeholder="请填写宿舍楼所在区域">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">地点</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.dd" maxlength="50" value="${ssl.dd}" placeholder="请填宿舍楼地点">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">基本情况</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.jbqk" maxlength="20" value="${ssl.jbqk}" placeholder="请填写基本情况">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">备注</label>
                                            <div class="col-lg-10">
                                                 <input type="text" class="form-control" name="ssl.bz" maxlength="50" value="${ssl.bz}" placeholder="请填写备注">
                                            </div>
                                        </div>
                                         <!-- End .form-group  -->
                                       
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <div class="col-lg-2 pull-right">
                                                <button class="btn btn-default btn-primary" type="submit">保存</button>
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