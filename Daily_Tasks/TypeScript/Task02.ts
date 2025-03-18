//2. Write a TypeScript program that declares variables using let, const, and var. Then, describe how each declaration type behaves with respect to scoping and mutability.

// Using let (Block-scoped, mutable)
let myVariable1: number = 5;
if (true) {
  let myVariable1: number = 10; // This is a different variable within the block scope.
}
console.log(myVariable1); // Output: 5 (the outer variable)

// Using const (Block-scoped, immutable)
const myVariable2: string = "Hello"; //myVariable2 = "World"; // Error: Cannot reassign a const variable
console.log(myVariable2);

// Using var (Function-scoped, mutable)
function exampleFunction() {
  var myVariable3: boolean = true;
  if (myVariable3) {
    var myVariable3: boolean = false; // This redeclares the same variable within the function scope.
  }
  console.log(myVariable3); // Output: false (the inner variable)
}
exampleFunction();
