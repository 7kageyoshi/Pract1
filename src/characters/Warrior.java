package characters;

public class Warrior extends Character {
    protected int armor;
    protected int stamina;
    protected boolean isBlocking;

    public Warrior() {
        super();
        this.armor = 50;
        this.stamina = 100;
        this.isBlocking = false;
    }

    @Override
    public void attack() {
        System.out.println("Копейщик атакует мощным ударом!");
    }

    @Override
    public void defend() {
        System.out.println("Копейщик поднимает щит для защиты!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Копейщик активирует режим берсерка!");
    }

    @Override
    public String toString() {
        return "Копейщик";
    }
}

