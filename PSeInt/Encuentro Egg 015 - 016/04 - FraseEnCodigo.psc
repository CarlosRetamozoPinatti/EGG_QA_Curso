SubProceso codificar(frase Por Referencia)
	Definir codigo Como Caracter
	Definir i Como Entero
	
	codigo = ""
	
	Para i = 0 Hasta Longitud(frase) Hacer
		Segun Minusculas(Subcadena(frase, i, i))
			'a': codigo = Concatenar(codigo, "@")
			'e': codigo = Concatenar(codigo, "#")
			'i': codigo = Concatenar(codigo, "$")
			'o': codigo = Concatenar(codigo, "%")
			'u': codigo = Concatenar(codigo, "*")
			De Otro Modo:
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
		FinSegun
	FinPara
	
	frase = codigo
	
FinSubProceso

Algoritmo FraseEnCodigo
	Definir frase Como Caracter
	
	Escribir "Escriba una frase o palabra: "
	Leer frase
	
	codificar(frase)
	
	Escribir "Una vez codificado, queda: " frase
	
FinAlgoritmo
