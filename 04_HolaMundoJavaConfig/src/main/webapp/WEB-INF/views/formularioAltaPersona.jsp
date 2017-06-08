<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="formulario.alta.persona.titulo"/></title>
</head>
<body>

	${mensaje}

	<form:form modelAttribute="persona" method="POST">
	
		<form:errors path="*" cssClass="pepito"/>	
		<spring:message code="formulario.alta.pesona.campo" arguments="Nombre"/>
		<form:errors path="nombre" cssClass="pepito"/>
		<form:input path="nombre"/>
		<form:errors path="fechaNacimiento" cssClass="pepito"/>
		<form:input path="fechaNacimiento"/>
		<form:errors path="dni" cssClass="pepito"/>
		<form:input path="dni"/>
		<input type="submit">
	</form:form>
	
	<form action="/04_HolaMundoJavaConfig/Persona/Alta" method="POST">
		<input id="nombre" name="nombre" type="text" value="${persona.nombre}">
		<input id="fechaNacimiento" name="fechaNacimiento" type="date" value="${persona.fechaNacimiento}">
		<input id="dni" name="dni" type="number" value="${persona.dni}">
		<input type="submit">
	</form>

</body>
</html>