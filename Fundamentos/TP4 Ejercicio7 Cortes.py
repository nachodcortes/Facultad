cont = 1
total = 0
posicion = cont
numero = int(input("Ingrese un numero entero: "))
mayor = numero
total = total + numero
while cont < 10:   
    numero = int(input("Ingrese un numero entero: "))
    total = total + numero
    cont = cont + 1
    if numero > mayor:
        mayor = numero
        posicion = cont
print("El promedio es", total / 10)
print("El mayor valor ingresado fue", mayor, "en la posicion", posicion)