//6. Write a TypeScript program that converts a variable of one type to another using type assertions and type conversion functions like parseInt().

let str_num: string = "100";
let num: number = parseInt(str_num);

console.log("Type of the variable before type assertion:", typeof str_num);
console.log("Type of the variable after type assertion:", typeof num);
console.log("Number from assertion:", num);
