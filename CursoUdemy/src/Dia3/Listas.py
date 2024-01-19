mi_lista = ['a','b','c']
mi_lista2 = ['d','e','f']
mi_lista3 = mi_lista + mi_lista2
resultado = mi_lista[0]

mi_lista3[0] = 'alfa'
mi_lista3.append('g')
eliminado = mi_lista3.pop() #Elimina el ultimo elemento

lista = ['g','o','b','m','c']
lista.sort() # ordena la lista
print(lista)
lista.reverse() # ordena la lista empezando por la z
print(lista)

print(type(mi_lista))
print(resultado)
print(mi_lista[0:])
print(mi_lista3)
print(eliminado)

print("Otra lista")
otra_lista = ['hola',55,6.1]
print(len(otra_lista))







