//9. Write a TypeScript program that defines an enumeration 'Color' with values 'Red', 'Green', 'White' and Blue. Create a variable 'selectedColor' of type 'Color' and assign it one of the enumeration values.
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["White"] = 2] = "White";
    Color[Color["Blue"] = 3] = "Blue";
})(Color || (Color = {}));
console.log("List of colors:", Color);
var selectedColor = Color.Green;
console.log("\nSelected Color:", selectedColor);
