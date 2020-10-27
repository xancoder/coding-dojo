#include <iostream>
#include <cmath>
#include <map>

unsigned int collatz_iteration(uint32_t number);

void collatz_recursive(uint32_t input);

int main() {
    std::uint32_t input = 27;
    std::cout << collatz_iteration(input) << std::endl;
    collatz_recursive(input);
    return EXIT_SUCCESS;
}

unsigned int collatz_iteration(uint32_t number) {
    std::uint32_t steps = 0;

    while (number != 1) {
        std::cout << number << " ";
        if (number % 2 == 0) {
            number = number / 2;
        } else {
            number = 3 * number + 1;
        }
        steps++;
    }
    std::cout << number << std::endl;

    return steps;
}

void collatz_recursive(uint32_t number) {
    std::cout << number << " ";
    if (number == 1) {
        return;
    }
    if (number % 2 == 0) {
        collatz_recursive(number / 2);
    } else {
        collatz_recursive(3 * number + 1);
    }
}
