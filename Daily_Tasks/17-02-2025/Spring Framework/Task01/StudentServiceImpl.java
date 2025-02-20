package task01;

public class StudentServiceImpl implements StudentService {
    private Student student;

    // Interface injection method
    @Override
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void displayStudentInfo() {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student belongs to the " + student.getDepartment() + " department.");
    }
}

