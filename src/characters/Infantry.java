package characters;

import java.util.ArrayList;

/**
 * Абстрактный класс Пехота, в данном случае база для Разбойников и Копейщиков,
 * но можно добавить Мечников, Варваров и тд.
 */

public abstract class Infantry extends Character {

    protected int level;

    public Infantry(String name, Coordinates coordinates) {
        super(coordinates);
        this.level = 1;
    }

    public void attack(Character target) {
        int damage = calculateDamage();
        boolean critical = calculateCritical();
        if (critical) {
            damage *= 2;
        }
        target.takeDamage(damage);
        if (target.health > 0) {
            if (critical) {
                System.out.println(name + " проводит критическую атаку против " + target.getName() + " и наносит " + damage + " урона!");
            } else {
                System.out.println(name + " атакует " + target.getName() + " и наносит " + damage + " урона.");
            }
        } else {
            System.out.println(name + " атакует " + target.getName() + ", но " + target.getName() + " уже мертв.");
        }
    }

    public void moveTowards(Character target) {
        int dx = target.getCoordinates().getX() - coordinates.getX();
        int dy = target.getCoordinates().getY() - coordinates.getY();

        if (Math.abs(dx) > Math.abs(dy)) {
            coordinates.setX(coordinates.getX() + Integer.signum(dx));
        } else {
            coordinates.setY(coordinates.getY() + Integer.signum(dy));
        }
    }

    @Override
    public void step() {
        if (health <= 0) {
            return;
        }

        Character nearestEnemy = findNearestEnemy();
        if (nearestEnemy != null) {
            if (isAdjacent(nearestEnemy.getCoordinates())) {
                attack(nearestEnemy);
            } else {
                moveTowards(nearestEnemy);
            }
        }
    }

    protected abstract int calculateDamage();
    protected abstract boolean calculateCritical();

    protected abstract Character findNearestEnemy();

    protected abstract boolean isAdjacent(Coordinates enemyCoordinates);
}

