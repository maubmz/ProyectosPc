monedas = 5

while monedas > 0:
    print(f"Tengo {monedas} monedas")
    monedas -= 1
else:
    print("No tengo monedas")

respuesta = 's'
# while respuesta == 's':
#     respuesta = input('quieres seguis? (s/n): ')
# else:
#     print('gracias')

# while respuesta == 's':
#     pass
# print('Hola')

nombre = input("Ingrese su nombre: ")
for letra in nombre:
    if letra == 'r':
        break
    print(letra)

for letra in nombre:
    if letra == 'r':
        continue
    print(letra)