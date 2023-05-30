Funcion retorno = encontrarEspacio(v, t, pos)
	Definir i, j, retorno Como Entero
	Definir aca Como Logico
	
	aca = Falso
	i = pos - 1
	j = pos + 1
	
	Mientras !aca y ( i >= 0 o j <= t - 1) Hacer
		
		Si j < t -1 y (v[j] == " " o v[j] == "") Entonces
			aca = Verdadero
			retorno = j			
		FinSi		
		
		Si i > 0 y (v[i] == " " o v[i] == "") y !aca Entonces
			aca = Verdadero
			retorno = i
		FinSi
		
		i = i - 1
		j = j + 1

	FinMientras
	
	Si !aca Entonces
		retorno = -1
	FinSi	
FinFuncion

Funcion mostrarVector(v, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1 Con Paso 1 Hacer
		Escribir Sin Saltar v[i], " "
	FinPara
	Escribir ""
FinFuncion

Algoritmo insertarYDesplazar
	Definir fraseV, letras, letra Como Caracter
	Definir i, j, pos Como Entero
	
	Dimension fraseV[20]
	
	Escribir "Escriba una oración: "
	Leer letras
	
	Para i = 0 Hasta 19
		fraseV[i] = Subcadena(letras, i, i)
	FinPara
	
	mostrarVector(fraseV, 20)
	
	Escribir "ahora, ingrese un caracter"
	leer letra
	Escribir "Seleccione una posicion entre 1 y 20"
	Leer pos
	
	pos = pos - 1
	
	//------------Empieza la falopa------------
	Si fraseV[pos] <> " " y fraseV[pos] <> "" Entonces
		j = encontrarEspacio(fraseV, 20, pos)
		Si j <> (-1)
			Si j > pos Entonces
				para i = j Hasta pos + 1
					fraseV[i] = fraseV[i - 1]
				FinPara
				fraseV[pos] = letra
				
			SiNo
				
				Para  i = j Hasta  pos - 1
					fraseV[i] = fraseV[i + 1]
				FinPara
				fraseV[pos] = letra
			FinSi			
		SiNo
			Escribir "no hay espacios disponibles...."
		FinSi
	SiNo
		fraseV[pos] = letra
	FinSi
	
	mostrarVector(fraseV, 20)
	
FinAlgoritmo
