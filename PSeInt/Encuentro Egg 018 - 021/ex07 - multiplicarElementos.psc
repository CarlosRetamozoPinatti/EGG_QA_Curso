Funcion producto = mult(v, t)
	Definir i, producto Como Entero
	producto = 1
	Para i = 0 Hasta t - 1 Hacer
		producto = producto * v[i]
	FinPara
FinFuncion

Funcion llenarV(v, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1
		v[i] = Aleatorio(01,99)
	FinPara
FinFuncion

Funcion mostrarV(v, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1
		Escribir "v[", i, "]: ", v[i]
	FinPara
FinFuncion

Algoritmo multiplicarElementos
	Definir numV, n, i, producto Como Entero
	
	n = Aleatorio(1,9)
	Escribir "Dimensionando el vector -> numV[", n, "]"
	Dimension numV[n]
	Escribir "Ejecutando subprocesos.."
	llenarV(numV, n)
	mostrarV(numV, n)
	
	Escribir "el producto es: " mult(numV, n)
	
	
FinAlgoritmo
