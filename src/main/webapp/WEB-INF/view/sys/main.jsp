<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>大连海事大学</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="author" content="SuggeElson" />
        <meta name="description" content="sprFlat admin template - new premium responsive admin template. This template is designed to help you build the site administration without losing valuable time.Template contains all the important functions which must have one backend system.Build on great twitter boostrap framework"/>
        <meta name="keywords" content="admin, admin template, admin theme, responsive, responsive admin, responsive admin template, responsive theme, themeforest, 960 grid system, grid, grid theme, liquid, jquery, administration, administration template, administration theme, mobile, touch , responsive layout, boostrap, twitter boostrap"/>
        <meta name="application-name" content="sprFlat admin template" />
        <link rel='stylesheet' type='text/css' href="http://fonts.googleapis.com/css?family=Open+Sans:400,700|Droid+Sans:400,700" />
        <link href="${pageContext.request.contextPath}/res/sprflatV14/assets/css/icons.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/res/sprflatV14/assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/res/bootstrap-3.3.7/css/bootstrap.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/res/sprflatV14/assets/css/plugins.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/res/sprflatV14/assets/css/main.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/res/sprflatV14/assets/css/custom.css" rel="stylesheet" />
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/res/sprflatV14/assets/img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/res/sprflatV14/assets/img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/res/sprflatV14/assets/img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/res/sprflatV14/assets/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="${pageContext.request.contextPath}/res/sprflatV14/assets/img/ico/favicon.ico" type="image/png">
        <meta name="msapplication-TileColor" content="#3399cc" />
    </head>
    <body>
       <div id="header">
           <div class="container-fluid">
               <div class="navbar">
                   <div class="navbar-header">
                       <a class="navbar-brand" href="#" tppabs="index.html">
                           <i class="im-windows8 text-logo-element animated bounceIn"></i><span class="text-logo">海事</span><span class="text-slogan">大学</span> 
                       </a>
                   </div>
                   <nav class="top-nav" role="navigation">
                       <ul class="nav navbar-nav pull-left">
                           <li id="toggle-sidebar-li">
                               <a href="#" id="toggle-sidebar"><i class="en-arrow-left2"></i></a>
                           </li>
                       </ul>
                       <ul class="nav navbar-nav pull-right">
                          <%--  <li class="dropdown">
                               <a href="#" data-toggle="dropdown"><img class="user-avatar" src="http://ecard.dlmu.edu.cn/ecard/photo/${currUser.userName}.jpg" tppabs="assets/img/avatars/48.jpg" alt="SuggeElson"></a>
                           </li> --%>
                       </ul>
                   </nav>
               </div>
           </div>
       </div>
       <div id="sidebar">
           <div class="sidebar-inner">
           <%@ include file="leftMenu.jsp" %> 
           </div>
       </div>
        <div id="content">
            <!-- Start .content-wrapper -->
            <div class="content-wrapper" id="content-wrapper">
            </div>
            <div class="clearfix"></div>
        </div>
		<div class="modal fade" id="loading" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop='static'>
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body">
		        	请稍候。。。
		      </div>
		    </div>
		  </div>
		</div>
        <!-- End #content -->      
        <!-- Javascripts -->
        <!-- Load pace first -->
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/core/pace/pace.min.js"></script>
        <script src="${pageContext.request.contextPath}/res/jquery/jquery-2.1.1.min.js"  charset="UTF-8"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/js/libs/jquery-ui-1.10.4.min.js" ></script>
        <script src="${pageContext.request.contextPath}/res/bootstrap-3.3.7/js/bootstrap.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/js/jRespond.min.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/core/slimscroll/jquery.slimscroll.min.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/forms/autosize/jquery.autosize.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/ui/bootbox/bootbox.js"></script>
    	<script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/forms/tinymce/tinymce.min.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/misc/highlight/highlight.pack.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/misc/countTo/jquery.countTo.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/ui/weather/skyicons.js" ></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/ui/notify/jquery.gritter.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/plugins/ui/calendar/fullcalendar.js"></script> 
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/js/jquery.sprFlat.js"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/js/ui.js" charset="UTF-8"></script>
        <script src="${pageContext.request.contextPath}/res/sprflatV14/assets/js/app.js"></script>
    </body>
</html>