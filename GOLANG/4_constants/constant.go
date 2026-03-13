package main

import "fmt"

func main() {
	printConstants() // This tells Go to run your specific function
}

func printConstants() {
	const (
		position   = 2
		Name       = "Abdullah"
		University = "North South University"
		types      = "Undergraduate"
	)
	fmt.Println("Position:", position, "Name:", Name, "University:", University, "Type:", types)
}
