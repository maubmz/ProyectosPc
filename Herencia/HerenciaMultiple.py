class Persona:
    def __init__(self, nombre, edad, nacionalidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionalidad = nacionalidad

    def hablar(self):
        print("Hola estoy hablando")

class Artista:
    def __init__(self, habilidad):
        self.habilidad = habilidad

    def mostrar_habilidad(self):
        return f'Mi habilidad es: {self.habilidad}'

class EmpleadoArtista(Persona, Artista):
    def __init__(self, nombre, edad, nacionalidad, habilidad, salario, empresa):
        Persona.__init__(self, nombre, edad, nacionalidad)
        Artista.__init__(self, habilidad)
        self.salario = salario
        self.empresa = empresa

    def presentarse(self):
        return f'Hola soy: {self.nombre}, {super().mostrar_habilidad()} y trabajo en {self.empresa}'



roberto = EmpleadoArtista("Roberto", 30, "Mexicano", "Cantar", 10000, "Google")

print(roberto.presentarse())
herencia = issubclass(EmpleadoArtista, Artista)
instancia = isinstance(roberto, EmpleadoArtista)
print(herencia)
print(instancia)
