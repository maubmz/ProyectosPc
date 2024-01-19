def suma(**kwargs):
    total = 0
    for clave, valor in kwargs.items():
        print(f"{clave} es igual a {valor}")
        total += valor
    return total

print(suma(x=3, y=5, z=2))

def suma1(num1, num2, *args, **kwargs):
    print(f'El primer valor es {num1}')
    print(f'El segundo valor es {num2}')
    for arg in args:
        print(f'El arg es {arg}')
    for clave, valor in kwargs.items():
        print(f'El kwarg su clave es {clave} y su valor es {valor}')

args = [40,30,30]
kwargs = {'x':'uno', 'y':'dos', 'z':'tres'}
suma1(15, 50, 40, 30, 30, x=6, y=6, z=19)
print("*********"*10)
suma1(15, 20, args, kwargs)
print("*********"*10)
suma1(20, 185, *args, **kwargs)
