import pandas as pd

def generador_tabla():
    # Datos
    n_values = list(range(1, 11))  # Valores de n desde 1 hasta 10
    array_sizes = [2**n for n in n_values]

    # Crear un DataFrame con pandas
    data = {'n': n_values, 'Tamaño del arreglo (2^n)': array_sizes}
    df = pd.DataFrame(data)

    # Imprimir la tabla
    print(df)
