package characters;

import java.util.Random;

public abstract class Character implements Steppable {
    protected String name;
    protected int health;
    protected int strength;
    protected Coordinates coordinates;
    protected int initiative;

    public Character(Coordinates coordinates) {
        this.name = generateRandomName();
        this.health = 100;
        this.strength = 10;
        this.coordinates = coordinates;
    }

    private static String generateRandomName() {
        String[] names = {"Иван", "Петр", "Александр", "Михаил", "Сергей", "Андрей", "Алексей"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void useSpecialAbility();

    @Override
    public void step() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}







