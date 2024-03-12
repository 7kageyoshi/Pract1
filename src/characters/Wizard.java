package characters;

public class Wizard extends Character {
    protected int mana;
    protected int spellPower;

    public Wizard(String name, Coordinates coordinates) {
        super(coordinates);
        this.mana = 100;
        this.spellPower = 50;
    }

    @Override
    public void attack() {
        System.out.println("Колдун бросает заклинание!");
    }

    @Override
    public void defend() {
        System.out.println("Колдун создает магический щит!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Колдун восстанавливает ману!");
        this.mana += 20;
    }

    @Override
    public String toString() {
        return "Колдун";
    }
}


