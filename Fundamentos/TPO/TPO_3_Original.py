#Funcion para la busqueda en la lista
def busqueda(lista, numero):
    i = 0
    while i < len(lista) and lista[i] != numero:
        i = i + 1
    if i < len(lista):
        return i
    else:
        return -1
    
#Función para ordenar las listas con burbujeo
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
lista_depositos = []
lista_cantidades = []

#Ingresar las toneladas que entran o salen del deposito que se ingrese
deposito = int(input("Ingrese un depósito o -1 para terminar: "))
while deposito != -1:   
    if deposito > 0:
        # Buscar si el depósito ya existe en la lista
        indice = busqueda(lista_depositos, deposito)
                
        if indice != -1 :
            cantidad = int(input("Ingrese la cantidad de toneladas de granos que entran o salen del depósito: "))
            cantidad_actual = lista_cantidades[indice]
            cantidad_nueva = cantidad_actual + cantidad
            lista_cantidades[indice] = cantidad_nueva
        
        else:
            if len(lista_depositos) < 25:
                cantidad = int(input("Ingrese la cantidad de toneladas de granos que entran o salen del depósito: "))
                lista_depositos.append(deposito)
                lista_cantidades.append(cantidad)
            else:
                print("Operación rechazada: ya se detectaron 25 depósitos diferentes.")
        deposito = int(input("Ingrese un depósito o -1 para terminar: "))
    
    else:
        deposito = int(input("El deposito no puede ser negativo. Ingrese un depósito o -1 para terminar: "))
    
#Ordenar las listas
ordenar_lista(lista_depositos, lista_cantidades)

#Imprimir la lista de depositos final
print()
print("Listado de depósitos: ")
for i in range(len(lista_depositos)):
    print("Depósito",lista_depositos[i],":", lista_cantidades[i], "toneladas")
    
