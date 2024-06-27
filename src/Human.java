public class Human extends Character{
    Human(String name, String gender, Weapon weapon, Shield shield){
        this.name = name;
        this.gender = gender;
        this.weapon = weapon;
        this.shield = shield;
        this.lifePoints = 10 + Main.rollDice(10, 2);
}

int attack(){
    return weapon.damage();
}

void attacked(int damage){
    lifePoints -= damage;
    }
}