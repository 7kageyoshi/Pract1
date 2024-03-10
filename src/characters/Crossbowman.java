package characters;

public class Crossbowman extends Character {

    protected int crossbowDamage;
    protected int reloadTime;
    protected boolean isReloading;

    public Crossbowman() {
        super();
        this.crossbowDamage = 70;
        this.reloadTime = 5;
        this.isReloading = false;
    }

    @Override
    public void attack() {
        if (!isReloading) {
            System.out.println("Арбалетчик выстреливает из арбалета!");

            isReloading = true;
            reloadCrossbow();
        } else {
            System.out.println("Арбалетчик перезаряжает арбалет...");
        }
    }

    private void reloadCrossbow() {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        isReloading = false;
                    }
                },
                reloadTime * 1000
        );
    }

    @Override
    public void defend() {
        System.out.println("Арбалетчик уклоняется от атаки!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Арбалетчик переключается на более мощные болты!");
        this.crossbowDamage += 20;
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }
}

