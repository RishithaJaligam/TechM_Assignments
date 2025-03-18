//8. Write a TypeScript class called Student with properties name and age. Implement a constructor that initializes these properties when a Student object is created. Additionally, add validation to ensure that the age provided is a positive number. If the age is not positive, set it to a default value of 0.
var Student4 = /** @class */ (function () {
    function Student4(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    return Student4;
}());
var student18 = new Student4("Rishitha", 20);
var student25 = new Student4("Anu", -5);
console.log(student18);
console.log(student25);
