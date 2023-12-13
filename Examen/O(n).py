def ejemplo_On(lista, elemento_buscado):
    for i in range(len(lista)):
        if lista[i] == elemento_buscado:
            return i
    return -1

lista = []
for i in range(101):
    lista.append(i)

valor_encontrado = ejemplo_On(lista, 34)
print(valor_encontrado)
print(valor_encontrado == 34)
