def complejidad_temporal(lista, elemento_buscado):
    len_lista = len(lista)
    for i in range(len_lista):
        if lista[i] == elemento_buscado:
            return i
    return "No se encontro el elemento"

lista = []
for i in range (99):
    lista.append(i)

resultado = complejidad_temporal(lista, 23)
print(resultado == 23)
print(resultado)

