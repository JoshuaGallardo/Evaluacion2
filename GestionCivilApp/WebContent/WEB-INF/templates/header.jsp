<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion de Registro Civil </title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet" />
</head>
<body>
	<header>
		<nav class="navbar has-background-primary" role="navigation" aria-label="main navigation">
			<div class="navbar-brand">
				<a class="navbar-item" href="index.jsp"> 
				</a> <a role="button" class="navbar-burger" aria-label="menu"
					aria-expanded="false" data-target="navbarBasicExample"> <span
					aria-hidden="true"></span> <span aria-hidden="true"></span> <span
					aria-hidden="true"></span>
				</a>
			</div>

			<div id="navbarBasicExample" class="navbar-menu">
				<div class="navbar-start">
					<a class="navbar-item"> Index </a> 

					<div class="navbar-item has-dropdown is-hoverable">
						<a class="navbar-link"> Solicitud de Cédula </a>

						<div class="navbar-dropdown">
							<a class="navbar-item" href="IngresarSolicitudController.do"> Ingresar Solicitud </a> 
							<a class="navbar-item" href="AtenderSolicitudController.do"> Atender Solicitud </a> 
					
						</div>
					</div>
				</div>
			</div>
		</nav>
	</header>