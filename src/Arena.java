public class Arena{
    void fight(Characeter p1, Characetr p2){
        while (p1.lifePoints>0 && p2.lifePoints>0){
            p2.attacked(p1.attack());
            if (p2.lifePoints <= 0){
                p1.attacked(p2.attack)
            }
        }
    }
}