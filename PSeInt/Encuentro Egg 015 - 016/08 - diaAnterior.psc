SubProceso calcularAnterior(dia, mes, anio)
	
	dia = dia -1
	
	Si dia < 1
		mes = mes -1
		Segun mes
			2: 
				Si((anio MOD 4 = 0) y (anio MOD 100 <> 100)) o (anio MOD 400 = 0)
					dia = 29
				SiNo
					dia = 28
				FinSi
			4 o 6 o 9 o 11: 
				dia = 30
			1 o 3 o 5 o 7 o 10: 
				dia = 31
			De Otro Modo:
				dia = 31
				mes = 12
				anio = anio - 1
		FinSegun
		
	FinSi
	Escribir "el dia anterior al dado es " dia "/" mes "/" anio
FinSubProceso

Algoritmo diaAnterior
	Definir dia, mes, anio Como Entero
	
	Escribir "Ingrese el dia, mes y año en formato (dd/mm/aaaa): "
	Leer dia, mes, anio
	
	calcularAnterior(dia,mes,anio)
	
FinAlgoritmo
