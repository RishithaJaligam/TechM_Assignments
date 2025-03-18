//2. Write a TypeScript program that declares variables using let, const, and var. Then, describe how each declaration type behaves with respect to scoping and mutability.
// Using let (Block-scoped, mutable)
var myVariable1 = 5;
if (true) {
    var myVariable1_1 = 10; // This is a different variable within the block scope.
}
console.log(myVariable1); // Output: 5 (the outer variable)
// Using const (Block-scoped, immutable)
var myVariable2 = "Hello"; //myVariable2 = "World"; // Error: Cannot reassign a const variable
console.log(myVariable2);
// Using var (Function-scoped, mutable)
function exampleFunction() {
    var myVariable3 = true;
    if (myVariable3) {
        var myVariable3 = false; // This redeclares the same variable within the function scope.
    }
    console.log(myVariable3); // Output: false (the inner variable)
}
exampleFunction();
