package characters;

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;

    public Character() {
        this.name = "Unknown";
        this.health = 100;
        this.strength = 10;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void useSpecialAbility();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}


