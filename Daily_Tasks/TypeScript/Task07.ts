//7. Write a TypeScript program that creates type aliases for complex data types such as objects or custom types. Use them to define variables and explain how they improve code readability.

type Student = {
  id: number;
  studentname: string;
  email: string;
};

const student1: Student = {
  id: 1,
  studentname: "xyz",
  email: "xyz@gmail.com",
};

const student2: Student = {
  id: 2,
  studentname: "abc",
  email: "abc@gmail.com",
};

function printStudentInfo(student: Student) {
  console.log(`Student ID: ${student.id}`);
  console.log(`Studentname: ${student.studentname}`);
  console.log(`Email: ${student.email}`);
}

console.log("Student-1 Details:");
printStudentInfo(student1);

console.log("\nStudent-2 Details:");
printStudentInfo(student2);
