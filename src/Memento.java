import java.util.List;

/**
 * Клас Memento зберігає стан персонажа.
 * Він є реалізацією "Memento" у шаблоні. Зберігає інформацію про позицію,
 * артефакти та рівень здоров’я персонажа.
 */
class Memento {
    private final String position; // Позиція персонажа
    private final List<String> artifacts; // Список артефактів
    private final int health; // Рівень здоров’я

    /**
     * Конструктор для створення об'єкта Memento.
     *
     * @param position позиція персонажа
     * @param artifacts список артефактів
     * @param health рівень здоров’я персонажа
     */
    public Memento(String position, List<String> artifacts, int health) {
        this.position = position;
        this.artifacts = artifacts;
        this.health = health;
    }

    /**
     * Отримує позицію персонажа.
     *
     * @return позиція персонажа
     */
    public String getPosition() {
        return position;
    }

    /**
     * Отримує список артефактів персонажа.
     *
     * @return список артефактів
     */
    public List<String> getArtifacts() {
        return artifacts;
    }

    /**
     * Отримує рівень здоров’я персонажа.
     *
     * @return рівень здоров’я
     */
    public int getHealth() {
        return health;
    }
}

