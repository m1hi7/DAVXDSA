package main

//const age = 25 (it will also work if we declare it outside the main function,
// but it is not a good practice to declare it outside the main function because
// it will be accessible to all the functions in the package, and it will be a global variable)
func main() {
	const name = "Go"
	//name = "Golang" // compile error: cannot assign to name***

	println("Hello", name)
}
