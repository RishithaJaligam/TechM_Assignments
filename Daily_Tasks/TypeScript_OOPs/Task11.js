//11. Write a TypeScript program that creates a class called Shape with properties color and a method draw(). This program prints a message indicating that the shape is being drawn. Then, create a derived class Circle that extends Shape. Override the draw() method in the Circle class to provide a specific implementation for drawing a circle.
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
var Shape11 = /** @class */ (function () {
    function Shape11(color) {
        this.color = color;
    }
    Shape11.prototype.draw = function () {
        console.log("Drawing a shape of color ".concat(this.color, "."));
    };
    return Shape11;
}());
var Circle12 = /** @class */ (function (_super) {
    __extends(Circle12, _super);
    function Circle12(color) {
        return _super.call(this, color) || this;
    }
    Circle12.prototype.draw = function () {
        console.log("Drawing a circle of color ".concat(this.color, "."));
    };
    return Circle12;
}(Shape11));
var myCircle1 = new Circle12("Blue");
myCircle1.draw();
