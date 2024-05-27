def ingresarLista(A,B):
    numeros = []
    num = 0
    if A > B:
        C = A
        A = B
        B = C
    while num != -1:
        num = int(input("Ingresar un numero entre "+ str(A) +" y "+ str(B) +" o -1 para finalizar: "))
        if num != -1:
            if num < A or num > B:
                print("Error: El número ingresado está fuera del rango.")
            else:
                numeros.append(num)
    return numeros

