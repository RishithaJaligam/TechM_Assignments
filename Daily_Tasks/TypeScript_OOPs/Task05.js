//5. Write a TypeScript program that creates a class called Student with properties name and class. Implement a constructor that initializes these properties when a Student object is created.
var Student = /** @class */ (function () {
    function Student(name, studentClass) {
        this.name = name;
        this.studentClass = studentClass;
    }
    return Student;
}());
var student1 = new Student("Rishitha", "B.Tech");
console.log("Student Name: ".concat(student1.name, ", Class: ").concat(student1.studentClass));
