
def anio_bisiesto(anio):
    #Primero comprobamos si el residuo del anio dividido entre 4 da 0 entra a los if's
    if anio % 4 == 0:
        if anio % 100 == 0:
            # Si su residuo entre 4, 100 y 400 es 0, regresa la sentencia if, de lo contrario regresa el else
            if anio % 400 == 0:
                return "es anio bisiesto aunque sea divisible entre 100 por que es divisible entre 400"
            #En caso de que su residuo entre 4, 100 sea 0, pero no entre 400 se regresa el mensaje
            else:
                return "no es anio bisiesto, por que es divisible entre 100"
        #Si su residuo no es 0 dividido sobre 100 regresa el mensaje
        return "es anio bisiesto"
    else:
        return "No es anio bisiesto"




