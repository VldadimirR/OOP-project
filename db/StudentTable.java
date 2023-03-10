package db;

import java.util.Iterator;
import dto.Student;

public class StudentTable extends Table<Student> {

    public boolean deleteByFio(String fio) {
        Iterator<Student> iterator = elements.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFio().equals(fio)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public boolean deleteByFio(int age, int groupNumber) {
        Iterator<Student> iterator = elements.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getYearOfBirth() == age &&
                    student.getGroupNumber() == groupNumber) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
