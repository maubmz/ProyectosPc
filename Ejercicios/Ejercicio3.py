class Animal:
    def comer(self):
        return 'Esta comiendo el Animal'

class Mamifero(Animal):
    def amamantar(self):
        return 'Esta amamantando'

class Ave(Animal):
    def volar(self):
        return 'Esta volando la ave'

class Murcielago(Mamifero, Ave):
    pass


