package characters;

public class Warrior extends Character {
    protected int bravery;
    protected int weaponDamage;

    public Warrior(String name, Coordinates coordinates) {
        super(coordinates);
        this.bravery = 80;
        this.weaponDamage = 20;
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
    public String toString() {
        return "Воин";
    }
}


