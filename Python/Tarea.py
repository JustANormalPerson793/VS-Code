bio = int(input("Cuanto sacaste en biologia?"))
mat = int(input("Cuanto sacaste en matemáticas"))
leng = int(input("Cuanto sacaste en lengua y literatura"))
if 0 < bio < 6:
    print("Tienes que estudiar más biologia")
if 0 < mat < 6:
    print("Tienes que estudiar más matemáticas")
if 0 < leng < 6:
    print("Tienes que estudiar más lengua y literatura")
if bio >= 7:
    print("Tienes una calificacion decente en biologia")
if mat >= 7:
    print("Tienes una calificacion decente en matemáticas")
if leng >= 7:
    print("Tienes una calificacion decente en lengua y literatura")