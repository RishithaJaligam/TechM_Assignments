//3. Write a TypeScript program that declares variables of the following data types: number, string, boolean, and undefined. Assign values to them and perform basic operations.

let n1: number = 30;
let str: string = "Hello";
let boolVariable: boolean = true;
let undefinedVariable: undefined = undefined;

console.log("Sum:", n1 + 10);
console.log("Concatenated String:", str + " world!");
console.log("Logical AND:", boolVariable && true);

if (undefinedVariable === undefined) {
  console.log("undefinedVariable is undefined.");
} else {
  console.log("undefinedVariable is defined.");
}
