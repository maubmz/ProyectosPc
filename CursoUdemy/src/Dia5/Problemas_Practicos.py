# Primer Ejercicio
def devolver_distintos(num1, num2, num3):
    total = num1 + num2 + num3
    if total > 15:
        print(f'El numero es mayor a 15 y el total es {total}')
        if num1 > num2 and num1 > num3:
            return num1
        elif num2 > num1 and num2 > num3:
            return num2
        else:
            return num3
    elif total < 10:
        print(f'El numero es menor a 10 y el total es {total}')
        if num1 < num2 and num1 < num3:
            return num1
        elif num2 < num1 and num2 < num3:
            return num2
        else:
            return num3
    elif total >= 10 and total <= 15:
        print(f'El numero es mayor a 10 y menor a 15, el total es {total}')
        if (num1 > num2 and num1 < num3) or (num1 < num2 and num1 > num3):
            return num1
        if (num2 > num1 and num2 < num3) or (num2 < num1 and num2 > num3):
            return num2
        else:
            return num3

# Primer Ejercicio Video
def devolver_distinto(num1, num2, num3):
    total = num1 + num2 + num3
    lista = [num1, num2, num3]
    if total > 15:
        return max(lista)
    elif total < 10:
        return min(lista)
    else:
        lista.sort()
        return lista[1]

# Segundo Ejercicio
def palabra(palabra):
    palabra_lista = set(palabra.lower())
    palabra_lista = list(palabra_lista)
    palabra_lista.sort()
    return palabra_lista

# Tercer Ejercicio
def verificar( *args):
    ceros = 0
    for arg in args:
        if arg == 0:
            ceros += 1
    if ceros == 2:
        return True
    else:
        return False

# Cuarto Ejercicio
def contar_primos( num1):
    lista = []
    for num in range(0, num1):
        if num % 2 == 0 and num != 0:
            lista.append(num)
    return lista

