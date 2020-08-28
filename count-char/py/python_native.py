#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def count_char(tmp_string):
    counts = {}

    for letter in tmp_string:
        counts[letter] = counts.get(letter, 0) + 1

    for letter in sorted(counts):
        print(f"'{letter}' {counts[letter]}")


if __name__ == '__main__':
    string_as_a_char_sequence = '1234567890000000abcd-ATCG'
    count_char(string_as_a_char_sequence)
