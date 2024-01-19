
# Practica Metodos
# Primer Ejercicio
text = ",:_#,,,,,,:::____##Pyt%on_ _Total,,,,,,::#"
copia_text = text.lstrip(",:%_#")
print(copia_text)

# Segundo Ejercicio
frutas = ["mango", "banana", "cereza", "ciruela", "pomelo"]
frutas.insert(3, "naranja")
print(frutas)

# Tercer Ejercicio
marcas_smartphones = {"Samsung", "Xiaomi", "Apple", "Huawei", "LG"}
marcas_tv = {"Sony", "Philips", "Samsung", "LG"}
conjuntos_aislados = marcas_smartphones.isdisjoint(marcas_tv)
print(conjuntos_aislados)

# Funciones
# Cuarto Ejercicio
def saludar() :
    print("¡Hola mundo!")

# Quinta Practica
nombre_persona = "Mau"
def bienvenida(nombre_persona):
    print(f"¡Bienvenido {nombre_persona}!")

# Sexta Practica
un_numero = 3
def cuadrado(numero):
    print(numero ** 2)

# Return
# Septima Practica
def potencia(numero1, numero2):
    return numero1 ** numero2

# Octava Practica
def usd_a_eur(numero1):
    return numero1 * 0.90
dolares = 100
usd_a_eur(dolares)

# Novena Practica
def invertir_palabra(palabra):
    return palabra[::-1].upper()
palabra = "Feliz anio nuevo"
invertir_palabra(palabra)

# Funciones Dinamicas
# Decima Practica
lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, -2, -1]
def todos_positivos(lista):
    for n in lista:
        if n < 0:
            return False
    else:
        pass
    return True

# Decima Primer Practica
lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, -2, -1]
def suma_menores(lista):
    suma = 0
    for n in lista:
        if n > 0 and n < 1000:
            suma += n
    return suma

# Decima Segunda Practica
lista_numeros =[1, 2, 3, 4, 5, 6, 7, 8]
def cantidad_pares(lista):
    num_pares = 0
    for n in lista:
        if n % 2 == 0:
            num_pares += 1
    return num_pares

# Ejemplo Iteraccion entre Funciones
# Decima Tercer Practica
import random

def lanzar_dados():
    return random.randint(1,6), random.randint(1,6)

def evaluar_jugada(dado1, dado2):
    suma_dados = dado1 + dado2
    if suma_dados <= 6:
        return f"La suma de tus dados es {suma_dados}. Lamentable"
    elif suma_dados > 6 and suma_dados < 10:
        return f"La suma de tus dados es {suma_dados}. Tienes buenas chances"
    elif suma_dados >= 10:
        return f"La suma de tus dados es {suma_dados}. Parece una jugada ganadora"

# Decima Cuarta Practica
lista_numeros = [1, 2, 15, 7, 2, 8]

def reducir_lista(lista):
    lista = list(set(lista))
    lista.sort()
    lista.pop(-1)
    return lista

def promedio(lista):
    valor_medio = sum(lista) / len(lista)
    return valor_medio

# Decima Quinta Practica
lista_numeros = [1, 2, 15, 7, 2, 8]
import random

def lanzar_moneda():
    resultado = random.choice(["Cara", "Cruz"])
    return resultado

def probar_suerte(moneda, lista):
    if moneda == "Cara":
        print("La lista se autodestruirá")
        return []
    elif moneda == "Cruz":
        print("La lista fue salvada")
        return lista