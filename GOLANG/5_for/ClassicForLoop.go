package main

func main() {

	// Classic for loop

	for i := 0; i <= 3; i++ {
		// Breaking the loop when i is 2
		if i == 2 {
			continue
		}
		println(i)

	}
}
