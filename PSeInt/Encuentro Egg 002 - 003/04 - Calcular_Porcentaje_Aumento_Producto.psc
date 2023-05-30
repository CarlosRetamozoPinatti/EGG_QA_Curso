Algoritmo Calcular_Porcentaje_Aumento_Producto
	
    // Declaración de variables
    Definir  precio_inicial, precio_final, porcentaje_aumento Como Real
    
    // Pedir al usuario que ingrese el precio inicial y el precio final del producto
    Escribir "Ingrese el precio del producto al inicio del año: "
    Leer precio_inicial
    Escribir "Ingrese el precio del producto al final del año: "
    Leer precio_final
    
    // Calcular el porcentaje de aumento del producto
    porcentaje_aumento <- ((precio_final - precio_inicial) / precio_inicial) * 100
    
    // Mostrar el porcentaje de aumento del producto por pantalla
    Escribir "El porcentaje de aumento del producto es: ", porcentaje_aumento, "%"
	
FinAlgoritmo


