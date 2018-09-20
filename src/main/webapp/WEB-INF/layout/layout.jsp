<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Expires" CONTENT="0">
<meta http-equiv="Cache-Control"
	CONTENT="no-cache, no-store, must-revalidate, pre-check=0, post-check=0, max-age=0, s-maxage=0">
<meta http-equiv="Pragma" CONTENT="no-cache">

<title><tiles:getAsString name="title" ignore="true" /></title>
<!-- Bootstrap CSS -->
  <link href="${contextPath}/resources/ui/css/bootstrap.min.css" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="${contextPath}/resources/ui/css/bootstrap-theme.css" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="${contextPath}/resources/ui/css/elegant-icons-style.css" rel="stylesheet" />
  <link href="${contextPath}/resources/ui/css/font-awesome.min.css" rel="stylesheet" />
  <!-- full calendar css-->
  <link href="${contextPath}/resources/ui/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
  <link href="${contextPath}/resources/ui/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
  <!-- easy pie chart-->
  <link href="${contextPath}/resources/ui/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen" />
  <!-- owl carousel -->
  <link rel="stylesheet" href="${contextPath}/resources/ui/css/owl.carousel.css" type="text/css">
  <link href="${contextPath}/resources/ui/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
  <!-- Custom styles -->
  <link rel="stylesheet" href="${contextPath}/resources/ui/css/fullcalendar.css">
  <link href="${contextPath}/resources/ui/css/widgets.css" rel="stylesheet">
  <link href="${contextPath}/resources/ui/css/style.css" rel="stylesheet">
  <link href="${contextPath}/resources/ui/css/style-responsive.css" rel="stylesheet" />
  <link href="${contextPath}/resources/ui/css/xcharts.min.css" rel=" stylesheet">
  <link href="${contextPath}/resources/ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">

</head>
<body>
	<section id="container" class="">
	</section>
	<%-- <div id="wrapper">
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			<!-- nav bar Header Content -->
			<tiles:insertAttribute name="header" />
		</nav>
		<div class="navbar-default sidebar" role="navigation" style="margin-top: 0">
			<!-- side menu content -->
			<div class="sidebar-nav navbar-collapse">
				<tiles:insertAttribute name="menu"/>
			</div>
		</div>
		<div id="page-wrapper">
		<!-- Body Content -->
		 <tiles:insertAttribute name="body"/>
		</div>
		<%-- <div class="panel-footer">
			<tiles:insertAttribute name="footer"/>
		</div> --%>
	</div> --%>
	<!-- javascripts -->
  <script src="${contextPath}/resources/ui/js/jquery.js"></script>
  <script src="${contextPath}/resources/ui/js/jquery-ui-1.10.4.min.js"></script>
  <script src="${contextPath}/resources/ui/js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript" src="${contextPath}/resources/ui/js/jquery-ui-1.9.2.custom.min.js"></script>
  <!-- bootstrap -->
  <script src="${contextPath}/resources/ui/js/bootstrap.min.js"></script>
  <!-- nice scroll -->
  <script src="${contextPath}/resources/ui/js/jquery.scrollTo.min.js"></script>
  <script src="${contextPath}/resources/ui/js/jquery.nicescroll.js" type="text/javascript"></script>
  <!-- charts scripts -->
  <script src="${contextPath}/resources/ui/assets/jquery-knob/js/jquery.knob.js"></script>
  <script src="${contextPath}/resources/ui/js/jquery.sparkline.js" type="text/javascript"></script>
  <script src="${contextPath}/resources/ui/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
  <script src="${contextPath}/resources/ui/js/owl.carousel.js"></script>
  <!-- jQuery full calendar -->
  <<script src="${contextPath}/resources/ui/js/fullcalendar.min.js"></script>
    <!-- Full Google Calendar - Calendar -->
    <script src="${contextPath}/resources/ui/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="${contextPath}/resources/ui/js/calendar-custom.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="${contextPath}/resources/ui/js/jquery.customSelect.min.js"></script>
    <script src="${contextPath}/resources/ui/assets/chart-master/Chart.js"></script>

    <!--custome script for all page-->
    <script src="${contextPath}/resources/ui/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="${contextPath}/resources/ui/js/sparkline-chart.js"></script>
    <script src="${contextPath}/resources/ui/js/easy-pie-chart.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery-jvectormap-world-mill-en.js"></script>
    <script src="${contextPath}/resources/ui/js/xcharts.min.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery.autosize.min.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery.placeholder.min.js"></script>
    <script src="${contextPath}/resources/ui/js/gdp-data.js"></script>
    <script src="${contextPath}/resources/ui/js/morris.min.js"></script>
    <script src="${contextPath}/resources/ui/js/sparklines.js"></script>
    <script src="${contextPath}/resources/ui/js/charts.js"></script>
    <script src="${contextPath}/resources/ui/js/jquery.slimscroll.min.js"></script>
	<script>
      //knob
      $(function() {
        $(".knob").knob({
          'draw': function() {
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
        $("#owl-slider").owlCarousel({
          navigation: true,
          slideSpeed: 300,
          paginationSpeed: 400,
          singleItem: true

        });
      });

      //custom select box

      $(function() {
        $('select.styled').customSelect();
      });

      /* ---------- Map ---------- */
      $(function() {
        $('#map').vectorMap({
          map: 'world_mill_en',
          series: {
            regions: [{
              values: gdpData,
              scale: ['#000', '#000'],
              normalizeFunction: 'polynomial'
            }]
          },
          backgroundColor: '#eef3f7',
          onLabelShow: function(e, el, code) {
            el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
          }
        });
      });
    </script>

</body>
</html>