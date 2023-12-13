import matplotlib.pyplot as plt

def contar_frecuencias(texto):
    frecuencias = {}
    total_caracteres = 0
    for caracter in texto:
        if caracter.isalpha():
            caracter = caracter.lower()
            frecuencias[caracter] = frecuencias.get(caracter, 0) + 1
            total_caracteres += 1

    frecuencia_relativa = {letra: freq / total_caracteres for letra, freq in frecuencias.items()}
    return frecuencia_relativa

def generar_histograma(frecuencias, idioma):
    letras = list(frecuencias.keys())
    valores = list(frecuencias.values())

    plt.bar(letras, valores, color='blue')
    plt.title(f'Histograma de Frecuencias - Idioma: {idioma}')
    plt.xlabel('Letras')
    plt.ylabel('Frecuencia')
    plt.show()

def detectar_idioma(frecuencias, idioma_seleccionado):
    total_caracteres = sum(frecuencias.values())
    frecuencia_relativa = {letra: freq / total_caracteres for letra, freq in frecuencias.items()}

    # Frecuencias típicas para cada idioma (solo letras del alfabeto)
    frecuencias_tipicas = {
        'ingles': {'a': 0.082, 'e': 0.127, 'i': 0.070, 'o': 0.075, 'u': 0.027},
        'frances': {'a': 0.092, 'e': 0.157, 'i': 0.079, 'o': 0.082, 'u': 0.075},
        'aleman': {'a': 0.065, 'e': 0.170, 'i': 0.075, 'o': 0.097, 'u': 0.027, 'ä': 0.056, 'ö': 0.025, 'ü': 0.018, 'ß': 0.037},
        'portugues': {'a': 0.146, 'e': 0.126, 'i': 0.120, 'o': 0.116, 'u': 0.077},
        'italiano': {'a': 0.117, 'e': 0.097, 'i': 0.116, 'o': 0.110, 'u': 0.033}
        # Puedes agregar más idiomas según sea necesario
    }

    diferencias = {}
    for idioma, frecuencias_idioma in frecuencias_tipicas.items():
        if idioma == idioma_seleccionado:
            diferencia = sum(abs(frecuencia_relativa.get(letra, 0) - freq_idioma) for letra, freq_idioma in frecuencias_idioma.items())
            diferencias[idioma] = diferencia

    idioma_detectado = min(diferencias, key=diferencias.get)
    return idioma_detectado

if __name__ == "__main__":
    texto = "Zx rnplibbi zxvanr Gi lvira s’izzirxhiq sxra zx rnplibbi zxvanr. Ibbi iae ybpa gnbvi mpi kibbi mpi g’xlxva xlxre. Zx rnplibbi zxvanr iae obxrkui xlik sia lnbiea obipa ie sia tbipqa qnphia. G’xv pr hxqxhi ynpq zx lnvepqi ie ynpq znr libn. X b’vreiqvipq si zx zxvanr, vb j x pr hqxrs axbnr xlik pri exobi ie mpxeqi kuxvaia ynpq xkkpivbbvq zia xzva. Znr kuxe xsnqi ai obneevq apq bi kxrxyi silxre bx eibilvavnr. Bx kpvavri iae bx yviki yqitiqii si zx zxvanr. K’iae vkv mpi gi kpvavri sia hxeixpf ie sia yxevaaiqvia. Ynpq xbbiq sxra zx kuxzoqi, gi snva znreiq pr iakxbviq. Ibbi ai avepi xp onpe sp knpbnvq, x sqnvei. G’xv sikvsi si yivrsqi bia zpqa ir gxpri ie s’j vraexbbiq znr yvxrn. X hxpkui, k’iae zx axbbi si oxvr, xlik lpi apq znr gxqsvr. Gi zi aira eqia ovir sxra zx rnplibbi zxvanr !"

    idioma_seleccionado = 'aleman'  # Cambia aquí el idioma deseado
    frecuencias_texto = contar_frecuencias(texto)
    idioma_detectado = detectar_idioma(frecuencias_texto, idioma_seleccionado)

    print(f"El texto está escrito en: {idioma_detectado}")

    # Mostrar histograma con el idioma detectado
    generar_histograma(frecuencias_texto, idioma_detectado)

