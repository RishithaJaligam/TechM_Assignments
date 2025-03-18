//2. Write a TypeScript class called Bus with the properties make, model, and year. Add a method start() that prints a message indicating that the Bus is starting.

class Bus1 {
  make: string;
  model: string;
  year: number;

  constructor(make: string, model: string, year: number) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  start() {
    console.log(`The ${this.make} ${this.model} is starting.`);
  }
}

const schoolBus = new Bus1("Volvo", "B7R", 2023);
schoolBus.start();
