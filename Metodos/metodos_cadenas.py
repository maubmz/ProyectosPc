cadena1 = "Hola soy Mau"
cadena2 = "Bienvenido"

# Convierte a mayusculas
mayusc = cadena1.upper()
# Convierte en minusculas
minusc = cadena1.lower()

# Primer letra en mayuscula
primer_letra = cadena1.capitalize()

#Buscamos una cadena en otra cadena, si no hay coincidencia es -1
busqueda_find = cadena1.find("Hola")

# Buscamos una cadena en otra, si no hay coincidencia lanza un error
busqueda_index = cadena1.index("M")

# Si es numerico lanza true, sino devolvemos false
es_numerico = cadena1.isnumeric()

# Si es alfanumerico devolvemos true, sino devolvemos false
es_alfanumerico = cadena1.isalpha()

# Buscamos una cadena en otra cadena y devuelve la cantidad de veces que coincida
contar_coincidencias = cadena1.count("a")

# Contamos los caracteres de una cadena
contar_caracteres = len(cadena1)

print(mayusc)
print(minusc)
print(primer_letra)
print(busqueda_find)
print(busqueda_index)
print(es_numerico)
print(es_alfanumerico)
print(contar_coincidencias)
print(contar_caracteres)

