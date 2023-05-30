Funcion verificar(letra)
	
	Si Mayusculas(letra) >= "M" y Mayusculas(letra) <= "T"	
		Escribir "La letra " letra " esta entre la T y la M"
	SiNo
		Escribir "La letra " letra " no esta entre la T y la M"
	FinSi
	
Fin Funcion

Algoritmo LaTylaM
	Definir letra Como Caracter
	
	Escribir "Ingrese una letra"
	Leer letra
	
	verificar(letra)
	
FinAlgoritmo
