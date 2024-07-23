#Funcion que pasa de entero a lista
def entero_a_lista(numero):
    lista_invertida = []
    lista = []
    while numero > 0:
        digito = numero % 10
        lista_invertida.append(digito)
        numero = numero // 10
        
    cont = len(lista_invertida) - 1
    
    while cont >= 0:
        lista.append(lista_invertida[cont])
        cont = cont - 1

    return lista

#Funcion que pasa de lista a entero
def lista_a_entero(lista):
    numero = 0
    cont = 0
    while cont < len(lista):
        digito = lista[cont]
        numero = numero * 10 + digito
        cont = cont + 1
    return numero

#Main
num = int(input("Ingresar un numero entero positivo: "))

while num <= 0:
    num = int(input("El numero tiene que ser positivo, ingrese denuevo: "))

numero_lista = entero_a_lista(num)

aux = numero_lista[len(numero_lista) - 1]
numero_lista[len(numero_lista) - 1] = numero_lista[0]
numero_lista[0] = aux

resultado = lista_a_entero(numero_lista)

print("El numero intercambiando el primer digito con el ultimo es:" , resultado)
