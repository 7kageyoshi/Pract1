package characters;

public class Warrior extends Character implements Steppable {
    protected int bravery;
    protected int weaponDamage;

    public Warrior(String name, Coordinates coordinates) {
        super(coordinates);
        this.bravery = 80;
        this.weaponDamage = 20;
        this.initiative = 2;
    }

    @Override
    public void attack() {
        System.out.println("Воин наносит мощный удар!");
    }

    @Override
    public void defend() {
        System.out.println("Воин вступает в бой!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Воин вызывает к себе дополнительную силу!");
        this.bravery += 5;
    }

    @Override
    public void step() {
        System.out.println("Воин делает шаг.");
    }

    @Override
    public String toString() {
        return "Воин";
    }
}



