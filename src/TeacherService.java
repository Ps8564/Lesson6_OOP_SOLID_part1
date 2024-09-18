/*
 * 1.Принцип единственной ответственности (Single Responsibility Principle, SRP):
 * Класс TeacherService отвечает за бизнес-логику, связанную с учителями,
 * что соответствует принципу SRP.
 *
 * 5.Принцип инверсии зависимостей (Dependency Inversion Principle, DIP):
 * Класс TeacherService зависит от интерфейса UserService, а не от конкретной реализации.
 * Это позволяет TeacherService использовать любую реализацию UserService, не завися от ее деталей.
 * Таким образом, высокоуровневый класс TeacherService не зависит от низкоуровневых модулей,
 * а оба зависят от абстракции, что и является сутью принципа DIP.
 */

import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String surname, String firstname, String patronymic) {
        Teacher teacher = new Teacher(++maxTeacherId,surname,firstname,patronymic);
        teacherList.add(teacher);
    }

    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic) {
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSurname(surname);
                teacher.setFirstname(firstname);
                teacher.setPatronymic(patronymic);
            }
        }
    }

    private Integer getNewMaxTeacherId() {
        if (teacherList.isEmpty()) return 0;
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}