from Tarea3.Cargar import cargaCifrado, descifraSustituye

cifrado = cargaCifrado('cifrado')
histo = {}
alfabeto = 'abcdefghijklmnopqrstuvwxyz'
llave="lzvxwerpydbqktacjinsgXuhoX"

# Imprimimos el alfabeto antes de mandarlo a obtener las letras con mas frecuencia del texto
for e in alfabeto:
    histo[e] = 0
print(histo)
print('--' * 50)

# Obtenemos la letras del alfabeto que tiene el texto con mas frecuencia
for letra in cifrado:
    if letra in alfabeto:
        histo[letra] += 1
print(histo)

# Desciframos el texto con la llave y el texto cifrado para obtener el texto ya descifrado y comprobar si funciona la llave
b = descifraSustituye(cifrado, llave)
#Imprimimos el texto descifrado
print(b)
print('--' * 50)

