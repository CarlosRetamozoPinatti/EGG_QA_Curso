Funcion rellenarV(v, t, min, max)
	Definir i Como Entero
	Para i = 0 Hasta t - 1 Hacer
		v[i] = Aleatorio(min, max)
	FinPara
FinFuncion

Algoritmo marcarAlumnos
	Definir califV, i, malos, maso, buenos, nionios Como Entero
	
	Dimension califV[100]
	malos = 0
	maso = 0
	buenos = 0
	nionios = 0
	
	rellenarV(califV, 100, 0, 20)
	
	Para i = 0 Hasta 99
		Si califV[i] <= 5
			malos = malos + 1
		SiNo
			Si califV[i] >= 6 y califV[i] <= 10
				maso = maso + 1
			SiNo
				Si califV[i] >= 11 y califV[i] <= 15
					buenos = buenos + 1
				SiNo
					nionios = nionios + 1
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "notas bajas: " malos
	Escribir "notas medias: " maso
	Escribir "notas buenas: " buenos
	Escribir "notas excelentes: " nionios
	
FinAlgoritmo
