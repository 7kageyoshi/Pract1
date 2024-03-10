package characters;

public class Sniper extends Character {
    protected int accuracy;
    protected int range;
    protected boolean isHidden;

    public Sniper() {
        super();
        this.accuracy = 90;
        this.range = 1000;
        this.isHidden = false;
    }

    @Override
    public void attack() {
        System.out.println("Снайпер наносит точный выстрел!");
    }

    @Override
    public void defend() {
        System.out.println("Снайпер прячется от атаки!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Снайпер становится невидимым!");
        this.isHidden = true;
    }

    @Override
    public String toString() {
        return "Снайпер";
    }
}

