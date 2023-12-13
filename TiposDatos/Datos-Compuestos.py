#Creando una lista (Se puede modificar)
lista = ["Lucas Dalto", "Soy Dalto", True, 1.83]

#Creando una Tupla (No se pueden modificar)
tupla = ("Lucas Dalto", "Soy Dalto", True, 1.83)

#Esto es valido
lista[3] = "Danna"
#Esto no es valido
#tupla[3] = "Castillo"

#Creando un conjunto (set)
#Cambia el orden de los elementos, Se puede modificar el tamanio pero no el elemento y se puede reconstruir
#no se puede acceder a elementos por el indice y no alamacena elementos duplicados
conjunto = {"Lucas Dalto", "Soy Dalto", True, 1.83}

#Creando un diccionario (dict)
#Estructura= key : value
diccionario = {
    'nombre' : "Mau",
    'apellido' : "Baeza",
    'le_gusta_programar?' : True,
    'altura' : 1.83,
    'dato_duplicado' : "Mau"
}
print(diccionario['altura'] + 0.02)

