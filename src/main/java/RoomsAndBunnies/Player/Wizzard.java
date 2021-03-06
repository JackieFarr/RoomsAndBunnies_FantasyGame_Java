package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Dragon;
import RoomsAndBunnies.Enums.WizSpell;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;

public class Wizzard extends Magician implements IAttack, IDefend {

    WizSpell wizSpell;
    Dragon dragon;

    public Wizzard(String name, int treasury, WizSpell wizSpell, Dragon dragon){
        super(name, "Wizzard", 200, treasury);
        this.wizSpell = wizSpell;
        this.dragon = dragon;
    }

    public WizSpell getWizSpell(){
        return this.wizSpell;
    }

    public Dragon getDragon(){
        return this.dragon;
    }

    public int getDragonHealth(){
        return this.dragon.getDragonValue();
    }

    public int getWizSpellValue(){
        return this.wizSpell.getWizSpellValue();
    }


    public void attack(IDefend iDefend){
        int damage = dragon.getDragonValue();
        iDefend.defend(damage);
    }

    public void defend(int damage){
        int healthHit = damage - getDragonHealth();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }

}
