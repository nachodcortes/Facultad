import random

#Funcion para verificar si es negativo, y si lo es cambiar el signo
def verificar_signo(numero):
    if numero < 0:
        numero = numero * -1
    return numero

#Funcion de busqueda que se usa para buscar si existen digitos similares
def busqueda(lista, numero):
    i = 0
    while i < len(lista) and lista[i] != numero:
       i = i + 1
    if i < len(lista):
       return True
    else:
       return False

#Funcion que verifica que no haya digitos similares
def tiene_digitos_unicos(numero):
    digitos = []
    while numero > 0:
        digito = numero % 10
        if busqueda(digitos, digito):
            return False
        digitos.append(digito)
        numero = numero // 10
    return True

#Funcion que genera el numero al azar
def generar_numero(numero1, numero2):
    intentos = (numero2 - numero1) + 1
    while intentos != 0: 
        numero_azar = random.randint(numero1, numero2)
        if tiene_digitos_unicos(numero_azar):
            return numero_azar
        intentos = intentos - 1
    return -1

#Funcion que pasa de entero a lista
def entero_a_lista(numero):
    lista_digitos = []
    while numero > 0:
        digito = numero % 10 
        lista_digitos.append(digito) 
        numero //= 10
    return lista_digitos

#Funcion que pasa de lista a entero
def lista_a_entero(lista_digitos):
    numero = 0
    for digito in lista_digitos:
        numero = numero * 10 + digito
    return numero

#Funcion para order la lista
def ordenar(lista):
    desordenada = True
    while desordenada:
        desordenada = False
        for i in range(len(lista)-1):
            if lista[i]>lista[i+1]:
                aux = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = aux
                desordenada = True

#Funcion que se usa para ver si un numero es primo
def es_primo(numero):
    divisor = 2
    while divisor < numero and numero % divisor != 0:
        divisor = divisor + 1
    if divisor < numero:
        print("No es primo")
    else:
        print("Es primo")
    
#Main
a = int(input("Ingresar el valor de A: "))      
b = int(input("Ingresar el valor de B: "))

limite_a = verificar_signo(a)
limite_b = verificar_signo(b)

if limite_a > limite_b:
    aux = limite_a
    limite_a = limite_b
    limite_b = aux

numero_azar = generar_numero(limite_a, limite_b)

if numero_azar == -1:
    print("No se puede generar un numero valido entre los limites especificados.")
else:
    print("El numero generado sin dígitos repetidos es:", numero_azar)
    lista = entero_a_lista(numero_azar)
    ordenar(lista)
    numero_azar = lista_a_entero(lista)
    print("El numero ordenado es:", numero_azar)
    es_primo(numero_azar)