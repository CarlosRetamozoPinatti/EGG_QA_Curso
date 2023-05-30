Algoritmo IntegradorEgg
	definir m Como Entero
	definir matriz, muestra como caracter
	muestra = "ACDDCADBCDABDBBA"
	m = rc(longitud(muestra))
	dimension matriz(m,m)
	almacenar_valor(matriz, m, muestra)
	print_valor(matriz, m)
	detectar_muestra(matriz, m)
	
FinAlgoritmo

subproceso almacenar_valor(matriz, m, muestra)
	definir valor_letra Como Logico
	definir i, j, cont Como Entero
	cont = 0
	
	para i = 0 hasta m -1 Hacer
		para j = 0 hasta m -1 Hacer
			matriz(i,j) = Mayusculas(subcadena(muestra,cont,cont))
			cont = cont + 1
		FinPara
	FinPara
FinSubProceso

subproceso print_valor(matriz, m)
	definir i, j Como Entero
	para i = 0 hasta m -1 Hacer
		para j = 0 hasta m -1 Hacer
			escribir sin saltar matriz(i,j), " "
		FinPara
		escribir ""
	FinPara
FinSubProceso

subproceso detectar_muestra(matriz, m)
	definir d1, d2 como caracter
	definir i, j, contDiag1, contDiag2 Como Entero
	dimension d1(m), d2(m)
	
	para i = 0 hasta m -1 Hacer
		para j = 0 hasta m -1 Hacer
			si i = j Entonces
				d1(i) = matriz(i,j)
			FinSi
			si i + j = m -1 Entonces
				d2(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	contDiag1 = 0
	contDiag2 = 0
	
	para i = 0 hasta m -1 Hacer
		si d1(i) = matriz(0,0) Entonces
			contDiag1 = contDiag1 + 1
		FinSi
		si d2(i) = matriz(0, m-1) Entonces
			contDiag2 = contDiag2 + 1
		FinSi
	FinPara
	
	si contDiag1 = m y contDiag2 = m Entonces
		escribir "la muestra ingresada ha sido detectada"
	FinSi
	
FinSubProceso
	