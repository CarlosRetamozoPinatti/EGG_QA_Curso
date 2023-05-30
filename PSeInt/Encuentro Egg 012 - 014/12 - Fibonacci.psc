SubProceso retorno = calcularFibo(num)
	Definir retorno Como Entero
	retorno = 0
	
	si num > 1
		retorno = calcularFibo(num - 1) + calcularFibo(num - 2)
	SiNo
		retorno = num
	FinSi
FinSubProceso

Algoritmo Fibonacci
	Definir num Como Entero
	
	Escribir "En que nivel de la secuencia de Fibonacci desea pararse?"
	Leer num
	
	Escribir calcularFibo(num)
	
FinAlgoritmo
