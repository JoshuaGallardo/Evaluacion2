<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<jsp:include page="../templates/header.jsp" ></jsp:include>
	<main class="container mt-6">
		<div class="columns is centered">
			<div class="column is-6">
				<form method="POST" action="AtenderSolicitudController.do">
					<div class="card">
						<div class="card-header has-background-primary">
							<span class= "card-header-title">Atender Solicitud</span>
						</div>
						<div class="card-content">
							<div class="field">
								<label class="label" for="solicitud-select"> Tipo de Solicitud </label>
								<div class="control">
									<div class= "select">
										<select name="solicitud-select" id="solicitud-select">
											<option>Solicitud de C?dula de Identidad</option>
											<option>Retiro de C?dula de identidad</option>
											<option>Solicitud de Certificado de Nacimiento</option>
											<option>Solicitud de Certificado de Defunci?n</option>
										</select>
									</div>
								</div>
							</div>
							<div class="field">
								<button type="submit" class="button is-info is-rounded">Filtrar</button>	
							</div>
							<div class="field">
								
							
							</div>
							
						</div>
						
						
					</div>
				</form>
			</div>
			
		</div>
	</main>

</body>
</html>