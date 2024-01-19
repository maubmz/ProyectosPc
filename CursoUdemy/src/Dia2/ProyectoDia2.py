nombre = input("Dime cual es tu nombre: ")
ventas = float(input("Dime cuanto has vendido en este mes: "))
comision = round(ventas * 13 / 100, 2)

resultado = print(f"{nombre} tu has vendio {ventas} "
                  f"y tus comisiones son de {comision}")



