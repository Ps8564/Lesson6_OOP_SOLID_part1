/*
 * 1.Принцип единственной ответственности (Single Responsibility Principle, SRP):
 * Класс TeacherView отвечает только за вывод данных на консоль, что соответствует принципу SRP.
 *
 * 5.Принцип инверсии зависимостей (Dependency Inversion Principle, DIP):
 * Класс TeacherView зависит от интерфейса UserView, а не от конкретной реализации.
 * Это позволяет достичь гибкости и легкой заменяемости реализации, так как TeacherView
 * не зависит от деталей реализации UserView. Таким образом, высокоуровневый модуль (TeacherView)
 * не зависит от низкоуровневых деталей, а оба зависят от абстракции (интерфейса UserView),
 * что и является сутью принципа DIP.
 */

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}