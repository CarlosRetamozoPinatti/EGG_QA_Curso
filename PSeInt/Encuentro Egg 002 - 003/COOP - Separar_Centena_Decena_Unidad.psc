Algoritmo Separar_Centena_Decena_Unidad
	
    // Declaración de variables
    Definir num, centena, decena, unidad Como Entero
    
    // Pedir al usuario que ingrese un número de 3 cifras
    Escribir "Ingrese un número de 3 cifras: "
    Leer num
    
    // Separar el número en centena, decena y unidad
    centena <- TRUNC(num / 100)
    decena <- TRUNC((num MOD 100) / 10)
    unidad <- num MOD 10
    
    // Mostrar los resultados por pantalla
    Escribir "El número ingresado es: ", num
    Escribir "La centena es: ", centena
    Escribir "La decena es: ", decena
    Escribir "La unidad es: ", unidad
	
FinAlgoritmo


