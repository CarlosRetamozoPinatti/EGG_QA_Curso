Algoritmo Calificaciones
	
	Definir nota1, nota2, nota3, promedio Como Real
	Escribir "Ingrese la primera nota: "
	Leer nota1
	
	Escribir "Ingrese la segunda nota: "
	Leer nota2
	
	Escribir "Ingrese la tercera nota: "
	Leer nota3
	
	promedio = (nota1 + nota2 + nota3) / 3
	
	Si promedio > 100 Entonces
		
		Escribir "Las notas estan mal"
		
	FinSi
	
	Si promedio >= 70 y promedio <= 100 Entonces
		Escribir "El alumno aprobó el curso con un promedio de ", promedio
	Sino
		Escribir "El alumno reprobó el curso con un promedio de ", promedio
	FinSi
	
FinAlgoritmo





