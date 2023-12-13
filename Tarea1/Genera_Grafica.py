import matplotlib.pyplot as plt

def generador_grafica():
    # Datos
    n_values = list(range(1, 11))  # Valores de n desde 1 hasta 10
    array_sizes = [2**n for n in n_values]

    # Crear la gráfica
    plt.figure(figsize=(8, 6)) #Tamano de la imagen de la grafica
    plt.plot(n_values, array_sizes, marker='o', linestyle='-', color='b')
    plt.title('Tamaño de Arreglo en función de n')
    plt.xlabel('n')
    plt.ylabel('Tamaño del Arreglo (2^n)')
    plt.grid(True)

    # Mostrar la gráfica
    plt.show()


