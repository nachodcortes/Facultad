#Calcular descuento y el importe a pagar
precio = float(input("Ingresar el precio del medicamento: "))
descuento = 0.35
monto_descuento = precio * descuento
importe_final = precio - monto_descuento
print("El precio original es:",precio)
print("El monto del descuento es:",monto_descuento)
print("El importe final a pagar es:",importe_final)