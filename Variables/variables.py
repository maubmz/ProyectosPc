# Impresion de String por variables y definiendo las variables
# Variable definida con camelCase
nombreCompleto = "Dalto"

#Variable definida con snake_case
nombre_Completo = "Danna"

nombreCompleto = "Lucas"
nombreCompleto = "Pedrito"
print(nombreCompleto)
print(nombre_Completo)

# Impresion de int por variables
numero = 10
numero += 5
numero -= 5
print(numero)

#Impresion de concatenacion de string con +
nombre = "Mario"
bienvenida = "Hola " + nombre + " Como estas?"
print(bienvenida)

#Impresion de concatenacion de string con f-strings
nombre = True
bienvenida = f"Hola {nombre} Como estas?"

del nombre #Elimina datos que se alojaron en memoria
print(bienvenida)

#Operadores de pertenencia (in y not in)
print("Ola" in bienvenida)
print("Pedro" not in bienvenida)
