Algoritmo palabraAMatriz
	Definir matriz, palabra Como Caracter
	Definir i, j, k Como Entero
	
	Dimension matriz[3,3]
	Escribir "Ingrese una palabra de 9 letras"
	Leer palabra
	
	Para i = 0 Hasta 2
		Para j = 0 Hasta 2
			matriz[i, j] = Subcadena(palabra, j + i * 3, j + i * 3)
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
