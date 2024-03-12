package characters;

public class Monk extends Character {
    protected int meditationLevel;
    protected int wisdom;

    public Monk(String name, Coordinates coordinates) {
        super(coordinates);
        this.meditationLevel = 5;
        this.wisdom = 100;
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
    public String toString() {
        return "Монах";
    }
}


