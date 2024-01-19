# *args
# Decimo Sexto Ejercicio
def suma_cuadrados(*args):
    total = 0
    for arg in args:
        total += arg ** 2
    return total

# Decimo Septimo Ejercicio
def suma_absolutos(*args):
    total = 0
    for arg in args:
        if arg < 0:
            total += arg * -1
        else:
            total += arg
    return total

# Decimo Octavo Ejercicio
def numeros_persona(nombre, *args):
    suma_numeros = 0
    for arg in args:
        suma_numeros += arg
    return f"{nombre}, la suma de tus números es {suma_numeros}"

# **kwargs
# Decimo noveno Ejercicio
def cantidad_atributos( **kwargs):
    num_atributos = 0
    for kwarg in kwargs:
        num_atributos += 1
    return num_atributos

# Vigesimo Ejercicio
def lista_atributos( **kwargs):
    lista = []
    for valor in kwargs.values():
        lista.append(valor)
    return lista

# Vigesimo Primer Ejercicio
def describir_persona(nombre, **kwargs):
    print(f'Características de {nombre}:')
    for nombre_argumento, valor_argumento in kwargs.items():
        print(f'{nombre_argumento}: {valor_argumento}')




