Algoritmo reemplazarPosicion
	Definir frase, vectLetras, letra Como Caracter
	Definir posicion, i Como Entero
	
	Dimension vectLetras[20]
	
	Escribir "Escriba una frase"
	Leer frase
	
	Para i = 0 Hasta 19
		vectLetras[i] = Subcadena(frase, i, i)
	FinPara
	
	Escribir "Ahora ingrese un caracter"
	Leer letra
	Escribir "Seleccione una posicion entre 1 y 20"
	Leer posicion
	
	Si vectLetras[posicion-1] == " " Entonces
		vectLetras[posicion-1] = letra
		Para i = 0 Hasta 19
			Escribir vectLetras[i]	Sin Saltar		
		FinPara
		Escribir ""
	SiNo
		Escribir "Este lugar esta ocupado."
	FinSi
	
FinAlgoritmo
