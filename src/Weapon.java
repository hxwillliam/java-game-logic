public class Weapon{
    int diceFaces;
    int diceNumber;

    Weapon(int diceFaces, int diceNumber){
        this.diceFaces = diceFaces;
        this.diceNumber = diceNumber;
    }

     int damage(){
        {
            return Main.rollDice(diceFaces, diceNumber);
        }
     }
}
