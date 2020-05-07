Proceso ejercicio4
	//Crear un vector de 20 elementos con valores numéricos diferentes. Hallar el mayor valor y su
	//posición y el valor promedio.
	Definir i Como Entero
	Escribir "ingrese el nùmero 20 "
	Leer v
	Dimension vector[v]
	i=0
	ma=0
	po=0
	Mientras i<v Hacer
		a=azar(100)
		vector[i]=a
		i=i+1
		
	FinMientras
	s=0
	Mientras s<v Hacer
		Escribir vector[s]
		si vector[s]>m Entonces
			ma=vector[s]
			po=s
		FinSi
		s=s+1
		pro=(ma+po)/2
	FinMientras
	Escribir "el nùmero mayor es:  ",m
	escribir "su posiciòn es:  ",po
	escribir "su volor promedio es:  ",pro
FinProceso

