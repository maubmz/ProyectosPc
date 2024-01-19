precios_cafe = [('capuchino',1.50),('expreso',1.20),('moka',1.90)]

# for cafe, precio in precios_cafe:
#     print(precio * 0.45)

def cafe_mas_caro(lista_precios):
    precio_mayor = 0
    cafe_mas_caro = ''
    for cafe, precio in lista_precios:
        if precio > precio_mayor:
            precio_mayor = precio
            cafe_mas_caro = cafe
        else:
            pass
    return (precio_mayor, cafe_mas_caro)

precio, cafe = cafe_mas_caro(precios_cafe)
print(f'El cafe mas caro es: {cafe} con el precio de {precio}')
