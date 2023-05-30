//Llenar vectores/arreglos
Funcion llenarVector(v, t)
	Definir i Como Entero
	Para i = 0 hasta t - 1 Hacer
		v[i] = Aleatorio(-100,100)
	FinPara
FinFuncion
//------------------------
//Sumar vectores/arreglos
Funcion sumarVector(v1, v2, v3, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1 Hacer
		v3[i] = v1[i] + v2[i]
	FinPara
FinFuncion
//------------------------
//Restar vectores/arreglos
Funcion restarVector(v1, v2, v3, t)
	Definir i Como Entero
	Para i = 0 Hasta t - 1 Hacer
		v3[i] = v2[i] - v1[i]
	FinPara
FinFuncion
//------------------------
//Mostrar vectores/arreglos
Funcion mostrarVector(v, t, l)
	Definir i Como Entero
	Para i = 0 Hasta t - 1
		Escribir l, "[", i, "]: ", v[i]
	FinPara
	Escribir "Presione una tecla para continuar"
	Esperar Tecla
FinFuncion
//------------------------
Algoritmo menuVectores
	Definir elegir Como Caracter
	Definir tam, a, b, c Como Real
	
	Escribir "Defina el tamaño de los vectores: "
	Leer tam
	
	Dimension a[tam], b[tam], c[tam]
	
	Hacer
		Limpiar Pantalla
		Escribir "Indique qué desea realizar"
		Escribir "A. Llenar vector A"
		Escribir "B. Llenar vector B"
		Escribir "C. Llenar vector C con A + B"
		Escribir "D. Llenar vector C con B - A"
		Escribir "E. Mostrar vectores"
		Escribir "F. to pay respect"
		Leer elegir
		
		Segun Mayusculas(elegir)
			"A":
				Limpiar Pantalla
				Escribir "Llenando vector A..."
				llenarVector(a, tam)
				Esperar 2 Segundos
				Escribir "Proceso finalizado. Presione una tecla para continuar."
				Esperar Tecla
				Limpiar Pantalla
			"B":
				Limpiar Pantalla
				Escribir "Llenando vector B..."
				llenarVector(b, tam)
				Esperar 2 Segundos
				Escribir "Proceso finalizado. Presione una tecla para continuar."
				Esperar Tecla
				Limpiar Pantalla
			"C":
				Limpiar Pantalla
				Escribir "Operando: C = A + B"
				sumarVector(a, b, c, tam)
				Esperar 2 Segundos
				Escribir "Proceso finalizado. Presione una tecla para continuar."
				Esperar Tecla
				Limpiar Pantalla
			"D":
				Limpiar Pantalla
				Escribir "Operando: C = B - A"
				restarVector(a, b, c, tam)
				Esperar 2 Segundos
				Escribir "Proceso finalizado. Presione una tecla para continuar."
				Esperar Tecla
				Limpiar Pantalla
			"E":
				Limpiar Pantalla
				Escribir "Indique el vector que desea mostrar (A, B o C)"
				Leer elegir
				Segun Mayusculas(elegir)
					"A":
						mostrarVector(a, tam, "A")
					"B":
						mostrarVector(b, tam, "B")
					"C":
						mostrarVector(c, tam, "C")
					De Otro Modo:
						Escribir "Opción incorrecta"
				FinSegun
			"F":
				Escribir "Saliendo..."
			De Otro Modo:
				Escribir "Opción incorrecta"
		FinSegun
	Mientras Que Mayusculas(elegir) <> "F"
	
	
	
	
FinAlgoritmo
