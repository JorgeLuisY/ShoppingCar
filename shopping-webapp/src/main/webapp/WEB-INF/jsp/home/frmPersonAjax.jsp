<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<script type="text/javascript">
function savePerson(){
	var id = $("#id").val();
	var name = $("#name").val();
	var lastNameF = $("#lastNameF").val();
	var lastNameM = $("#lastNameM").val();
	var numDocument = $("#numDocument").val();
	
	$.ajax({
	    type: "POST",
	    url: "../homeAjax/savePerson",  
	    data: "id=" + idPerson+"&name="+name+"&lastNameF="+lastNameF
	    ,
	    success: function(response){
			$('#frmPersonDiv').html(response);
	    } 
	});	
}
</script>


<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2"></div>
		<div class="span10">


			<legend>Formulario Persona : ${opc}</legend>
			<form:form commandName="person" action="savePerson" method="POST">
				<form:hidden path="id" id="id"/>
				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="name" id="name" />
						<td />
					</tr>
					<tr>
						<td>Apellido Paterno:</td>
						<td><form:input path="lastNameF" id="lastNameF" />
						<td />
					</tr>
					<tr>
						<td>Apellido Materno:</td>
						<td><form:input path="lastNameM" id="lastNameM" />
						<td />
					</tr>
					<tr>
						<td>Tipo Documento</td>
						<td><form:select path="typeDocument.typeCode" id="typeDocument">
								<option value="">Seleccione</option>
								<form:options items="${typeDocument}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
					<tr>
						<td>Numero de Documento:</td>
						<td><form:input path="numDocument" id="numDocument" />
						<td />
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusPerson.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusPerson}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>

					<tr>
						<td colspan="2"><button type="button" onclick="javascript:savePerson();" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

			</form:form>


		</div>
	</div>
</div>


