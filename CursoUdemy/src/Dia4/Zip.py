nombres = ['Ana', 'Hugo', 'Valeria']
edades = [65, 29, 42, 55]
ciudades = ['Lima', 'Madrid', 'Mexico']

combinados = list(zip(nombres, edades, ciudades))
print(combinados)

for nombre, edad, ciudad in combinados:
    print(f"{nombre} tiene {edad} anios y vive en {ciudad}")


