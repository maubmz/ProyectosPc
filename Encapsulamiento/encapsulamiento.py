class MiClase:
    def __init__(self):
        #Atributos privados, Aplica para metodos
        self._atributo_privado = "valor"
        #Atributos Muy Privados, Aplica para metodos
        self.__atributo_muy_privado = "valor1"



objeto = MiClase()
print(objeto._atributo_privado)

print(objeto.__atributo_muy_privado)
