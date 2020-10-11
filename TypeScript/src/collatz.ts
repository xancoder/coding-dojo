function collatz_iteration(number) {
    let steps:number = 0;

    while (number !== 1) {
        process.stdout.write(number + " ")
        if (number % 2 === 0) {
            number = number / 2;
        } else {
            number = 3 * number + 1;
        }
        steps++;
    }
    console.log(number);
    return steps;
}

function collatz_recursive(number) {
    process.stdout.write(number + " ");
    if (number === 1) {
        return;
    }
    if (number % 2 === 0) {
        collatz_recursive(number / 2);
    } else {
        collatz_recursive(3 * number + 1);
    }
}

const inputNumber:number = 27;
console.log(collatz_iteration(inputNumber));
collatz_recursive(inputNumber);
