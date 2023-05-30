Algoritmo integradorPseint
	Definir m Como Entero
	Definir genZ Como Caracter
	
	Escribir "De que tamaño es la matriz cuadrada? : "
	Leer m
	Dimension genZ[m,m]
	
	ingresarMuestra(genZ, m)
	mostrarMatrix(genZ, m)
	buscarMatch(genZ, m)
	
FinAlgoritmo

subproceso mostrarMatrix(genZ, m)
	definir i, j Como Entero
	para i = 0 hasta m -1 Hacer
		para j = 0 hasta m -1 Hacer
			escribir sin saltar genZ[i,j], " "
		FinPara
		escribir ""
	FinPara
FinSubProceso

SubProceso ingresarMuestra(genZ Por Referencia, m)
	Definir i, j, contador Como Entero
	Definir palabra Como Caracter
	
	Hacer
		Escribir "Ingrese la palabra de muestra, de " m*m " digitos: "
		Leer palabra
		palabra = Mayusculas(palabra)
	Mientras Que Longitud(palabra) <> m*m
	contador = 0
	Para i = 0 Hasta m - 1
		Para j = 0 Hasta m - 1
			genZ[i,j] = Subcadena(palabra, contador, contador)
			contador = contador + 1
		FinPara
	FinPara
FinSubProceso

SubProceso verMuestra(genZ, m)
	Definir i, j Como Entero
	Limpiar Pantalla
	Escribir "La muestra ingresada es: "
	Escribir ""
	Para i = 0 Hasta m - 1
		Para j = 0 Hasta m - 1
			Escribir Sin Saltar genZ[i,j]
		FinPara
	FinPara
FinSubProceso

SubProceso buscarMatch(genZ, m)
	Definir i, j, ContDer, ContIzq Como Entero
	Definir DiagDer, DiagIzq Como Caracter
	
	Dimension DiagDer[m], DiagIzq[m]
	
	Para i = 0 Hasta m - 1
		Para j = 0 Hasta m - 1
			Si i = j
				DiagDer[i] = genZ[i,j]
			FinSi
			Si i + j = m - 1
				DiagIzq[i] = genZ[i,j]
			FinSi
		FinPara
	FinPara
	
	ContDer = 0
	ContIzq = 0
	Para i = 0 Hasta m - 1
		Si DiagDer[i] = genZ[0,0]
			ContDer = ContDer + 1
		FinSi
		Si DiagIzq[i] = genZ[0,m-1]
			ContIzq = ContIzq + 1
		FinSi
	FinPara
	Si ContDer = m y ContIzq = m
		Escribir "LA MUESTRA ES UNA POTENCIAL CURA!, TIENE LAS BASES " genZ[0,0] " Y " genZ[0,m-1]
	SiNo
		Escribir "LA MUESTRA NO CONTIENE UNA CURA!, SEGUI INTENTANDO O EL MUNDO SE TERMINA!"
	FinSi
FinSubProceso
	