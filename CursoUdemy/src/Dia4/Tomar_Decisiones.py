
if 5 == 2:
    print("Es correcto")
else :
    print("No es correcto")
print("********"*10)

mascota = 'perro'
if mascota == 'gato' :
    print('Tienes un gato')
elif mascota == 'perro' :
    print('Tienes un perro')
elif mascota == 'pez' :
    print('Tienes un pez')
else :
    print('No se que animal tienes')
print("********"*10)

edad = 16
calificacion = 9
if edad < 18 :
    print("Eres menor de edad")
    if calificacion >= 7 :
        print("Aprobado")
    else :
        print("No aprobado")
else :
    print("Eres mayor de edad")