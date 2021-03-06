package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Sword;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;

public class Knight extends Warrior implements IAttack, IDefend {
    private Sword sword;

    public Knight(String name, int treasury, Sword sword){
        super(name, "Knight", 75, treasury, 100);
        this.sword = sword;
    }

    public Sword getSword() {
        return this.sword;
    }

    public int getSwordValue(){
        return this.sword.getSwordValue();
    }


    public void attack(IDefend iDefend){
        int damage = sword.getSwordValue();
        iDefend.defend(damage);
    }

    public void defend(int damage){
        int healthHit = damage - getArmour();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }


}
