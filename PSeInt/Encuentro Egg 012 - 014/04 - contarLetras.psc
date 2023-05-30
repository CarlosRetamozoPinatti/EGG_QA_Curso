Funcion cantLetras <- buscar(fras,letr)
	Definir cantLetras,i,n Como Entero
	i = 0
	cantLetras = 0
	n = Longitud(fras)
	Mientras i < n Hacer
		si letr = Subcadena(fras,i,i) Entonces
			cantLetras = cantLetras + 1
		FinSi
		i = i + 1
	FinMientras	
Fin Funcion


Algoritmo contarLetras
	Definir letra Como Caracter
	Definir frase Como Cadena
	Definir cantidad Como Entero
	
	Escribir "Ingrese una frase: "
	Leer frase
	Escribir "Que letra desea buscar?: "
	Leer letra
	
	cantidad = buscar(frase,letra)
	Escribir "La letra " letra " se repite " cantidad " veces."
	
FinAlgoritmo
