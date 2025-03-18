//8. Write a TypeScript program that declares an array of a specific data type. It will demonstrates common array operations like adding elements, removing elements, and iterating through the array.
var colors = ["Red", "Green", "Blue", "Orange"];
colors.push("White");
console.log("After push:", colors);
colors.splice(2, 0, "Yellow");
console.log("After inserting at index 2:", colors);
colors.pop();
console.log("\nAfter pop:", colors);
colors.splice(3, 1);
console.log("After deleting element at index 3:", colors);
console.log("\nIterating through the Array:");
for (var _i = 0, colors_1 = colors; _i < colors_1.length; _i++) {
    var c = colors_1[_i];
    console.log(c);
}
