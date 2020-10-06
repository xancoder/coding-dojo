#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def count_char(tmp_string):
    counts = {}

    for letter in tmp_string:
        counts[letter] = counts.get(letter, 0) + 1

    for letter in sorted(counts):
        percent = counts[letter] / len(tmp_string)
        print(f"'{letter}' {counts[letter]} {percent:.2f}")


if __name__ == '__main__':
    input_string = '12345678900000000000-Hello-World'
    count_char(input_string)
