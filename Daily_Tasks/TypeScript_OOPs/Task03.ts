//3. Write a TypeScript class called SUV (Sports Utility Vehicle) that extends the Car class. Add a property to represent whether the SUV is suitable for off-road driving. Implement a method that toggles off-road capability and prints a message accordingly.

class Car {
  make: string;
  model: string;
  year: number;

  constructor(make: string, model: string, year: number) {
    this.make = make;
    this.model = model;
    this.year = year;
  }
}

class SUV extends Car {
  offRoadCapable: boolean;

  constructor(
    make: string,
    model: string,
    year: number,
    offRoadCapable: boolean
  ) {
    super(make, model, year);
    this.offRoadCapable = offRoadCapable;
  }

  toggleOffRoad() {
    this.offRoadCapable = !this.offRoadCapable;
    console.log(
      `The ${this.make} ${this.model} is now ${
        this.offRoadCapable ? "off-road capable" : "not off-road capable"
      }.`
    );
  }
}

const mySUV = new SUV("Jeep", "Wrangler", 2024, true);
mySUV.toggleOffRoad();
