class Persona:
    __apellido = None
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad

    def get_nombre(self):
       return self.__nombre

miguel = Persona("Miguel", 20)
print(miguel.get_nombre())

