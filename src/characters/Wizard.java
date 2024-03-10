package characters;

public class Wizard extends Character {
    protected int mana;
    protected int spellPower;
    protected boolean isCasting;

    public Wizard() {
        super();
        this.mana = 100;
        this.spellPower = 50;
        this.isCasting = false;
    }

    @Override
    public void attack() {
        System.out.println("Колдун использует магический заклинание!");
    }

    @Override
    public void defend() {
        System.out.println("Колдун создает щит магии!");

    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Колдун начинает кастовать мощное заклинание!");
        this.isCasting = true;
    }

    @Override
    public String toString() {
        return "Колдун";
    }
}

