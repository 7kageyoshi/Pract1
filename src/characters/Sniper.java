package characters;

public class Sniper extends Character implements Steppable {
    protected int precision;
    protected int camouflage;

    public Sniper(String name, Coordinates coordinates) {
        super(coordinates);
        this.precision = 90;
        this.camouflage = 60;
        this.initiative = 2;
    }

    @Override
    public void attack() {
        System.out.println("Снайпер стреляет точно!");
    }

    @Override
    public void defend() {
        System.out.println("Снайпер использует маскировку для защиты!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Снайпер неразличим в окружающей среде!");
        this.camouflage += 10;
    }

    @Override
    public void step() {
        System.out.println("Снайпер двигается к лучшей позиции.");
    }

    @Override
    public String toString() {
        return "Снайпер";
    }
}



