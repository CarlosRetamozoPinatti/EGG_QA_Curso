Algoritmo InformesClaves
	
	Definir N, i, integrador, contador_integrador, mayor_exposicion, nota_parcial, contador_parcial Como Entero
	Definir nota_final, promedio, promedio_reprobados Como Real
	
	Escribir "Ingrese la cantidad de alumnos: "
	Leer N
	
	promedio_reprobados = 0
	contador_integrador = 0
	mayor_exposicion = 0
	contador_parcial = 0
	
	Para i = 1 Hasta N Con Paso 1 Hacer
		Escribir "Ingrese las notas del alumno ", i
		Escribir "Nota del Trabajo Práctico Integrador (35%): "
		Leer integrador
		Escribir "Nota de la Exposición (25%): "
		Leer mayor_exposicion
		Escribir "Nota del Parcial (40%): "
		Leer nota_parcial
		
		nota_final <- (integrador*0.35) + (mayor_exposicion*0.25) + (nota_parcial*0.4)
		
		Si nota_final < 6.5 Entonces
			promedio_reprobados = promedio_reprobados + nota_final
		FinSi
		
		Si integrador > 7.5 Entonces
			contador_integrador <- contador_integrador + 1
		FinSi
		
		Si mayor_exposicion > mayor_exposicion Entonces
			mayor_exposicion <- mayor_exposicion
		FinSi
		
		Si nota_parcial >= 4.0 Y nota_parcial <= 7.5 Entonces
			contador_parcial <- contador_parcial + 1
		FinSi
		
	FinPara
	
	promedio_reprobados <- promedio_reprobados / N
	
	Escribir "El promedio final de los estudiantes que reprobaron el curso es: ", promedio_reprobados
	Escribir "El porcentaje de alumnos con una nota de Integrador mayor a 7.5 es: ", (contador_integrador * 100) / N, "%"
	Escribir "La mayor nota obtenida en las exposiciones es: ", mayor_exposicion
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", contador_parcial
	
FinAlgoritmo
