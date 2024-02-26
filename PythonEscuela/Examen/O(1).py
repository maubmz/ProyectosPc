def obtener_O1(lista, indice):
    return lista[indice]

lista = []
for i in range(50):
    lista.append(i)


resultado = obtener_O1(lista, 35)
print(resultado)
print(resultado == 35)
