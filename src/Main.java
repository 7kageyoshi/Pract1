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
import java.util.Arrays;
import java.util.Comparator;

public class Main {
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

        Arrays.sort(teamLeft, Comparator.comparingInt(Character::getInitiative).reversed());
        Arrays.sort(teamRight, Comparator.comparingInt(Character::getInitiative).reversed());

        System.out.println("Первая команда:");
        for (Character character : teamLeft) {
            System.out.println(character);
        }

        System.out.println("\nВторая команда:");
        for (Character character : teamRight) {
            System.out.println(character);
        }

        for (Character character : teamLeft) {
            character.step();
        }

        for (Character character : teamRight) {
            character.step();
        }
    }

    private static String generateRandomName() {
        String[] names = {"Иван", "Петр", "Александр", "Михаил", "Сергей", "Андрей", "Алексей"};
        return names[(int) (Math.random() * names.length)];
    }
}
