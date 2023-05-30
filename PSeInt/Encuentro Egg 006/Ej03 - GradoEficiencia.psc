Proceso GradoEficiencia
    Definir numDefectuosos, numSinDefectos, grado Como Entero
    
    Escribir "Ingrese la cantidad de tornillos defectuosos producidos:"
    Leer numDefectuosos
    
    Escribir "Ingrese la cantidad de tornillos sin defectos producidos:"
    Leer numSinDefectos
    
    Si numDefectuosos < 200 Y numSinDefectos > 10000 Entonces
        grado = 8
    Sino Si numDefectuosos < 200 Entonces
			grado = 6
		Sino Si numSinDefectos > 10000 Entonces
				grado = 7
			Sino
				grado = 5
			FinSi
			
		FinSi
		
	FinSi
	
	Escribir "El grado de eficiencia del operario es:", grado
			
FinProceso
