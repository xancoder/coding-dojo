<?php

function collatz_iteration($number)
{
    $steps = 0;
    while ($number != 1) {
        echo $number . " ";
        if ($number % 2 == 0) {
            $number = $number / 2;
        } else {
            $number = 3 * $number + 1;
        }
        $steps = $steps + 1;
    }
    echo $number . "\n";
    return $steps;
}

function collatz_recursive($number)
{
    echo $number . " ";
    if ($number == 1) {
        return;
    }
    if ($number % 2 == 0) {
        collatz_recursive($number / 2);
    } else {
        collatz_recursive(3 * $number + 1);
    }
}

$inputNumber = 27;
echo collatz_iteration($inputNumber) . "\n";
collatz_recursive($inputNumber);
