import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

        // Инициализация списка учителей
        List<Teacher> teachers = new ArrayList<>();
        controller.initTeacherList(teachers);

        // Создание учителей
        controller.create("Иванов", "Иван", "Иванович");
        controller.create("Петров", "Петр", "Петрович");

        // Вывод списка учителей
        controller.printTeachers();

        // Редактирование учителя
        controller.editTeacher(1, "Сидоров", "Сидор", "Сидорович");

        // Вывод обновлённого списка учителей
        controller.printTeachers();
    }
}