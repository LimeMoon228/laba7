/**
 * Головний клас для демонстрації роботи шаблону Memento.
 */
public class Main {
    public static void main(String[] args) {
        Character character = new Character("Start", 100);
        Caretaker caretaker = new Caretaker();

        System.out.println("Початковий стан персонажа: " + character);

        character.setPosition("Forest");
        character.addArtifact("Sword");
        character.setHealth(80);
        System.out.println("Стан персонажа після змін: " + character);

        caretaker.addMemento(character.createMemento());
        System.out.println("Стан збережено.");

        character.setPosition("Castle");
        character.addArtifact("Shield");
        character.setHealth(50);
        System.out.println("Стан персонажа після додаткових змін: " + character);

        caretaker.addMemento(character.createMemento());
        System.out.println("Другий стан збережено.");

        character.restoreMemento(caretaker.getMemento(0));
        System.out.println("Стан персонажа після відновлення до першого стану: " + character);

        character.restoreMemento(caretaker.getMemento(1));
        System.out.println("Стан персонажа після відновлення до другого стану: " + character);
    }
}
