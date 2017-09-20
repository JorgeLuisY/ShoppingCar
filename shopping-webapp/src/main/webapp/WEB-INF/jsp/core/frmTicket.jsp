<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">


			<legend>Formulario Ticket</legend>
			<form:form commandName="ticket" action="saveTicket" method="POST">
				<input type="text" value="${ticket.id}" name="id" id="id"/>
				<input type="text" value="${ticket.version}" name="version" id="version"/>

				<table>
					<tr>
						<td>Fecha Inicio:</td>
						<td><form:input path="dateIniString" id="dateIniString" />
						<td />
					</tr>
					<tr>
						<td>Fecha Fin:</td>
						<td><form:input path="dateEnString" id="dateEnString" />
						<td />
					</tr>
					<tr>
						<td>Cliente:</td>
						<td><form:input path="customerId" id="customerId" />
						<td />
					</tr>
<!-- 					<tr> -->
<!-- 						<td>Tipo Documento</td> -->
<%-- 						<td><form:select path="typeDocument.typeCode"> --%>
<!-- 								<option value="">Seleccione</option> -->
<%-- 								<form:options items="${typeDocument}" itemValue="typeCode" --%>
<%-- 									itemLabel="description" /> --%>
<%-- 							</form:select></td> --%>
<!-- 					</tr> -->
					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>
				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>
				<br>
			</form:form>


		</div>
	</div>
</div>