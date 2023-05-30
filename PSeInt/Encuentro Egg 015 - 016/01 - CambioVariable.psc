SubProceso Switch(Var1 Por Referencia, Var2 Por Referencia)
	Definir Aux Como Entero
	Aux = Var1
	Var1 = Var2
	Var2 = Aux
FinSubProceso

Algoritmo CambioVariable
	Definir Var1, Var2 Como Entero
	Escribir "Ingrese la primer variable: "
	Leer Var1
	Escribir "Ingrese la segunda variable: "
	Leer Var2
	
	Escribir "Antes del cambio, la variable 1 es " Var1 " y la variable 2 es " Var2
	Switch(Var1, Var2)
	Escribir "Despues del cambio, la variable 1 es " Var1 " y la variable 2 es " Var2
	
FinAlgoritmo
