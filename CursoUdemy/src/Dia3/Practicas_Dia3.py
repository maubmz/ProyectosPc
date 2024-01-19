# Index
# Primer Practica
palabra = "ordenador"
print(palabra[4])

# Segunda Practica
frase = "En teoría, la teoría y la práctica son los mismos. En la práctica, no lo son."
print(frase.index("práctica"))

# Tercer Practica
frase = "En teoría, la teoría y la práctica son los mismos. En la práctica, no lo son."
print(frase.rindex("práctica"))

# Extrar Sub-string (slicing)
# Cuarta Practica
frase = "Controlar la complejidad es la esencia de la programación"
print(frase[0:9])

# Quinta Practica
frase = "Nunca confíes en un ordenador que no puedas lanzar por una ventana"
print(frase[8::3])

# Sexta Practica
frase = "Es genial trabajar con ordenadores. No discuten, lo recuerdan todo y no se beben tu cerveza"
print(frase[::-1])

# Metodos String
# Septima Practica
frase = "Especialmente en las comunicaciones electrónicas, la escritura enteramente en mayúsculas equivale a gritar."
print(frase.upper())

# Octava Practica
lista_palabras = ["La","legibilidad","cuenta."]
print(" ".join(lista_palabras))

# Novena Practica
frase = ("Si la implementación es difícil de explicar, puede que sea una mala idea."
         .replace("difícil","fácil")).replace("mala","buena")
print(frase)

# Propiedades String
#Decima Practica
print("Repetición" *15)

# Undecima Practica
haiku = """Tierra mojada
mis recuerdos de viaje,
entre las lluvias"""

print("agua" not in haiku)

# Duodecima practica
palabra = "electroencefalografista"
print(len(palabra))

# Decimotercero practica
mi_lista = [1,True,3.1416,"Miguel",'Hola']

# Decimocuarto practica
medios_transporte = ["avión", "auto", "barco", "bicicleta"]
medios_transporte.append("motocicleta")

# DecimoQuinta practica
frutas = ["manzana", "banana", "mango", "cereza", "sandía"]
eliminado = frutas.pop(2)
print(eliminado)

# DecimoSexta Practica
mi_dic = {"nombre": "Karen", "apellido": "Jurgens", "edad":35, "ocupacion":"Periodista"}

# DecimoSeptima Practica
mi_dict = {"valores_1":{"v1":3,"v2":6},"puntos":{"points1":9,"points2":[10,300,15]}}
print(mi_dict["puntos"]["points2"][1])

# DecimoOctava Practica
mi_dic = {"nombre":"Karen", "apellido":"Jurgens", "edad":35, "ocupacion":"Periodista"}
mi_dic["edad"] = 36
mi_dic["ocupacion"] = "Editora"
mi_dic["pais"] = "Colombia"
print(mi_dic)

# DecimoSeptima Practica
mi_tupla = (1, 2, 3, 2, 3, 1, 3, 2, 3, 3, 3, 1, 3, 2, 2, 1, 3, 2)
print(mi_tupla.count(2))

# DecimoOctava Practica
mi_tupla = (1, 2, 3, 2, 3, 1, 3, 2)
mi_lista = list(mi_tupla)

# DecimoNovena Practica
mi_tupla = (1, 2, 3, 4)
a, b, c, d = mi_tupla

# Sets
# Vigesima Practica
mi_set_1 = {1, 2, "tres", "cuatro"}
mi_set_2 = {"tres", 4, 5}

mi_set_3 = mi_set_1.union(mi_set_2)

# VigesimaPrimera Practica
sorteo = {"Camila", "Margarita", "Axel", "Jorge", "Miguel", "Mónica"}
sorteo.pop()

# VigesimaSegunda Practica
sorteo = {"Camila", "Margarita", "Axel", "Jorge", "Miguel", "Mónica"}
sorteo.add("Damián")

# Booleanos
# VigesimaTercera Practica
prueba = 10 > 3 + 34

# VigesimaCuarta Practica
print(17834/34 > 87*56)

# VigesimaQuinta Practica
print(25**0.5 == 5)

