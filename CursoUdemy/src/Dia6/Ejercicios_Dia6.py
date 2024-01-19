# Abrir Archivo txt
# Primer Ejercicio
'''archivo = open("texto.txt")
print(archivo.read())'''
# Segundo Ejercicio
'''archivo = open("texto.txt")
print(archivo.readline())'''
# Tercer Ejercicio
'''archivo = open("texto.txt")
archivo_primera_linea = archivo.readline()
print(archivo.readline())'''

# Crear y escribir archivos
# Cuarto Ejercicio
'''archivo = open('mi_archivo.txt', 'w')
archivo.write("Nuevo texto")
archivo.close()
archivo = open('mi_archivo.txt')
print(archivo.read())'''
# Quinto Ejercicio
'''archivo = open('mi_archivo.txt', 'a')
archivo.write("Nuevo inicio de sesión")
archivo.close()
archivo = open('mi_archivo.txt')
print(archivo.read())'''
# Sexto Ejercicio
'''registro_ultima_sesion = ["Federico", "20/12/2021", "08:17:32 hs", "Sin errores de carga"]
archivo = open('registro.txt', 'a')
for p in registro_ultima_sesion:
    archivo.writelines(p + "\t")
archivo.close()
archivo = open('registro.txt')
print(archivo.read())'''

# Pathlib
# Septimo Ejercicio
from pathlib import Path
ruta_base = Path.home()

# Octavo Ejercicio
from pathlib import Path
ruta = Path("Curso Python", "Día 6", "practicas_path.py")

# Noveno Ejercicio
from pathlib import Path
base = Path.home()
ruta = Path(base, "Curso Python", "Día 6", "practicas_path.py")

# Practica Archivos y Funciones
# Decimo Ejercicio
def abrir_leer(archivo):
    archivo = open(archivo)
    return archivo.read()

# Decimo Primer Ejercicio
def sobrescribir(archivo):
    archivo = open(archivo, 'w')
    archivo.write("contenido eliminado")

# Decimo Segundo Ejercicio
def registro_error(archivo):
    archivo = open(archivo, 'a')
    archivo.write("se ha registrado un error de ejecución")
    archivo.close()


