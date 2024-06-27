public abstract class Character{
    String name;
    String gender;
    int lifePoints;
    Weapon weapon;
    Shield shield;

    abstract int attack();
    abstract void attacked(int damage);
}