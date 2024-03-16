package characters;

public class Robber extends Character implements Steppable {
    protected int agility;
    protected int stealth;

    public Robber(String name, Coordinates coordinates) {
        super(coordinates);
        this.agility = 70;
        this.stealth = 80;
        this.initiative = 2;
    }

    @Override
    public void attack() {
        System.out.println("Разбойник наносит быстрый удар!");
    }

    @Override
    public void defend() {
        System.out.println("Разбойник использует скрытность для защиты!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Разбойник исчезает из виду!");
        this.stealth += 10;
    }

    @Override
    public void step() {
        System.out.println("Разбойник двигается к ближайшей жертве.");
    }

    @Override
    public String toString() {
        return "Разбойник";
    }
}


