class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def imprimir(self):
        return f'El nombre de la persona es: {self.nombre} y su edad es: {self.edad}'

class Estudiante(Persona):
    def __init__(self, nombre, edad, grado):
        super().__init__(nombre, edad)
        self.grado = grado

    def imprimir(self):
        return f'El nombre del estudiante es: {self.nombre}, la edad es de {self.edad} y esta en {self.grado} grado'

rober = Estudiante("Rober", 23, 8)
print(rober.imprimir())

