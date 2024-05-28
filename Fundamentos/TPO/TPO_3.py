lista_depositos = []
lista_cantidad = []

#Función para ordenar la lista
def ordenar_lista(depositos, cantidades):
    largo = len(lista_depositos)
    desordenada = True
    while desordenada:
        desordenada = False
        for i in range(largo-1):
            if cantidades[i] < cantidades[i+1]:
                aux = cantidades[i]
                cantidades[i] = cantidades[i+1]
                cantidades[i+1] = aux
                aux = depositos[i]
                depositos[i] = depositos[i+1]
                depositos[i+1] = aux
                desordenada = True
      
#Programa principal       
DEPOSITOS = 25
for i in range(DEPOSITOS + 1):
    lista_depositos.append(i+1)
    lista_cantidad.append(0)

deposito = int(input("Ingrese un depósito o -1 para terminar: "))
while deposito != -1:   
    if deposito >= 1 and deposito <= 25:
        cantidad = int(input("Ingrese la cantidad de toneladas de granos que entran o salen del depósito: "))
        lista_cantidad[deposito-1] += cantidad
    else:
        print("Depósito inexistente, debe ingresar un número entre 1 y 25")
    deposito = int(input("Ingrese un depósito o -1 para terminar: "))

ordenar_lista(lista_depositos, lista_cantidad)
print("Listado de depósitos: ")
for i in range(25):
    print("Depósito",lista_depositos[i],":", lista_cantidad[i], "toneladas")
