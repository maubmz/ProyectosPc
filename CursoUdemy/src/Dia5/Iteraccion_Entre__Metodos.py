from random import shuffle

# Lista inicial
palitos = ['-', '--', '---', '----']

# Mezclar a los palitos
def mezclar(lista):
    shuffle(lista)
    return lista

# Pedir intento a usuario
def probar_suerte():
    intento = ''
    while intento not in ['1', '2', '3', '4']:
        intento = input('Elige un numero del 1 al 4: ')
    return int(intento)

# Comprobar intento
def chequear_intento(lista, intento):
    if lista[intento-1] == '-':
        print("A lavar los platos")
    else:
        print("Te has salvado")

    print(f"Te ha tocado {lista[intento-1]}")

palitos_mezclar = mezclar(palitos)
seleccion = probar_suerte()
print(chequear_intento(palitos_mezclar, seleccion))
