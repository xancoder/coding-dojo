#!/usr/bin/perl

use strict;
use warnings FATAL => 'all';

sub collatz_iteration {
    my ($number) = @_;
    my $steps = 0;

    while ($number != 1) {
        print($number . " ");
        if ($number % 2 == 0) {
            $number = $number / 2;
        }
        else {
            $number = 3 * $number + 1;
        }
        $steps++;
    }
    print($number . "\n");
    return ($steps);
}

sub collatz_recursive {
    no warnings 'recursion';
    my ($number) = @_;

    print($number . " ");
    if ($number == 1) {
        return ();
    }
    if ($number % 2 == 0) {
        collatz_recursive($number / 2);
    }
    else {
        collatz_recursive(3 * $number + 1);
    }
}

my $input_number = 27;
print(collatz_iteration($input_number) . "\n");
collatz_recursive($input_number);
