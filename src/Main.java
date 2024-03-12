import characters.Character;
import characters.Peasant;
import characters.Robber;
import characters.Sniper;
import characters.Wizard;
import characters.Warrior;
import characters.Crossbowman;
import characters.Monk;
import characters.Coordinates;
import java.util.Random;

public class    Main {
    public static void main(String[] args) {
        Coordinates coordinatesLeft = new Coordinates(0, 0);
        Coordinates coordinatesRight = new Coordinates(9, 9);

        Character[] teamLeft = {
                new Peasant(generateRandomName(), coordinatesLeft),
                new Wizard(generateRandomName(), coordinatesLeft),
                new Crossbowman(generateRandomName(), coordinatesLeft),
                new Warrior(generateRandomName(), coordinatesLeft)
        };

        Character[] teamRight = {
                new Peasant(generateRandomName(), coordinatesRight),
                new Sniper(generateRandomName(), coordinatesRight),
                new Monk(generateRandomName(), coordinatesRight),
                new Robber(generateRandomName(), coordinatesRight)
        };

        System.out.println("Первая команда:");
        for (Character character : teamLeft) {
            System.out.println(character.getName() + " " + character.getCoordinates());
        }

        System.out.println("\nВторая команда:");
        for (Character character : teamRight) {
            System.out.println(character.getName() + " " + character.getCoordinates());
        }
    }

    private static String generateRandomName() {
        String[] names = {"Иван", "Петр", "Александр", "Михаил", "Сергей", "Андрей", "Алексей"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
}




