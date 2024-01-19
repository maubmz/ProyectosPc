from pathlib import Path, PureWindowsPath

carpeta = Path("C:/Users/i6ood/Documents/Programacion/Pycharm/CursoUdemy/src/Dia6/Prueba.txt")

# Imprimir datos que contiene el archivo
print(carpeta.read_text())

# Imprime el nombre del archivo
print(carpeta.name)

# Extension del tipo de archivo
print(carpeta.suffix)

# Nombre sin el tipo de archivo
print(carpeta.stem)

# Si el archivo existe
if carpeta.exists():
    print("Genial, existe")
else:
    print("Este archivo no existe")

# Cualquier ruta la convierte en una de windows
ruta_windows = PureWindowsPath(carpeta)
print(ruta_windows)

