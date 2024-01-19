texto_usuario = input("Dame un texto: ").lower()
letras = []
letras.append(input("Dame una letra que quieres que analice del texto: ").lower())
letras.append(input("Dame una segunda letra que quieres que analice del texto: ").lower())
letras.append(input("Dame una tercera letra que quieres que analice del texto: ").lower())

# Punto 1
print("\nCantidad de Letras")
print(f"La letra {letras[0]} aparece {texto_usuario.count(letras[0])} veces")
print(f"La letra {letras[1]} aparece {texto_usuario.count(letras[1])} veces")
print(f"La letra {letras[2]} aparece {texto_usuario.count(letras[2])} veces")

# Punto 2
print("\nCantidad de palabras")
numero_palabras = texto_usuario.split(" ")
print(f"El numero de palabras del texto son {len(numero_palabras)}")

# Punto 3
print("\nLetras de inicio y de fin")
print(f"La primer letra del texto es {texto_usuario[0]}")
print(f"La ultima letra del texto es {texto_usuario[-1]}")

# Punto 4
print("\nTexto invertido")
numero_palabras.reverse()
texto_invertido = " ".join(numero_palabras)
print(f"El texto invertido es {texto_invertido}")

# Punto 5
print("\nAparece la palabra 'Python' en el texto")
palabra = "python" in texto_usuario
dic = {True:"Si", False:"No"}
print(f"La palabra {palabra} aparece en el texto ? {dic[palabra]}")




