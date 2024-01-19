from pathlib import Path

base = Path.home()
print(base)

guia = Path(base, "Europa", "Espania", Path("Bacelona","Sagrada Familia.txt"))
print(guia)

guia2 = guia.with_name("La_pedredra.txt")
print(guia2)

# Devuelve el antecesor mas cercano de la ruta
print(guia.parent)

# Encuentra todas las rutas dentro del metodo glob que exista
'''for txt in Path(guia).glob("**/*.txt"):
    print(txt)'''


# Metodo relative_to devuelve un nuevo objeto path
'''
guia = Path("Europa", "espania", "Barcelona", "Sagrada Familia.txt")
en_europa = guia.relative_to(Path("Europa"))
en_espania = guia.relative_to(Path("Europa", "Espania"))
print(en_europa)
print(en_espania)
'''
