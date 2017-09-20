<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka


<script>
$(function() {
    $( "#namePerson" ).autocomplete({
      source: function(request, response){
			
			$.ajax({
				url: "../homeAjax/searchPerson",
				dataType: "json",
				data : "name="+$( "#namePerson" ).val()
				,
				success: function( data ) {
					response( $.map( data, function( item ) {
						return {
							key: item.id,
							label: item.nameAll.toString().replace(new RegExp('('+request.term+')','i'),'<strong>$1</strong>'),
							value: item.nameAll
						}
					}));
				}
			});
		},
		minLength: 2 ,
		select: function (event, ui) {
            $('#idPerson').val(ui.item.key);
        } ,		
		open: function() {
			$( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
		} 
	}).data( "autocomplete" )._renderItem = function( ul, item ) {
    return $( "<li></li>" )
        .data( "item.autocomplete", item )
        .append( '<a href="#"><span class="tag">' + item.label + "</span></a>" )
        .appendTo( ul );
	};	
	
});

function editPerson(idPerson) {
	// metodos javascript
	$.ajax({
	    type: "POST",
	    url: "../homeAjax/editPerson",  
	    data: "id=" + idPerson
	    ,
	    success: function(response){
			$('#frmPersonDiv').html(response);
	    } 
	});
}

</script>


<table>
	<tr>
		<td>Buscar Persona:</td>
		<td>
		
		<input type="text" class="search-query"  id="namePerson" placeholder="Buscar">
		<input type="text" class="search-query"  id="idPerson" >
		
		</td>
		
		
	</tr>
</table>


<br>
<a href="frmPerson">Nueva Persona</a>
<br>
<display:table name="${listPerson}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombres" property="name" />
	<display:column title="Ape Paterno" property="lastNameM" />
	<display:column title="Tipo Documento" property="typeDocument" />
	<display:column title="Tipo Documento DESC" property="typeDocument.description" />
	<display:column title="Numero Documento" property="numDocument" />
	<display:column title="Estado" property="statusPerson.description" />
	<display:column title="OPC">
		<a href="#" onclick="javascript:editPerson('${item.id}');">Modificar Ajax</a>
		<a href="editPerson?id_=${item.id}">Modificar</a>
		<a href="deletePerson?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>

<div id="frmPersonDiv">
</div>


