package characters;

public class Peasant extends Character implements Steppable {
    protected int cropYield;
    protected int toolsDurability;

    public Peasant(String name, Coordinates coordinates) {
        super(coordinates);
        this.cropYield = 10;
        this.toolsDurability = 100;
        this.initiative = 0;
    }

    @Override
    public void attack() {
        System.out.println("Крестьянин атакует косой!");
    }

    @Override
    public void defend() {
        System.out.println("Крестьянин прячется за стогом сена!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Крестьянин улучшает качество посевов!");
        this.cropYield += 5;
    }

    @Override
    public void step() {
        System.out.println("Крестьянин идет на поле для работы.");
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }
}




