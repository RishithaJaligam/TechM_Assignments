//6. Write a TypeScript program that creates a class called Student with properties name and roll number. Add constructor overloading to support multiple ways of initializing a Student object. Implement one constructor that takes both name and roll number as parameters and another constructor that takes only name, assuming the roll number is unknown.

class Student2 {
  name: string;
  rollNumber?: number;

  constructor(name: string);
  constructor(name: string, rollNumber: number);
  constructor(name: string, rollNumber?: number) {
    this.name = name;
    if (rollNumber !== undefined) {
      this.rollNumber = rollNumber;
    }
  }
}

const student11 = new Student2("Rishitha", 101);
const student2 = new Student2("Anu");
console.log(student11);
console.log(student2);
