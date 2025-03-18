//5. Write a TypeScript program that creates a class called Student with properties name and class. Implement a constructor that initializes these properties when a Student object is created.

class Student {
  name: string;
  studentClass: string;

  constructor(name: string, studentClass: string) {
    this.name = name;
    this.studentClass = studentClass;
  }
}

const student1 = new Student("Rishitha", "B.Tech");
console.log(`Student Name: ${student1.name}, Class: ${student1.studentClass}`);
