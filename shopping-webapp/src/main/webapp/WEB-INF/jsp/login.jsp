Bienvenido

				<li> <a href="home/dashboard">Mantenimiento Persona</a> </li>

				
<form action="<%=request.getContextPath()%>/j_spring_security_check" method="post" autocomplete="off">
<label>Ingrese:</label>
<input type="text" name="j_username" id="username" placeholder="Usuario"/>
<input type="text" name="j_password" id="password" placeholder="Clave"/>
<input type="submit" name="submit" value="Ingresar"/>
</form>