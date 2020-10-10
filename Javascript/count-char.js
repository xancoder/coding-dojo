function sortObj(obj) {
    return Object.keys(obj).sort().reduce(function (result, key) {
        result[key] = obj[key];
        return result;
    }, {});
}

function countChar(tmpString) {
    let counts = {};

    for (let i = 0; i < tmpString.length; i++) {
        let letter = tmpString.charAt(i);

        if (counts.hasOwnProperty(letter)) {
            counts[letter] += 1;
        } else {
            counts[letter] = 1;
        }
    }

    for (let letter in sortObj(counts)) {
        if (!counts.hasOwnProperty(letter)) continue;
        let percent = counts[letter] / tmpString.length;
        console.log(`'${letter}' ${counts[letter]} ${percent.toFixed(2)}`);
    }
}

const stringAsACharSequence = "12345678900000000000-Hello-World";
countChar(stringAsACharSequence);
