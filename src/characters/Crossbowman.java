package characters;

public class Crossbowman extends Character {
    protected int accuracy;
    protected int range;
    protected int arrows;

    public Crossbowman(String name, Coordinates coordinates) {
        super(coordinates);
        this.accuracy = 80;
        this.range = 10;
        this.arrows = 20;
        this.initiative = 3;
    }

    @Override
    public void attack() {
        System.out.println("Арбалетчик выстреливает из арбалета!");
    }

    @Override
    public void defend() {
        System.out.println("Арбалетчик отступает под прикрытием!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Арбалетчик прицельно стреляет во врага!");
    }

    @Override
    public void step() {
        if (health <= 0 || arrows <= 0) {
            return;
        }

        Character nearestEnemy = findNearestEnemy();
        if (nearestEnemy != null) {
            shoot(nearestEnemy);
        }
    }

    private Character findNearestEnemy() {
        return null;
    }

    private void shoot(Character enemy) {
        arrows--;
    }

    private double calculateDistance(Coordinates enemyCoordinates) {
        int xDistance = Math.abs(this.coordinates.getX() - enemyCoordinates.getX());
        int yDistance = Math.abs(this.coordinates.getY() - enemyCoordinates.getY());
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }
}




