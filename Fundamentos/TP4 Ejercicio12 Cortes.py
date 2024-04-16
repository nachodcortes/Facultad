n = int(input("Ingrese la cantidad de terminos que se quieren leer de la sucesion de Fibonacci: "))
cont = 0
anterior = 0
segundo_anterior = 1
fibonacci = 0
suma = 0
while cont < n:
    print (fibonacci)
    suma = suma + fibonacci
    fibonacci = segundo_anterior + anterior
    segundo_anterior = anterior
    anterior = fibonacci
    cont = cont + 1
print("La suma de todos los terminos es", suma)
    