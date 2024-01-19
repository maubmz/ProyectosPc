from random import choice

palabras = ['passionfruit', 'rich babby daddy', 'hear me now', 'forever', 'all the stars', 'style',
            'welcome to new york', 'die hard', 'maniac',
            'am i dreaming', 'time of our lives', 'the nights', 'just cant get enough', 'viva la vida',
            'a sky full of the stars']
letras_correctas = []
letras_incorrectas = []
vidas = 6
aciertos = 0
juego_terminado = False


def elegir_palabra(lista):
    palabra_elegida = choice(lista)
    letras_unicas = len(set(palabra_elegida))
    return palabra_elegida, letras_unicas


def letra_usuario():
    letra_elegida = ''
    es_valida = False
    abecedario = 'abcdefghijklmnopqrstuvwxyz '
    while not es_valida:
        letra_elegida = input('Ingrese una letra: ').lower()
        if letra_elegida in abecedario and len(letra_elegida) == 1:
            es_valida = True
        else:
            print("No has elegido una letra correcta")
    return letra_elegida


def mostrar_guiones(palabra):
    lista = []
    for letra in palabra:
        if letra in letras_correctas:
            lista.append(letra)
        else:
            lista.append('_')
    print(' '.join(lista))


def verificar_palabra(letra_elegida, palabra_oculta, vidas, coincidencias):
    fin = False
    if letra_elegida in palabra_oculta and letra_elegida not in letras_correctas:
        letras_correctas.append(letra_elegida)
        coincidencias += 1
    elif letra_elegida in palabra_oculta and letra_elegida in letras_correctas:
        print("Ya encontraste esa letra, intenta con otra")
    else:
        letras_incorrectas.append(letra_elegida)
        vidas -= 1
    if vidas == 0:
        fin = perder()
    elif coincidencias == letras_palabra:
        fin = ganar(palabra_oculta)
    return vidas, fin, coincidencias


def perder():
    print("Te quedaste sin vidas")
    print(f"La palabra oculta era {palabra} ")
    return True


def ganar(palabra):
    mostrar_guiones(palabra)
    print("Has encontrado la palabra!!")
    return True


palabra, letras_palabra = elegir_palabra(palabras)
while not juego_terminado:
    print("*"*20)
    mostrar_guiones(palabra)
    print(f"Letras incorrectas: {letras_incorrectas}")
    print(f"Letras correctas: {letras_correctas}")
    print(f"Vidas: {vidas}")
    print("*" * 20)
    letra = letra_usuario()
    vidas, juego_terminado, aciertos =verificar_palabra(letra, palabra, vidas, aciertos)

