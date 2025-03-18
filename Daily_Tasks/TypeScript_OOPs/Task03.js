//3. Write a TypeScript class called SUV (Sports Utility Vehicle) that extends the Car class. Add a property to represent whether the SUV is suitable for off-road driving. Implement a method that toggles off-road capability and prints a message accordingly.
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Car = /** @class */ (function () {
    function Car(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Car;
}());
var SUV = /** @class */ (function (_super) {
    __extends(SUV, _super);
    function SUV(make, model, year, offRoadCapable) {
        var _this = _super.call(this, make, model, year) || this;
        _this.offRoadCapable = offRoadCapable;
        return _this;
    }
    SUV.prototype.toggleOffRoad = function () {
        this.offRoadCapable = !this.offRoadCapable;
        console.log("The ".concat(this.make, " ").concat(this.model, " is now ").concat(this.offRoadCapable ? "off-road capable" : "not off-road capable", "."));
    };
    return SUV;
}(Car));
var mySUV = new SUV("Jeep", "Wrangler", 2024, true);
mySUV.toggleOffRoad();
