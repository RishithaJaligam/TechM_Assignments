//9. Write a TypeScript program that defines an enumeration 'Color' with values 'Red', 'Green', 'White' and Blue. Create a variable 'selectedColor' of type 'Color' and assign it one of the enumeration values.

enum Color {
  Red,
  Green,
  White,
  Blue,
}
console.log("List of colors:", Color);

let selectedColor: Color = Color.Green;

console.log("\nSelected Color:", selectedColor);
