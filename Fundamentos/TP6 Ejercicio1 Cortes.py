def multiplicacion(a,b):
    cont = 0
    suma = 0
    while cont != b:
        suma = suma + a
        cont = cont + 1
    return suma

x = int(input("Ingresar un numero: "))
y = int(input("Ingresar un numero: "))
resultado = multiplicacion(x,y)
print(resultado)