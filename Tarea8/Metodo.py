
def crear_Diccionario(texto):
    palabras = texto.lower().split()
    diccionario = palabras
    return diccionario

# Escribe el diccionario en el archivo txt
def guardar_diccionario(diccionario, nombre_archivo):
    with open(nombre_archivo, 'a') as archivo:
        for palabra in diccionario:
            archivo.write(palabra + " ")

