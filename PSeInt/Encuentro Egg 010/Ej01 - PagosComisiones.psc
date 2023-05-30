Algoritmo PagosComisiones	
	Definir n, i, j Como Entero
	Definir totalComisiones, totalSueldo, cobroPorVenta, sueldo, ventas, comisiones Como Real
	
	totalComisiones = 0	
	totalSueldo = 0
	
	Escribir "Ingrese el número de vendedores: "	
	Leer n
	
	Para i = 1 Hasta n Con Paso 1 Hacer		
		cobroPorVenta = 0		
		Escribir "Ingrese el sueldo base del vendedor ", i, ": "		
		Leer sueldo		
		Escribir "Ingrese la cantidad de ventas realizadas por el vendedor ", i, ": "		
		Leer ventas
				
		Para j = 1 Hasta ventas Con Paso 1 Hacer			
			Escribir "Ingrese el monto cobrado por la venta ", j, ": "			
			Leer monto			
			cobroPorVenta = cobroPorVenta + monto			
		FinPara
		
		comisiones = cobroPorVenta * 0.1		
		totalComisiones = totalComisiones + comisiones		
		totalSueldo = totalSueldo + sueldo + comisiones
				
		Escribir "El vendedor ", i, " recibirá $", comisiones, " de comisiones."		
		Escribir "El sueldo total del vendedor ", i, " será de $", sueldo + comisiones, "."		
		Escribir " "
		
	FinPara
	
	Escribir "El total a pagar en comisiones es: $", totalComisiones	
	Escribir "El total a pagar en sueldos es: $", totalSueldo
	
FinAlgoritmo

