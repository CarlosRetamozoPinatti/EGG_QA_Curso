Funcion retorno = dist(n1,n2)
	Definir retorno Como Entero
	retorno = n2 - n1
FinFuncion

Funcion llenarV(v, t)
	Definir i, num Como Entero
	Para i = 0 Hasta t - 1
		Escribir "Ingrese un numero"
		leer num
		v[i] = num
	FinPara
FinFuncion

Funcion mostrarV(v, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1
		Escribir "v[", i, "]: ", v[i]
	FinPara
FinFuncion

Algoritmo distanciaEntreValores
	Definir numV, n, i, min, max Como Entero
	
	n = Aleatorio(1,9)
	Escribir "Dimensionando el vector -> numV[", n, "]"
	Dimension numV[n]
	Escribir "Ejecutando subprocesos.."
	llenarV(numV, n)
	mostrarV(numV, n)
	
	min = numV[0]
	max = numV[0]
	Para i = 0 Hasta n - 1
		Si numV[i] < min Entonces
			min = numV[i]
		FinSi
		Si numV[i] > max Entonces
			max = numV[i]
		FinSi
	FinPara
	Escribir "La distancia entre el valor mínimo (", min, ") y el valor máximo (", max, ") es: " dist(min,max)
FinAlgoritmo
