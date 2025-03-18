//11. Write a TypeScript program that creates a class called Shape with properties color and a method draw(). This program prints a message indicating that the shape is being drawn. Then, create a derived class Circle that extends Shape. Override the draw() method in the Circle class to provide a specific implementation for drawing a circle.

class Shape11 {
  color: string;

  constructor(color: string) {
    this.color = color;
  }

  draw() {
    console.log(`Drawing a shape of color ${this.color}.`);
  }
}

class Circle12 extends Shape11 {
  constructor(color: string) {
    super(color);
  }

  draw() {
    console.log(`Drawing a circle of color ${this.color}.`);
  }
}

const myCircle1 = new Circle12("Blue");
myCircle1.draw();
