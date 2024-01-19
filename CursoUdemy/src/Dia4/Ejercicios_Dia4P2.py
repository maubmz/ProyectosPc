from random import *

# Rango
# DecimoSexto Ejercicio
mi_lista = list(range(2500,2586))

# Decimo Septimo Ejercicio
mi_lista = list(range(3,301,3))

# Decimo Octavo Ejercicio
suma_cuadrados = 0
for numero in range(1,16):
    suma_cuadrados += (numero**2)

# Enumerate
# Decimo noveno Ejercicio
lista_nombres = ["Marcos", "Laura", "Mónica", "Javier", "Celina",
                 "Marta", "Darío", "Emiliano", "Melisa"]
for indice, nombre in enumerate(lista_nombres):
    print(f'{nombre} se encuentra en el índice {indice}')

# Vigesimo Primero Ejercicio
lista_indices = list(enumerate("Python"))

# Vigesimo Segundo Ejercicio
lista_nombres = ["Marcos", "Laura", "Mónica", "Javier", "Celina", "Marta",
                 "Darío", "Emiliano", "Melisa"]
for indice, nombre in enumerate(lista_nombres):
    if nombre.startswith('M'):
        print(indice)

# Zip
# Vigesimo Tercero Ejercicio
capitales = ["Berlín", "Tokio", "París", "Helsinki", "Ottawa", "Canberra"]
paises = ["Alemania", "Japón", "Francia", "Finlandia", "Canadá", "Australia"]
for pais, capital in zip(paises, capitales):
    print(f'La capital de {pais} es {capital}')

# Vigesimo Cuarto Ejercicio
marcas = ['Nike', 'Apple', 'Sony']
productos = ['Ja 1', 'iphone 15', 'Sony xm5']
mi_zip = zip(marcas, productos)

# Vigesimo Quinto Ejercicio
espaniol = 'uno', 'dos', 'tres', 'cuatro', 'cinco'
portugues = 'um', 'dois', 'três', 'quatro', 'cinco'
ingles = 'one', 'two', 'three', 'four', 'five'

numeros = list(zip(espaniol, portugues, ingles))

# Min y Max
# Vigesimo Sexto Ejercicio
lista_numeros = [44542247/2, 21310/5, 2134747*33, 44556475, 121676,
                 6654067, 353254, 123134, 55**12, 611**5]
valor_maximo = max(lista_numeros)

# Vigesimo Septimo Ejercicio
lista_numeros = [44542247, 21310, 2134747, 44556475, 121676, 6654067,
                 353254, 123134, 552512, 611665]
rango = max(lista_numeros)-min(lista_numeros)

# Vigesimo Octavo Ejercicio
diccionario_edades = {"Carlos":55, "María":42, "Mabel":78, "José":44,
                      "Lucas":24, "Rocío":35, "Sebastián":19, "Catalina":2,"Darío":49}
edad_minima = min(diccionario_edades.values())
ultimo_nombre = max(diccionario_edades)

# Random
# Vigesimo Noveno Ejercicio
aleatorio = randint(1,10)
print(aleatorio)

# Trigesimo Ejercicio
aleatorio = random()

# Trigesimo Primer Ejercicio
nombres = ["Carlos", "Julia", "Nicole", "Laura", "Mailen"]
sorteo = choice(nombres)

# Comprension Listas
# Trigesimo Segundo Ejercicio
valores = [1, 2, 3, 4, 5, 6, 9.5]
valores_cuadrado = [(valor **2) for valor in valores]
print(valores_cuadrado)

# Trigesimo Tercer Ejercicio
valores = [1, 2, 3, 4, 5, 6, 9.5]
valores_pares = [valor for valor in valores if valor % 2 == 0]
print(valores_pares)

# Trigesimo Cuarto Ejercicio
temperatura_fahrenheit = [32, 212, 275]
grados_celsius = [((temp - 32) * 5/9) for temp in temperatura_fahrenheit]
print(grados_celsius)

