lista = ['a','b','c','d']

for letra in lista:
    numero_letra = lista.index(letra) + 1
    print(f"letra {numero_letra}: {letra}")
print('*****'*10)

lista = ['pablo','laura','fede','luis','julia']
for nombre in lista:
    if nombre.startswith('l'):
        print(nombre)
    else:
        print("nombre que no comienza con l")
print('*****'*10)

numeros = [1,2,3,4,5]
mi_valor = 0
for numero in numeros:
    mi_valor = mi_valor + numero
print(mi_valor)
print('*****'*10)

for letra in 'python es genial':
    print(letra)
print('*****'*10)

for a,b in [[1,2],[3,4],[5,6]]:
    print(a)
    print(b)
print('*****'*10)

dic = {'clave1':'a','clave2':'b','clave3':'c'}
for item in dic.items():
    print(item)
for item in dic.values():
    print(item)
for a,b in dic.items():
    print(f"{a} y {b}")

print('*****'*10)



