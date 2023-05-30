Funcion conversor <- Convertir(converString Por Referencia)
	Definir ConverNum Como Entero
	
	Si Longitud(converString) <= 3 Entonces
		ConverNum = ConvertirANumero(converString)
		Escribir "El numero, pasado de formato STR a INT, es " ConverNum
	SiNo
		Escribir "El numero es demasiado largo"
	FinSi
	
Fin Funcion

Algoritmo DeStringAInt
	Definir converString como Cadena
	Definir intFinal Como Entero
	Escribir "Ingrese un numero de no mas de 3 digitos: "
	Leer converString
	
	intFinal = Convertir(converString)
	
FinAlgoritmo
