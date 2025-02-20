package task01;

public class Student {
    private int studentId;
    private String studentName;
    private String department;

    // Constructor Injection
    public Student(int studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }
    
    // Setter Injection
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }
}
