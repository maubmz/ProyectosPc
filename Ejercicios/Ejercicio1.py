class Estudiante:
    def __init__(self, nombre, edad, grado):
        self.nombre = nombre
        self.edad = edad
        self.grado = grado

    def estudiar(self):
        print("Estudiando ...")

nombre = input("Dame el nombre del estudiante: ")
edad = input("Dame su edad: ")
grado = input("Por ultimo, su grado: ")

estudiante = Estudiante(nombre, edad, grado)

print(f'''
    El estudiante se llama {estudiante.nombre},
    El estudiante tiene {estudiante.edad}
    y su grado es {estudiante.grado}
''')

estudiar = input()
if(estudiar.lower() == "estudiar"):
    estudiante.estudiar()
