<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>



<display:table name="encuestas" id="row" requestURI="${requestURI}"
	class="table table-responsive table-striped">
	<%-- keepStatus="true" pagesize="5">  --%>


	<spring:message code="referemdum_*nombre" var="nombreColumn"></spring:message>
	<display:column property="nombre" title="${nombreColumn}" />

	<display:column property="idVotacionRecuento" title="${nombreColumn}" />
	<display:column property="idVotacionModificacion"
		title="${nombreColumn}" />





	<spring:message code="resultados_*ver" var="verColumn"></spring:message>
	<display:column title="${verColumn}">

		<a href="resultados/ver.do?id=${row.id}"> <spring:message
				code="resultados_*ver" />
		</a>

	</display:column>
</display:table>