<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

lista de ticket

<br>
<a href="frmTicket">Nuevo ticket</a>
<br>
<display:table name="${listTicket}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Fecha Inicio" property="dateIniString" />
	<display:column title="Fecha Fin" property="dateEnString" />
	<display:column title="cliente Id" property="customerId" />
	<display:column title="estado" property="statusTicket.description" />
	<display:column title="OPC">
		<a href="editTicket?id=${item.id}">Modificar</a>
		<a href="deleteTicket?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>