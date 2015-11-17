<%--
 * index.jsp
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>



<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script type="text/javascript" src="scripts/js/estadisticas.js"></script>
<script type="text/javascript">
	function setQuestionsMenuId(id) {
		var urlDatos = "/Frontend-Resultados/rest/getVotacion.do?idVotacion="
				+ id;

		$.getJSON(urlDatos).done(
				function(data) {
					submenu = create_submenu($("#available_questions"));
					$.each(data, function(k, v) {
						append_element_to_submenu(submenu, v[0],
								"javascript:setDatos(" + parseInt(v[1], "10")
										+ ", " + parseInt(v[2], 10) + ")");
					});
				});
	}

	function setDatos(numYes, numNo) {
		datos = [ [ "Si", numYes ], [ "No", numNo ] ];
		pie(datos);
	}

	var urlVotaciones = "/CreacionAdminVotaciones/vote/mine.do";
	var datos = [];
</script>
<script src="scripts/js/highcharts.js"></script>
<script src="scripts/js/highcharts-3d.js"></script>
<script src="scripts/js/modules/exporting.js"></script>
<script src="scripts/js/dropdown.js"></script>

<!-- activar el modulo de menu desplegable en el bloque
	     'available_votings' -->
<script type="text/javascript">
	$(function() {
		$.getJSON(urlVotaciones).done(
				function(data) {
					submenu = create_submenu($("#available_votings"));
					$.each(data, function(k, v) {
						append_element_to_submenu(submenu, v["title"],
								"javascript:setQuestionsMenuId(" + v["id"]
										+ ")");
					});
				});
	});
</script>


<input type="hidden" value="Estadisticas" id="name_e" />
<header>
	<div id="cabecera">
		<img src="images/img/agora_house.png" alt="">
		<h3>Una nueva forma de</h3>
		<h1>Tomar decisiones en grupo</h1>
		<p>Agora@US es un sistema software libre ideal para votaciones
			seguras online donde participan cientos o miles de personas:
			primarias abiertas, elecciones institucionales, consultas ciudadanas,
			referéndums. Proveemos soluciones profesionales de innovación
			democrática</p>
	</div>
</header>

<div id="cuerpo">
	<div id="ullist">
		<ul class="menu_row">
			<li id="available_votings"
				onmouseover="unset_hide_timeout($(this)); show_submenu($(this));"
				onmouseout="set_hide_timeout($(this));"><a
				href="javascript:void(0)"
				onmouseover="unset_hide_timeout($(this).parent());"
				onmouseout="set_hide_timeout($(this).parent());"> Votaciones </a></li>
			<li id="available_questions"
				onmouseover="unset_hide_timeout($(this)); show_submenu($(this));"
				onmouseout="set_hide_timeout($(this));"><a
				href="javascript:void(0)"
				onmouseover="unset_hide_timeout($(this).parent());"
				onmouseout="set_hide_timeout($(this).parent());"> Preguntas </a></li>
		</ul>
	</div>
	<section id="seccion">
		<article id="container"></article>
	</section>
	<aside id="menu">
		<ul>
			<li onclick="pie(datos);">Tarta</li>
			<li onclick="pie3d(datos);">Tarta 3D</li>
			<li onclick="column(datos);">Columnas</li>
			<li onclick="semicircle(datos);">Semi Circulo</li>
		</ul>
	</aside>
	<footer id="pie"> Derechos Reservados &copy; 2014-2015 </footer>
</div>

