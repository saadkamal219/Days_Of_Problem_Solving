package main

import (
	"fmt"
)

func twoSum(nums []int, target int) []int {
	var i, j int

	for i = 0; i < len(nums); i++ {
		for j = i + 1; j < len(nums); j++ {
			if nums[j] == target-nums[i] {
				return []int{i, j}
			}
		}
	}
	return []int{}
}

func execute_problem1() int {
	var array []int = []int{2, 7, 13, 17, 23}
	var target int = 9

	var result []int = twoSum(array, target)

	fmt.Printf("Target was the sum of %d and %d\n", result[0], result[1])

	return 0
}
