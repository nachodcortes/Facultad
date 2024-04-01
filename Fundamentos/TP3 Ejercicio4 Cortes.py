votosFavor = int(input("Ingrese los votos que hubo a favor: "))
votosContra = int(input("Ingrese los votos que hubo en contra: "))
votosTotales = votosFavor + votosContra
porcentajeFavor = (votosFavor * 100) / votosTotales
porcentajeContra = (votosContra * 100) / votosTotales
if porcentajeFavor > porcentajeContra:
    print("La ley fue aprobada")
else:
    print("La ley no fue aprobada")
print("El porcentaje a favor fue",porcentajeFavor ,"% y el porcentaje en contra fue ", porcentajeContra,"%")
