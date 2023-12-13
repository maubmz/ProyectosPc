class A:
    def hablar(self):
        print("Hola desde la clase A")

class B(A):
    def hablar(self):
        print("Hola desde la clase B")

class C(A):
    def hablar(self):
        print("Hola desde la clase C")

class D(B, C):
    def hablar(self):
        print("Hola desde la clase D")


d = D()
d.hablar()
