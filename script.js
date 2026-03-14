// JavaScript functionality for a basic calculator.

class Calculator {
    constructor() {
        this.currentResult = 0;
    }

    add(value) {
        this.currentResult += value;
        return this.currentResult;
    }

    subtract(value) {
        this.currentResult -= value;
        return this.currentResult;
    }

    multiply(value) {
        this.currentResult *= value;
        return this.currentResult;
    }

    divide(value) {
        if (value !== 0) {
            this.currentResult /= value;
        } else {
            throw new Error('Cannot divide by zero');
        }
        return this.currentResult;
    }

    clear() {
        this.currentResult = 0;
        return this.currentResult;
    }
}

// Example usage:
const calc = new Calculator();
console.log(calc.add(10)); // 10
console.log(calc.subtract(5)); // 5
console.log(calc.multiply(2)); // 10
console.log(calc.divide(2)); // 5
console.log(calc.clear()); // 0
