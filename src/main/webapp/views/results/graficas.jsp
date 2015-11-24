<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<input id="tituloPregunta" type="hidden"  value="${tituloPregunta}"/>
<input id="numeroSi" type="hidden"  value="${numeroSi}"/>
<input id="numeroNo" type="hidden"  value="${numeroNo}"/>




<html>
  <head>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
    	  var tituloPregunta =parseInt($("#tituloPregunta").val());
          var numeroSi =parseInt($("#numeroSi").val());
          var numeroNo =parseInt($("#numeroNo").val());
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          ['Si',     numeroSi],
          ['No',      numeroNo],
          
        ]);

        var options = {
          title: +tituloPregunta,
          pieHole: 0.4,
        };

        var chart = new google.visualization.PieChart(document.getElementById('donutchart'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="donutchart" style="width: 900px; height: 500px;"></div>
  </body>
</html>