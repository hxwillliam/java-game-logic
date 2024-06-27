import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(6, 1);
        Weapon axe = new Weapon(8, 1);
        Shield.ShieldType shieldType = Shield.ShieldType.METAL; 
        Human human = new Human("Human", "M", sword);
        Orc orc = new Orc("Orc", "F", axe); 
        arena.fight(human, orc);
    }

    static int rollDice(int faces, int number) {
        int total = 0;
        for (int i = 0; i < number; i++) {
            total += new Random().nextInt(faces) + 1;
        }
        return total;
    }
}