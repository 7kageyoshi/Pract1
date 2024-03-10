import characters.Character;
import characters.Peasant;
import characters.Robber;
import characters.Sniper;
import characters.Wizard;
import characters.Warrior;
import characters.Crossbowman;
import characters.Monk;


public class Main {
    public static void main(String[] args) {
        Character peasant = new Peasant();
        Character robber = new Robber();
        Character sniper = new Sniper();
        Character wizard = new Wizard();
        Character warrior = new Warrior();
        Character crossbowman = new Crossbowman();
        Character monk = new Monk();

        System.out.println(peasant.toString());
        System.out.println(robber.toString());
        System.out.println(sniper.toString());
        System.out.println(wizard.toString());
        System.out.println(warrior.toString());
        System.out.println(crossbowman.toString());
        System.out.println(monk.toString());


    }
}
