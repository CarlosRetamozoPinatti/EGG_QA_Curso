Algoritmo ValidacionDeNotas
	
	Definir nota1, nota2, nota3 como Entero
	Definir notasCorrectas como Logico
	
	Escribir "Ingrese la primera nota:"
	Leer nota1
	
	Escribir "Ingrese la segunda nota:"
	Leer nota2
	
	Escribir "Ingrese la tercera nota:"
	Leer nota3
	
	Si nota1 >= 1 y nota1 <= 10 y nota2 >= 1 y nota2 <= 10 y nota3 >= 1 y nota3 <= 10 entonces
		notasCorrectas <- Verdadero
		Escribir "Las 3 notas son correctas"
	Sino
		notasCorrectas <- Falso
		Escribir "Al menos una nota es incorrecta"
	FinSi
	
FinAlgoritmo

