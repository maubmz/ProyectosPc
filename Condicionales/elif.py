ingreso_mensual = 10000
gasto_mensual = 6000

#if anidados y else if (elif)
if ingreso_mensual >= 10000:
    if ingreso_mensual - gasto_mensual > 5000:
        print("Estas bien")
    else:
        print("Tienes que reducir los gastos")
elif ingreso_mensual > 1000:
    print("Estas bien en latinoamerica")
elif ingreso_mensual > 500:
    print("Estas con un sueldo normal")
else:
    print("Eres pobre")