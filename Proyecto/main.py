from Tarea3.Cargar import letrasDeTexto, descifraSustituye

if __name__ == '__main__':
    cifrado_Aleman = "z Fajg omvrv usg pey Kuto. Lemvez sdved omdp pme Izsov sdp pez Iusqk. Kmez omdp oekz cmete Azxude: pez Yuxed, pme Teiez, pme Dmezed, puo Kezr sdp pme Tsdxed sdp pez Puzy. Kezr sdp Tsdxe omdp cay Izsovfazi sdp ped Zmjjed xeoqküvrv.".lower()
    alfabeto_aleman = "abcdefghijklmnopqrstuvwxyzäöüß"
    llave_aleman_al = "zyxwvutsrqponmlkjihgfedcbaäöüß"
    #                 "XXXXeXXXXXXXXXXXXXXXXXXXXXXXüX"
    #                 "XXXliXXXXXXXeXXsXXaXXXXXreXXXX"
    historial_Aleman = {}

    for e in alfabeto_aleman:
        historial_Aleman[e] = 0

    frecuencia = letrasDeTexto(alfabeto_aleman, historial_Aleman, cifrado_Aleman)
    print(frecuencia)
    print(cifrado_Aleman)
    b = descifraSustituye(cifrado_Aleman, llave_aleman_al)
    print(b)

