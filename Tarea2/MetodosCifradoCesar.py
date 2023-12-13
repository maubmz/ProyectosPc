
#El metodo abre el archivo y solo nos regresa el numero de palabras en el archivo cargado
def carga_Palabras():
    #Abrimos el archivo y lo ponemos en modo lectura
    archivo = open('words.txt', 'r')
    renglon = archivo.readline()
    #Dividimos el renglon leido por espacios entre cada palabra
    palabras = renglon.split()
    #Imprimimos el numero de palabras que encontraron divididas en la linea leida por el metodo readline
    print(len(palabras), 'palabras leidas')
    return palabras


#Cargamos el archivo y regresamos la primer linea del archivo cargado
def carga_Cifrado():
    #Cargamos el archivo en modo lectura con el nombre "words.txt"
    archivo = open('words.txt', 'r')
    renglon = archivo.readline()
    #Regresamos el primer renglon leido por el metodo readline
    return renglon


def cifra_Cesar(cadena, llave):
    #Si la llave es menor a 0 se ingresa a la condicion donde a la llave se le resta 26
    if llave < 0:
        llave = 26 - llave
    cadena = cadena.lower()
    nueva_Cadena = ""
    alfabeto = 'abcdefghijklmnopqrstuvwxyz'
    for l in cadena:
        if l in alfabeto:
            posicion_Letra = alfabeto.find(l)
            nueva_Cadena = nueva_Cadena + alfabeto[((posicion_Letra + llave) % 26)]
        else:
            nueva_Cadena = nueva_Cadena + 1
    return nueva_Cadena


def descifra_Cesar(cadena, llave):
    return cifra_Cesar(cadena, 26 - llave)


def get_Aciertos(lista_Palabras, diccionario):
    num_Aciertos = 0
    for pal in lista_Palabras:
        if pal in diccionario:
            num_Aciertos = num_Aciertos + 1
    return num_Aciertos

