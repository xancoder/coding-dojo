#!/usr/bin/perl

use strict;
use warnings FATAL => 'all';

sub countChar {
    my ($tmpString) = @_;
    my %counts;

    my @chars = split //, $tmpString;
    foreach my $letter (@chars) {
        if (exists $counts{$letter}) {
            $counts{$letter} += 1;
        }
        else {
            $counts{$letter} = 1;
        }
    }

    foreach my $letter (sort keys %counts) {
        my $percent = $counts{$letter} / length($tmpString);
        printf("'%s' %d %.2f\n", $letter, $counts{$letter}, $percent);
    }
}

my $inputString = "12345678900000000000-Hello-World";
countChar($inputString);
