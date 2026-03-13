package main

func main() {

	var role = "admin"
	var hasPermission = true

	if role == "admin" && hasPermission {
		println("You have admin access")
	} else if role == "user" && hasPermission {
		println("You have user access")
	} else {
		println("Access denied")
	}
}
