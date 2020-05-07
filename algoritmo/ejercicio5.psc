Proceso ejercicio5
//Leer un vector de N elementos numéricos enteros y posteriormente:
	//• Mostrar cuántas veces se repite el número 10.
	//• Sume los elementos de las posiciones pares.
	//• Muestre los elementos del vector empezando por el último elemento.
	
	Definir i Como Entero
	Escribir "ingrese el vector nùmero "
	Leer v
	Dimension vector[v]
	i=0
	d=0
	suma=0
	Mientras i<v Hacer
		Escribir "ingrese el nùmero "
		Leer n
		vector[i]=n
		i=i+1
		
	FinMientras
	
	h=0
	Escribir "el vector en orden es:"
	Mientras h<v Hacer
		
		si vector[h]==10 Entonces
			d=d+1
			FinSi	
			si h==0 entonces 
				t=1
			SiNo
			
               si (h mod 2)==0 Entonces
				
                   suma=suma+vector[h]
			FinSi
			
		finsi
		     Escribir vector[h]
			h=h+1
		FinMientras
		h=0	
	escribir "el vector al reves es:"
	Mientras h<v y h>=0 Hacer
		Escribir vector[h]
		h=h-1
	FinMientras
	
	Escribir "el nùmero 10 se repite:  ",d "veces"
 	escribir "la suma de los elementos de la posiciòn pares es:  ",suma
	
		
	
FinProceso



