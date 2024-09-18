/*
 * 1.Принцип единственной ответственности (Single Responsibility Principle, SRP):
 * Класс Teacher отвечает только за хранение и управление данными учителя, что соответствует принципу SRP.
 *
 * 3.Принцип подстановки Барбары Лисков (Liskov Substitution Principle, LSP):
 * Класс Teacher наследуется от класса User, что соответствует принципу LSP, так как
 * объект типа Teacher может быть использован везде, где ожидается объект типа User.
 */

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(Integer teacherId, String surname, String firstname, String patronymic) {
        super(surname, firstname, patronymic);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + teacherId + ", " + super.toString().substring(5);
    }
}
