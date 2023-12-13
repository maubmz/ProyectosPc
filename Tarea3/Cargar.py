def cargaCifrado(nombreArchivo):
    txt = nombreArchivo + '.txt'
    archivo = open(txt,'r')
    renglon = archivo.readline()
    return renglon

def descifraSustituye(cadena, alfabetoLlave):
    alfabeto = "abcdefghijklmnopqrstuvwxyzäöüß"
    nuevaCadena = ""
    for letra in cadena:
        if letra in alfabeto:
            posicion = alfabeto.find(letra)
            nuevaCadena = nuevaCadena + alfabetoLlave[posicion]
        else:
            nuevaCadena = nuevaCadena + letra
    return nuevaCadena

def letrasDeTexto(alfabeto, historial, cifrado):
    for letra in cifrado:
        if letra in alfabeto:
            historial[letra] += 1
    return historial