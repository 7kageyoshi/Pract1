package characters;

public class Monk extends Character {
    protected int meditationLevel;
    protected boolean isMeditating;

    public Monk() {
        super();
        this.meditationLevel = 50;
        this.isMeditating = false;
    }

    @Override
    public void attack() {
        System.out.println("Монах использует боевые навыки!");
    }

    @Override
    public void defend() {
        System.out.println("Монах уклоняется от атаки и защищает себя молитвой!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Монах впадает в глубокую медитацию!");
        this.isMeditating = true;
    }

    @Override
    public String toString() {
        return "Монах";
    }
}

