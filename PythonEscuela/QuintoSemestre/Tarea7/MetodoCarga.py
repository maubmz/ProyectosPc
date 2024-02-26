
def asignacion_alfabeto(alfabeto, historial):
    for e in alfabeto:
        historial[e] = 0
    return historial

def carga_palabras_texto(alfabeto, historial, cifrado):
    for letra in cifrado:
        if letra in alfabeto:
            historial[letra] += 1
    return historial