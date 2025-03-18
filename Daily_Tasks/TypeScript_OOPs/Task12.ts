//12. Write a TypeScript program that defines a class called Vehicle with properties make and model. Implement a constructor that initializes these properties when a Vehicle object is created. Then, create a derived class Car that extends Vehicle. Finally, create a derived class SportsCar that extends Car. Ensure that properties are inherited correctly and each class has its own constructor.

class Vehicle {
  make: string;
  model: string;

  constructor(make: string, model: string) {
    this.make = make;
    this.model = model;
  }
}

class Car45 extends Vehicle {
  constructor(make: string, model: string) {
    super(make, model);
  }
}

class SportsCar extends Car45 {
  constructor(make: string, model: string) {
    super(make, model);
  }
}

const mySportsCar = new SportsCar("Ferrari", "488 Spider");
console.log(mySportsCar);
