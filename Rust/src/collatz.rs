fn main() {
    let input_number: i32 = 27;
    println!("{}", collatz_iteration(input_number));
    collatz_recursive(input_number);
}

fn collatz_iteration(number: i32) -> i32 {
    let mut steps: i32 = 0;
    let mut tmp: i32 = number;
    while tmp != 1 {
        print!("{} ", tmp);
        if tmp % 2 == 0 {
            tmp = tmp / 2;
        } else {
            tmp = 3 * tmp + 1;
        }
        steps = steps + 1;
    }
    println!("{}", tmp);
    return steps;
}

fn collatz_recursive(number: i32) {
    print!("{} ", number);
    if number == 1 {
        return;
    }
    if number % 2 == 0 {
        collatz_recursive(number / 2);
    } else {
        collatz_recursive(3 * number + 1);
    }
}
