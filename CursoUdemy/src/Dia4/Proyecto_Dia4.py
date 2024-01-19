
from random import *

nombre = input("Ingrese su nombre: ")
numero_advinar = randint(1,101)
intentos = 8
print(f'Bueno {nombre} tienes 8 intentos para adivinar el numero entre 1 y 100, cual crees que es el numero? ')
while intentos > 0:
    numero_usuario = int(input())
    if (numero_usuario < 1) or (numero_usuario > 100):
        print("Has elegido un numero no permitido ")
    elif numero_usuario < numero_advinar:
        print("Respuesta incorrecta, has elegido un numero menor")
    elif numero_usuario > numero_advinar:
        print("Respuesta incorrecta, has elegido un numero mayor")
    elif numero_usuario == numero_advinar:
        print(f"Felicidades es el numero correcto, te quedaron {intentos} intentos")
        break
    intentos -= 1
    print(f"Te quedan {intentos} intentos")

if (numero_advinar == 23):
    print("Felicidades es el numero de su majestad")
elif (numero_advinar == 24):
    print("Felicidades es el numero de thats Mamba")
print(f"Fin del juego te quedan {intentos} intentos, el numero era {numero_advinar}")
