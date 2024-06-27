

public class Orc extends Character{
    Orc(String name, String gender, Weapon weapon, Shield shield){
        this.name = name;
        this.gender = gender;
        this.weapon = weapon;
        this.shield = shield;
        this.lifePoints = 20 + Main.rollDice(10, 2);
    }
}


void attacked(int damage){
    lifePoints -= damage;
}


