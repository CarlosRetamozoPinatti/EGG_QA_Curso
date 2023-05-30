Funcion retorno = esMultiplo(num1 Por Referencia, num2 Por Referencia)
	Definir retorno como Logico
	Si num1 MOD num2 = 0 Entonces
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
FinFuncion

Algoritmo Multiplos
	Definir num1, num2 Como Real
	Escribir "Para averiguar si los numeros son multiplos se hace dividendo/divisor = 0"
	Escribir "Ingrese el dividendo: "
	Leer num1
	Escribir "Ingerese el divisor: "
	Leer num2
	
	Si esMultiplo(num1, num2) Entonces
		Escribir " Los numeros son multiplos"
	SiNo
		Escribir " Los numeros no son multiplos"
		
	FinSi
FinAlgoritmo
