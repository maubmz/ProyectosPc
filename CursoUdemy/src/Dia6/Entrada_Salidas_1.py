mi_archivo = open('Prueba.txt')

# una_linea = mi_archivo.readline()
# print(una_linea.upper())
#
# una_linea = mi_archivo.readline()
# print(una_linea.rstrip())
#
# una_linea = mi_archivo.readline()
# print(una_linea)

print("Loop for")

# for l in mi_archivo:
#     print("Aqui dice: " + l)

todas = mi_archivo.readlines()
print(todas.pop())












mi_archivo.close()

