from Tarea8.Metodo import crear_Diccionario, guardar_diccionario

# Pide un texto al usuario
texto_usuario = input("Ingresa un texto: ")

# Crear el diccionario con el texto del usuario
diccionario_resultante = crear_Diccionario(texto_usuario)

# Imprimimos el diccionario resultante
print("Diccionario Resultante:")
for palabra in diccionario_resultante:
    print(palabra)

# Guardar el diccionario en el archivo txt
nombre_archivo = input("Ingresa el nombre del archivo txt para guardar el diccionario: ")
guardar_diccionario(diccionario_resultante, nombre_archivo + ".txt")



