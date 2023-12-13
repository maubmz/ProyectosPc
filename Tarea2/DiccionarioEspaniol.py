
def diccionario_Espanol():
    # Cargamos el archivo en modo lectura con el nombre "palabras_espanol.txt"
    archivo = open('palabras_espanol.txt', 'r')
    renglon = archivo.readline()
    # Dividimos el renglon por espacios entre palabras
    lista_palabras = renglon.split(" ")
    # Imprimimos las palabras encontradas
    for palabra in lista_palabras:
        print(palabra)