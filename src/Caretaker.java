import java.util.ArrayList;
import java.util.List;

/**
 * Клас Caretaker зберігає об'єкти Memento.
 * Він є реалізацією "Caretaker" у шаблоні. Відповідає за збереження історії станів персонажа
 * і дозволяє отримувати попередні стани.
 */
class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>(); // Список збережених станів

    /**
     * Додає новий стан до списку.
     *
     * @param memento об'єкт Memento, що зберігається
     */
    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * Отримує стан зі списку за індексом.
     *
     * @param index індекс потрібного стану
     * @return об'єкт Memento
     */
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}