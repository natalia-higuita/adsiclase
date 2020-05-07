Proceso ejercicio3
	//Llenar un vector con los 10 primeros múltiplos de 3 y luego sume los elementos del vector.
	//Mostrar la suma de los elementos.
	Definir v,i Como Entero
	Dimension  vector[10]
	i=0
	a=0
	suma=0
	Mientras i<10 Hacer
		vector[i]=a
		i=i+1
		a=a+3
	FinMientras
	s=0
	Mientras s<10 Hacer
		Escribir vector[s]
		suma=suma+vector[s]
		s=s+1
		
	FinMientras
	Escribir "la suma de los elementos del vector es: ",suma
FinProceso
