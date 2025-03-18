//5. Write a TypeScript program that declares a variable without specifying its type and shows how TypeScript infers the type based on the assigned value.
var temp = 100;
//temp = "Hello, TypeScript!"; // This line will result in a type error
console.log("Type of temp:", typeof temp);
console.log("temp:", temp);
