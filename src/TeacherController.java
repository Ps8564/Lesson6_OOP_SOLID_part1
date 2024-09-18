/*
 * 1.Принцип единственной ответственности (Single Responsibility Principle, SRP):
 * Класс TeacherController отвечает за взаимодействие с пользовательским интерфейсом и
 * управление бизнес-логикой, что также соответствует принципу SRP.
 *
 * 2.Принцип открытости/закрытости (Open/Closed Principle, OCP):
 * Класс TeacherController реализует интерфейс UserController<Teacher>,
 * что позволяет использовать его для работы с учителями, не нарушая принцип OCP.
 *
 * 5.Принцип инверсии зависимостей (Dependency Inversion Principle, DIP):
 * Класс TeacherController зависит от интерфейса UserController, а не от конкретной реализации.
 * Это соответствует принципу DIP, так как высокоуровневый модуль (TeacherController) не зависит
 * от низкоуровневых модулей (конкретные реализации UserController), а оба зависят от абстракции
 * (интерфейс UserController). Таким образом, TeacherController может работать с любой реализацией
 * UserController. Это повышает гибкость и модульность кода.
 */

import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String surname, String firstname, String patronymic) {
        teacherService.create(surname,firstname,patronymic);
    }

    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        teacherService.editTeacher(teacherId,surname,firstname,patronymic);
    }

    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}