Algoritmo MultiplosDe2y3
	
    Definir contpar,contimpar, num Como Entero
    
    contpar = 0
	contimpar = 0
    
    Para num = 1 Hasta 100 Con Paso 1 Hacer
        
        Si num MOD 2 = 0 Entonces
            contpar = contpar + 1
		SiNo
			Si num MOD 3 = 0
				contimpar = contimpar + 1
			FinSi
        FinSi
        
    FinPara
    
    Escribir "La cantidad de números múltiplos de 2 entre 1 y 100 es: ", contpar
	Escribir "La cantidad de números múltiplos de 3 entre 1 y 100 es: ", contimpar
    
FinAlgoritmo
