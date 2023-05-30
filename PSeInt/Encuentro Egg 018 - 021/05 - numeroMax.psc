Funcion retorno = buscarMax(v, t)
	Definir i, retorno Como Entero
	retorno = v[0]
	Para i = 1 Hasta t - 1 Hacer
		Si v[i] > retorno
			retorno = v[i]
		FinSi
	FinPara
FinFuncion

Algoritmo elMaximo
	Definir num, vect, tam, i Como Entero
	
	Escribir "De cuantos elementos es el arreglo?: "
	Leer tam
	Dimension vect[tam]
	
	Para i = 0 Hasta tam - 1 Hacer
		Escribir "Ingrese un numero: "
		Leer num
		vect[i] = num
		Escribir "[" i "] = " num
	FinPara
	
	Escribir "De todos los numeros ingresados en el arreglo, el mayor es ", buscarMax(vect, tam)
	
FinAlgoritmo
