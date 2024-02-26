from itertools import product

def generar_llaves(letras):
    posiciones_x = [i for i, letra in enumerate(letras) if letra == 'X']

    for combinacion in product("abcdefghijklmnopqrstuvwxyzäöüß", repeat=len(posiciones_x)):
        # Verificar que ninguna letra se repita más de dos veces
        if all(combinacion.count(letra) <= 2 for letra in set(combinacion)):
            llave = list(letras)
            for i, posicion in enumerate(posiciones_x):
                llave[posicion] = combinacion[i]

            yield ''.join(llave)

# Ejemplo de uso
llave_inicial = "XXXXaXXXXXXXXXXdXXXXXXXXXsXXüX"
for llave in generar_llaves(llave_inicial):
    # Aquí puedes usar la llave generada para descifrar tu texto y verificar si tiene sentido
    print(llave)