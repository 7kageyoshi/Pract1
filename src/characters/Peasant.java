package characters;

public class Peasant extends Character {
    protected int farmingLevel;
    protected int farmingExperience;
    protected boolean isWorking;

    public Peasant() {
        super();
        this.farmingLevel = 1;
        this.farmingExperience = 0;
        this.isWorking = false;
    }


    @Override
    public void attack() {
        System.out.println("Крестьянин атакует!");
    }

    @Override
    public void defend() {
        System.out.println("Крестьянин защищается!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Крестьянин использует специальную способность!");
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }
}

