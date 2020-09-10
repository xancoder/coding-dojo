function countChar(tmpString) {
    let counts = new Map();
    for (let letter of tmpString) {
        if (counts.has(letter)) {
            counts.set(letter, counts.get(letter) + 1)
        } else {
            counts.set(letter, 1)
        }
    }

    const countsSorted = new Map([...counts.entries()].sort());
    countsSorted.forEach((value: number, key: string) => {
        let percent = value / tmpString.length;
        console.log(`'${key}' ${value} ${percent.toFixed(2)}`);
    });
}

let inputString = "12345678900000000000-Hello-World";
countChar(inputString);
