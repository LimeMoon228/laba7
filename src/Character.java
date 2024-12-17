import java.util.ArrayList;
import java.util.List;

/**
 * Клас Character представляє персонажа в ігровому просторі.
 * Цей клас є "Originator" у шаблоні Memento. Він зберігає стан персонажа
 * (позиція, артефакти, рівень здоров’я) і дозволяє створювати та відновлювати об'єкти Memento.
 */
class Character {
    private String position; // Позиція персонажа
    private List<String> artifacts; // Список артефактів персонажа
    private int health; // Рівень здоров’я персонажа

    /**
     * Конструктор для створення нового персонажа.
     *
     * @param position початкова позиція персонажа
     * @param health   початковий рівень здоров’я персонажа
     */
    public Character(String position, int health) {
        this.position = position;
        this.health = health;
        this.artifacts = new ArrayList<>();
    }

    /**
     * Створює об'єкт Memento для збереження поточного стану персонажа.
     *
     * @return об'єкт Memento із збереженим станом
     */
    public Memento createMemento() {
        return new Memento(position, new ArrayList<>(artifacts), health);
    }

    /**
     * Відновлює стан персонажа з об'єкта Memento.
     *
     * @param memento об'єкт Memento для відновлення стану
     */
    public void restoreMemento(Memento memento) {
        this.position = memento.getPosition();
        this.artifacts = memento.getArtifacts();
        this.health = memento.getHealth();
    }

    /**
     * Додає новий артефакт до списку персонажа.
     *
     * @param artifact назва артефакту
     */
    public void addArtifact(String artifact) {
        artifacts.add(artifact);
    }

    /**
     * Встановлює нову позицію персонажа.
     *
     * @param position нова позиція
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Встановлює новий рівень здоров’я персонажа.
     *
     * @param health новий рівень здоров’я
     */
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Position: " + position + ", Health: " + health + ", Artifacts: " + artifacts;
    }
}
