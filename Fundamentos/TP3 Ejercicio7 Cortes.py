kilometros = int(input("Ingrese la cantidad de kilometros que recorre: "))
if kilometros > 0 and kilometros < 10:
    precio = kilometros * 400
else:
    precio = kilometros * 200
if precio < 2700:
    precio = 2700
print("La tarifa es:", precio)
