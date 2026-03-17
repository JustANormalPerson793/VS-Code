class Personaje:
    nombre = "Default"
    fuerza = 0
    inteligencia = 0
    defensa = 0
    vida = 0
    aguante = fuerza*vida
    def __init__(self, nombre, fuerza, inteligencia, defensa, vida):
        self.nombre = nombre
        self.fuerza = fuerza
        self.inteligencia = inteligencia
        self.defensa = defensa
        self.vida = vida

    def atributos(self):
        print(self.nombre, ":", sep= " ")
        print("-el nombre de mi personaje es: ", mi_personaje.nombre)
        print("-Fuerza: ", self.fuerza)
        print("-inteligencia: ", self.inteligencia)
        print("-Defensa: ", self.defensa)
        print("-Vida: ", self.vida)
    
    def level_up(self, fuerza, inteligencia, defensa):
        self.fuerza = self.fuerza + fuerza
        self.inteligencia = self.inteligencia + inteligencia
        self.defensa = self.defensa + defensa

    def its_life(self):
        return self.vida > 0
    
    def die(self):
        self.vida = 0
        print(mi_personaje.nombre, "ha muerto")

    def damage(self, enemy):
        return self.fuerza - enemy.defensa
    
    def attack(self, enemy):
        damage = mi_personaje.damage(enemy)
        enemy.vida = enemy.vida - damage
        print(self.nombre, "ha ralizado", damage, "puntos de daño a", enemy.nombre)
        print("La vida de ", enemy.nombre, "es", enemy.vida)

in_name = str(input("Cual es tu nombre? "))
in_force = int(input("Cual es tu fuerza? "))
in_inte = int(input("Cual es tu inteligencia "))
in_defe = int(input("Cual es tu defensa "))
in_li = int(input("Cual es tu vida "))
mi_personaje = Personaje(in_name, in_force, in_inte, in_defe, in_li)
mi_enemigo = Personaje("Enemy Stando", 8, 5, 3, 100)
mi_personaje.atributos()
mi_personaje.attack(mi_enemigo)
mi_enemigo.atributos()