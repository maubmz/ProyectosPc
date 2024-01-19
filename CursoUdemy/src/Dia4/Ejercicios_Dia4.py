# Operadores Comparacion
# Primer Ejercicio
num1 = 36
num2 = 17
mi_bool = num1 >= num2
print(mi_bool)

# Segundo Ejercicio
num1 = 25**0.5
num2 = 5
mi_bool = num1 == num2
print(mi_bool)

# Tercer Ejercicio
num1 = 64 * 3
num2 = 24 * 8
mi_bool = num1 != num2
print(mi_bool)

# Operadores Logicos
# Cuarto Ejercicio
num1 = 36
num2 = 72/2
num3 = 48
mi_bool = (num1 > num2) and (num1 < num3)
print(mi_bool)

# Quinto Ejericio
num1 = 36
num2 = 72/2
num3 = 48
mi_bool = (num1 > num2) or (num1 < num3)
print(mi_bool)

# Sexto Ejercicio
frase = "Cuando algo es lo suficientemente importante, lo haces incluso si las probabilidades de que salga bien no te acompañan"
palabra1 = "éxito"
palabra2 = "tecnología"
mi_bool = not ((palabra1 in frase) and (palabra2 in frase))
print(mi_bool)

# Control de Flujo
# Septimo Ejercicio
num1 = int(input("Ingresa un número:"))
num2 = int(input("Ingresa otro número:"))
if num1 > num2:
    print(f"{num1} es mayor que {num2}")
elif num1 < num2:
    print(f"{num2} es mayor que {num1}")
else:
    print(f"{num1} y {num2} son iguales")

# Octavo Ejericio
edad = 16
tiene_licencia = False
if (edad >= 18) and tiene_licencia:
    print("Puedes conducir")
elif (edad < 18) and not tiene_licencia:
    print("No puedes conducir aún. Debes tener 18 años y contar con una licencia")
elif (edad >= 18) and not tiene_licencia:
    print("No puedes conducir. Necesitas contar con una licencia")

# Noveno Ejercicio
habla_ingles = True
sabe_python = False
if habla_ingles and sabe_python:
    print("Cumples con los requisitos para postularte")
elif not habla_ingles and sabe_python:
    print("Para postularte, necesitas tener conocimientos de inglés")
elif habla_ingles and not sabe_python:
    print("Para postularte, necesitas saber programar en Python")
else :
    print("Para postularte, necesitas saber programar en Python y tener conocimientos de inglés")

# Loop for
# Decimo Ejercicio
alumnos_clase = ["María", "José", "Carlos", "Martina", "Isabel", "Tomás", "Daniela"]
for alumno in alumnos_clase:
    print("Hola " + alumno)

# Undecimo Ejercicio
lista_numeros = [1,5,8,7,6,8,2,5,2,6,4,8,5,9,8,3,5,4,2,5,6,4]
suma_numeros = 0
for numero in lista_numeros:
    suma_numeros += numero

# DuoDecimo Ejercicio
lista_numeros = [1,5,8,7,6,8,2,5,2,6,4,8,5,9,8,3,5,4,2,5,6,4]
suma_pares = 0
suma_impares = 0
for numero in lista_numeros:
    if numero % 2 == 0:
        suma_pares += numero
    else:
        suma_impares += numero

# Loop While
# DecimoTercer Ejercicio
numero = 10
while numero >= 0:
    print(numero)
    numero -= 1

# DecimoCuarto Ejercicio
numero = 50
while numero >= 0:
    if numero % 5 == 0:
        print(numero)
    else:
        pass
numero -= 1

# DecimoQuinto Ejercicio
lista_numeros = [4,5,8,7,6,9,8,2,4,5,7,1,9,5,6,-1,-5,6,-6,-4,-3]
for numero in lista_numeros:
    if numero < 0:
        break
    print(numero)