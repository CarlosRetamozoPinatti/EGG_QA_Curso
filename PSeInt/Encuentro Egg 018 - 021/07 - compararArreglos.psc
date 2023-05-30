Funcion rellenarArreglo(v1, v2, t)
	Definir i Como Entero
	
	Para  i = 0 Hasta t - 1 Hacer
		v1[i] = Azar(10)
		v2[i] = Azar(10)
		Escribir "Vector 1 posicion " i " es " v1[i] " Vector 2 posicion " i " es " v2[i]
	FinPara
FinFuncion

Funcion retorno = comparar(v1, v2, t)
	Definir retorno Como Logico
	Definir i Como Entero
	
	retorno = Verdadero
	
	Para i = 0 Hasta t - 1
		retorno = retorno y v1[i] == v2[i]
	FinPara
	
FinFuncion

Algoritmo compararArreglos
	Definir v1, v2, t Como Entero
	
	Escribir "Defina el tamaño de los vectores/arreglos: "
	Leer t
	
	Dimension v1[t], v2[t]
	rellenarArreglo(v1,v2,t)
	
	Si comparar(v1,v2,t)
		Escribir "Los arreglos son iguales"
	SiNo
		Escribir "Los vectores no son iguales"
	FinSi
	
FinAlgoritmo
