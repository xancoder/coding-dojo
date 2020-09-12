#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
calculate the Collatz function,
function g: N -> N until input is 1
with g(x) = x/2 if x even and 3*x+1 odd
"""


def collatz_iteration(number):
    steps = 0
    while number != 1:
        print(number, end=' ')
        if number % 2 == 0:
            number = number / 2
        else:
            number = 3 * number + 1
        steps = steps + 1
    print(number)
    return steps


def collatz_recursive(number):
    print(number, end=' ')
    if number == 1:
        return
    if number % 2 == 0:
        collatz_recursive(number / 2)
    else:
        collatz_recursive(3 * number + 1)


if __name__ == '__main__':
    input_number = 27
    print(collatz_iteration(input_number))
    collatz_recursive(input_number)
