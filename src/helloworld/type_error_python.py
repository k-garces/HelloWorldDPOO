def g(a):
    return {a, a+1, a+2, a+3} #este es un set, en donde no se repiten elementos, no son ordenados ni permiten acceder a sus elementos mediante índices, ya que no garantizan un orden fijo, ¿cómo se soluciona? conviertiendo a list

print("The element in position 2:" , g(5)[2])
