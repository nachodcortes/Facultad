numero = int(input("Ingrese un numero o -1 para finalizar: "))
primero = numero
ultimo = numero
while numero != -1:
    numero = int(input("Ingrese un numero o -1 para finalizar: "))
    if numero != -1:
        ultimo = numero
print("El primer numero es", primero,"el ultimo numero es", ultimo)