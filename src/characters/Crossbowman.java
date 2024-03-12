package characters;

public class Crossbowman extends Character {
    protected int accuracy;
    protected int range;

    public Crossbowman(String name, Coordinates coordinates) {
        super(coordinates);
        this.accuracy = 80;
        this.range = 10;
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

    public Character findNearestEnemy(Character[] enemies) {
        Character nearestEnemy = null;
        double shortestDistance = Double.MAX_VALUE;

        for (Character enemy : enemies) {
            double distance = calculateDistance(enemy.getCoordinates());
            if (distance < shortestDistance) {
                shortestDistance = distance;
                nearestEnemy = enemy;
            }
        }

        return nearestEnemy;
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



