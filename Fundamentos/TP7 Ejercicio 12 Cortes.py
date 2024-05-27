def ascendenteSi(lista):
    if lista[0] < lista[1]:
        ascendente = True
    else:
        ascendente = False
    return ascendente

#Main
A = [5,8,12,14,15,18,19,21,25,32,34,37,39,42,43,45,48,50]
N = int(input("Ingrese un numero: "))
esAscendente = ascendenteSi(A)
