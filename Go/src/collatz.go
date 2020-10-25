package main

import "fmt"

func collatzIteration(number int) int {
	steps := 0
	for number != 1 {
		fmt.Printf("%d ", number)
		if (number % 2) == 0 {
			number = number / 2
		} else {
			number = 3*number + 1
		}
		steps = steps + 1
	}
	fmt.Printf("%d\n", number)
	return steps
}

func collatzRecursive(number int) {
	fmt.Printf("%d ", number)
	if number == 1 {
		return
	}
	if number%2 == 0 {
		collatzRecursive(number / 2)
	} else {
		collatzRecursive(3*number + 1)
	}
}

func main() {
	inputNumber := 27
	fmt.Printf("%d\n", collatzIteration(inputNumber))
	collatzRecursive(inputNumber)
}
