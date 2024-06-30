def ordenar_lista(legajos, notas):
    desordenada = True
    while desordenada:
        desordenada = False
        for i in range(len(legajos)-1):
            if legajos[i] > legajos[i+1]:
                aux = legajos[i]
                legajos[i] = legajos[i+1]
                legajos[i+1] = aux
                
                aux = notas[i]
                notas[i] = notas[i+1]
                notas[i+1] = aux
                desordenada = True

lista_legajo = []
lista_nota = []
aprobados = 0
desaprobados = 0
suma_notas = 0

legajo = int (input ("Ingresar el legajos del alumno (-1 para finalizar): "))
while legajo != -1:
    nota = int (input ("Ingresar la nota del alumno: "))
    while nota < 1 or nota > 10:
        nota = int (input ("La nota tiene que estar entre 1 y 10, reingrese los datos: "))
    lista_legajo.append(legajo)
    lista_nota.append(nota)            
    if nota >= 4:
        aprobados = aprobados + 1
    else:
        desaprobados = desaprobados + 1
    suma_notas = suma_notas + nota
    legajo = int(input("Ingresar el legajo del alumno (-1 para finalizar): "))

promedio = suma_notas / len(lista_nota)

legajos_superan_promedio = []
for i in range(len(lista_legajo)):
    if lista_nota[i] > promedio:
        legajos_superan_promedio.append(lista_legajo[i])
               
ordenar_lista(lista_legajo, lista_nota)
               
print("El listado de alumnos con sus respectivas notas: ")
for i in range(len(lista_legajo)):
    print("El legajo del alumno es ",lista_legajo[i],"con su respectiva nota:", lista_nota[i])
print("La cantidad de alumnos aprobados es", aprobados , "y la cantidad de desaprobados es" , desaprobados)
print("La suma de las notas es", suma_notas, "con el respectivo promedio de estas siendo", promedio)
for i in range(len(legajos_superan_promedio)):
    print("Los legajos que superan el promedio son:", legajos_superan_promedio[i])
    