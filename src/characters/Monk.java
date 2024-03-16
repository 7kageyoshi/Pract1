package characters;

public class Monk extends Character implements Steppable {
    protected int meditationLevel;
    protected int wisdom;

    public Monk(String name, Coordinates coordinates) {
        super(coordinates);
        this.meditationLevel = 5;
        this.wisdom = 100;
        this.initiative = 2;
    }

    @Override
    public void attack() {
        System.out.println("Монах использует свои знания в бою!");
    }

    @Override
    public void defend() {
        System.out.println("Монах защищается молитвой!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Монах входит в состояние медитации!");
        this.meditationLevel += 3;
    }

    @Override
    public void step() {
        System.out.println("Монах идет к месту молитвы.");
    }

    @Override
    public String toString() {
        return "Монах";
    }
}



