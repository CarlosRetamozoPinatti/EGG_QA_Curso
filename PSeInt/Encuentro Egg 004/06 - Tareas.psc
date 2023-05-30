Algoritmo Tareas
	
	Definir cantidadEmails, solicitudesEjecutivos Como Entero
	Definir tieneSolicitudEmergencia Como Entero
	Definir usuarioAdministrador Como Cadena
	
	
	Escribir "Ingrese el usuario de administrador:"
	Leer usuarioAdministrador
	
	Si usuarioAdministrador == "admin"
		
		Escribir "Ingrese la cantidad de emails sin leer:"
		Leer cantidadEmails
		
		Escribir "Ingrese la cantidad de solicitudes de ejecutivos:"
		Leer solicitudesEjecutivos
		
		Escribir "¿Hay alguna solicitud de emergencia de otro departamento? (Sí=1, No=0):"
		Leer tieneSolicitudEmergencia
		
		Escribir "Tareas a realizar:"
	
			Escribir "1. Completar la hoja de cálculo de ingresos mensuales"
			Escribir "2. Revisar correo electrónico"
		Si cantidadEmails < 10 entonces
			Escribir "   2.1 Leer correos"
		FinSi
		Si tieneSolicitudEmergencia == 1 entonces
			Escribir "   2.2 Atender solicitud de emergencia de otro departamento"
		FinSi
		Escribir "   2.3 Revisar correo de voz para ver si hay alguna solicitud de los ejecutivos"
			Si solicitudesEjecutivos > 0 entonces
				Escribir "   2.4 Atender solicitudes de los ejecutivos"
		FinSi
		Escribir "3. Regar la planta de mi escritorio después de apagar la computadora"
		Escribir "4. Enviar correo electrónico de actualización a compañero de trabajo"
		Escribir "5. Disfrutar del almuerzo que me deben"
	SiNo
		Escribir "Usted no tiene permisos"
	FinSi
	
FinAlgoritmo
