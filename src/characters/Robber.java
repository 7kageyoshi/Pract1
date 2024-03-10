package characters;

public class Robber extends Character {
    protected int agility;
    protected int stealthLevel;
    protected boolean isInvisible;

    public Robber() {
        super();
        this.agility = 10;
        this.stealthLevel = 5;
        this.isInvisible = false;
    }

    @Override
    public void attack() {
        System.out.println("Разбойник наносит удар!");
    }

    @Override
    public void defend() {
        System.out.println("Разбойник уклоняется от атаки!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Разбойник становится невидимым!");
        this.isInvisible = true;
    }

    @Override
    public String toString() {
        return "Разбойник";
    }
}
