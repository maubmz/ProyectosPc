mi_set = set([1,2,3,4,5])
print(type(mi_set))
print(mi_set)

otro_set = {1,2,(1,2,3,4)}
print(type(otro_set))
print(otro_set)

print(2 in mi_set)

s1 = {1,2,3}
s2 = {3,4,5}
s3 = s1.union(s2)
print(s3)

s1.add(6)
s1.remove(1)
s1.discard(8) # Si el elemento no esta el programa sigue sin arrojar error
s1.pop()
print(s1)

s1.clear()
print(s1)
