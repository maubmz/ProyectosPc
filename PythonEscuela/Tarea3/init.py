from Tarea3.Cargar import cargaCifrado

cifrado = cargaCifrado('cifrado')
histo = {}
alfabeto = 'abcdefghijklmnopqrstuvwxyz'
llave = 'rhkqvXyplmxbXXoaXeuzcXgXtX'
print(len(llave))

for e in alfabeto:
    histo[e] = 0
print(histo)
print('--' * 50)
for letra in cifrado:
    if letra in alfabeto:
        histo[letra] += 1
print(histo)

# b = descifraSustituye(cifrado, llave)
# print(b)
print('--' * 50)