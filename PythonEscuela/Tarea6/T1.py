
#Hacemos un arreglo con los dias de la semana
dias_semana = ["domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"]

#El metodo nos imprime todos los dias con su respectivo indice
def impresion_dias():
    for dia in dias_semana:
        print(dia + " es el numero: " + str(dias_semana.index(dia)))


#Evalua que dia de la semana sera con la suma de lo que recibe
def dia_a_calcular(dia, dia_calcular):
    calculo_dia = dia + dia_calcular

    return dias_semana[calculo_dia]






