<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
	<div class="columns is centered">
		<div class="column is-6">
			<form method="POST" action="AtenderSolicitudController.do">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title">Ingresar Solicitud</span>
					</div>
					<div class="card-content">
						<div class=field>
							<label class="label" for="rut-txt">Rut de Cliente</label>
							<div class="control">
								<input type="text" class="input" id="rut-txt" name="rut-txt" />
							</div>
						</div>

						<div class=field>
							<label class="label" for="nombre-txt">Nombre de Cliente</label>
							<div class="control">
								<input type="text" class="input" id="nombre-txt"
									name="nombre-txt" />
							</div>
						</div>

						<div class="field">
							<label class="label" for="solicitud-select"> Tipo de Solicitud </label>
							<div class="control">
								<div class="select">
									<select name="solicitud-select" id="solicitud-select">
										<option>Solicitud de Cédula de Identidad</option>
										<option>Retiro de Cédula de identidad</option>
										<option>Solicitud de Certificado de Nacimiento</option>
										<option>Solicitud de Certificado de Defunción</option>
									</select>
								</div>
							</div>
						</div>
					</div>
					<div class="card-footer has-text-centered">
						<div class="card-footer-item">
							<button type="submit" class="button is-info">Ingresar Solicitud</button>
						</div>
					</div>
				</div>
			</form>
		</div>

	</div>
</main>

</body>
</html>