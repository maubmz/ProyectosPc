from Tarea6.T1 import dia_a_calcular, impresion_dias
from Tarea6.T2 import anio_bisiesto

impresion_dias()
dia_cliente = int(input("Dame el valor de un dia de la semana: "))
dia_calcular = int(input("Que dia quieres que calcule? "))
print(dia_a_calcular(dia_cliente, dia_calcular))

print("----"*20)
print("Punto 2")

anio = int(input("Dame el anio que quieres que calcule si es bisiesto: "))
print(anio_bisiesto(anio))



