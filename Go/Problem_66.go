package main

import (
	"fmt"
)

func plusOne(digits []int) []int {
	var size int = len(digits)
	var i int

	for i = size - 1; i >= 0; i-- {
		if digits[i] < 9 {
			digits[i]++
			return digits
		}
		digits[i] = 0
	}
	var anotherCase []int = make([]int, size+1)
	anotherCase[0] = 1

	for i = 1; i < len(anotherCase); i++ {
		anotherCase[i] = 0
	}
	return anotherCase
}

func execute_problem66() int {

	fmt.Println("Hello from problem 66")

	return 0
}
