<?php

function countChar($tmpString)
{
    $counts = array();

    $chars = str_split($tmpString);
    foreach ($chars as $letter) {
        if (array_key_exists($letter, $counts)) {
            $counts[$letter] += 1;
        } else {
            $counts[$letter] = 1;
        }
    }

    ksort($counts);
    foreach ($counts as $letter => $value) {
        $tmp = $value / strlen($tmpString);
        echo sprintf("'%s' %d %.2f\n", $letter, $value, $tmp);
    }
}

$stringAsACharSequence = "12345678900000000000-Hello-World";
countChar($stringAsACharSequence);
