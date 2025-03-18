//6. Write a TypeScript program that creates a class called Student with properties name and roll number. Add constructor overloading to support multiple ways of initializing a Student object. Implement one constructor that takes both name and roll number as parameters and another constructor that takes only name, assuming the roll number is unknown.
var Student2 = /** @class */ (function () {
    function Student2(name, rollNumber) {
        this.name = name;
        if (rollNumber !== undefined) {
            this.rollNumber = rollNumber;
        }
    }
    return Student2;
}());
var student11 = new Student2("Rishitha", 54);
var student2 = new Student2("Anu");
console.log(student11);
console.log(student2);
