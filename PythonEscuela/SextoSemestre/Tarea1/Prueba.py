from parser1 import *;

# Una condicion donde regresa true si es un espacio
cadena = " "
print(esSeparador(cadena))

# Cuestiona la cadena recibida y regresa True o False
# Dependiendo de si se encontro simbolo especial
simbolo = "!"
print(esSimboloEsp(simbolo))

# Quita los simbolos del comentario como "/" o "*"
quit_comentarios = "/* Hola */"
print(quitaComentarios(quit_comentarios))

# Vuelve una cadena en una lista
token = " Hola D"
print(tokeniza(token))

# Pregunta si el primer caracter no es numerico
# Si no es numerico regresa true
id = "ala"
print(esId(id))

# Revisa la cadena para ver si recibio una palabra reservada
palabra = "int"
print(esPalReservada(palabra))


# Pregunta si el valor recibio es un tipo de valor
# numerico en la cadena
palabra = "int como estas"
print(esTipo(palabra))
