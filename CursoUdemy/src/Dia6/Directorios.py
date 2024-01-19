import os
from pathlib import Path

# Muestra la ruta actual
ruta = os.getcwd()

# Cambia el directorio
# ruta = os.chdir("C:\\Users\\i6ood\\Documents")

# Crea un nuevo archivo en el directorio
# ruta = os.makedirs("C:\\Users\\i6ood\\Documents\\otra")

ruta = "C:\\Users\\i6ood\\Documents\\Programacion\\Pycharm\\CursoUdemy\\src\\Dia6\\Prueba.txt"
# Recibir base de la ruta
# elemento = os.path.basename(ruta)

# Recibir el resto de la ruta
elemento = os.path.dirname(ruta)

# Recibir base de la ruta y el resto en una tupla
# elemento = os.path.split(ruta)

# Eliminar carpeta de la ruta que indiquemos en parametros
# os.rmdir(rut)


otro_archivo = open('C:\\Users\\i6ood\\Documents\\otro_archivo.txt', "r")
print(otro_archivo.read())


# Abrir archivo desde cualquier sistema operativo
carpeta = Path('/Users/i6ood/Documents') / 'otro_archivo.txt'


mi_archivo = open(carpeta)
print(mi_archivo.read())


