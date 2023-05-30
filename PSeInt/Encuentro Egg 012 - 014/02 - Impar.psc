Funcion retorno = esImpar(num Por Referencia)
	Definir retorno como Logico
	Si num MOD 2 = 0 Entonces
		retorno = Falso
	SiNo
		retorno = Verdadero
	FinSi
FinFuncion

Algoritmo Impar
	Definir num Como Real
				
	Escribir "Ingrese un numero: "
	Leer num
	
	Si esImpar(num) Entonces
		Escribir " El numero es impar"
	SiNo
		Escribir " El numero es par"
			
	FinSi
FinAlgoritmo
