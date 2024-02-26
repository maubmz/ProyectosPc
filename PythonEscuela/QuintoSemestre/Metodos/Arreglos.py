def generador_arreglos(numero):
    n = 2 ** numero
    arreglo = []
    for i in range(n):
        arreglo.append(i + 1)
    return arreglo


def encuentra_numero(numero, arreglo):
    for i in arreglo:
        if i == numero:
            return f"Encontramos el valor {numero}"


