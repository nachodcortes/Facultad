def potenciacion(a,b):
    cont = 0
    multipli = 1
    while cont != b:
        multipli = multipli * a
        cont = cont + 1
    return multipli

x = int(input("Ingresar un numero: "))
y = int(input("Ingresar un numero: "))
resultado = potenciacion(x,y)
print(resultado)