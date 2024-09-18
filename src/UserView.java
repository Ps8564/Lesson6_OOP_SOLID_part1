/*
 * 2.Принцип открытости/закрытости (Open/Closed Principle, OCP):
 * Интерфейс UserController соответствует этому принципу.
 * Интерфейс UserController использует обобщенный тип T extends User, что позволяет расширять
 * его функциональность без необходимости изменения самого интерфейса.
 * Это делает интерфейс открытым для расширения, но закрытым для модификации.
 *
 * 4.Принцип разделения интерфейсов (Interface Segregation Principle, ISP):
 * Интерфейс UserView содержит только необходимые методы для работы с пользователями, такие как отображение
 * информации о пользователе и обновление его данных. Такой подход позволяет избежать излишних
 * зависимостей и уменьшает вероятность изменений в интерфейсе при добавлении нового функционала.
 * Таким образом, принцип разделения интерфейсов (ISP) соответствует в данном случае.
 */

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}