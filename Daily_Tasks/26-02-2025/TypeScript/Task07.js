//7. Write a TypeScript program that creates type aliases for complex data types such as objects or custom types. Use them to define variables and explain how they improve code readability.
var student1 = {
    id: 1,
    studentname: "xyz",
    email: "xyz@gmail.com",
};
var student2 = {
    id: 2,
    studentname: "abc",
    email: "abc@gmail.com",
};
function printStudentInfo(student) {
    console.log("Student ID: ".concat(student.id));
    console.log("Studentname: ".concat(student.studentname));
    console.log("Email: ".concat(student.email));
}
console.log("Student-1 Details:");
printStudentInfo(student1);
console.log("\nStudent-2 Details:");
printStudentInfo(student2);
