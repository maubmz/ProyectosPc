"""
'w' limpia y escribe lo nuevo
'a' modifica el archivo
"""
archivo = open('Prueba.txt', 'a')

# lista = ['hola','mundo','aqui','estoy']
# for p in lista:
#     archivo.writelines(p + "\n")

archivo.write("bienvenido")





archivo.close()

