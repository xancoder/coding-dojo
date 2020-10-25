package main

import (
	"fmt"
	"sort"
	"strings"
)

func countChar(inputString string) {
	wordList := strings.Split(inputString, "")
	counts := make(map[string]int)
	for _, word := range wordList {
		_, ok := counts[word]
		if ok {
			counts[word] += 1
		} else {
			counts[word] = 1
		}
	}

	keys := make([]string, 0, len(inputString))
	for k := range counts {
		keys = append(keys, k)
	}
	sort.Strings(keys)
	for _, k := range keys {
		percent := float64(counts[k]) / float64(len(inputString))
		fmt.Printf("'%s' %d %.2f\n", k, counts[k], percent)
	}
}

func main() {
	inputString := "12345678900000000000-Hello-World"
	countChar(inputString)
}
