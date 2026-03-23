package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

// Student struct
type Student struct {
	Name string
	Age  int
}

var students []Student

// Add student
func addStudent(name string, age int) {
	students = append(students, Student{Name: name, Age: age})
	fmt.Println("✅ Student added!")
}

// View all students
func viewStudents() {
	if len(students) == 0 {
		fmt.Println("⚠️ No students found.")
		return
	}

	fmt.Println("\n📚 Student List:")
	for i, s := range students {
		fmt.Printf("%d. %s (%d years old)\n", i+1, s.Name, s.Age)
	}
}

// Remove student by index
func removeStudent(index int) {
	if index < 0 || index >= len(students) {
		fmt.Println("❌ Invalid index!")
		return
	}

	students = append(students[:index], students[index+1:]...)
	fmt.Println("🗑️ Student removed!")
}

// Search student
func searchStudent(name string) {
	found := false
	for _, s := range students {
		if strings.EqualFold(s.Name, name) {
			fmt.Printf("🔍 Found: %s (%d years old)\n", s.Name, s.Age)
			found = true
		}
	}
	if !found {
		fmt.Println("❌ Student not found.")
	}
}

func main() {
	reader := bufio.NewReader(os.Stdin)

	for {
		fmt.Println("\n====== Student Manager ======")
		fmt.Println("1. Add Student")
		fmt.Println("2. View Students")
		fmt.Println("3. Remove Student")
		fmt.Println("4. Search Student")
		fmt.Println("5. Exit")
		fmt.Print("Choose option: ")

		var choice int
		fmt.Scanln(&choice)

		switch choice {
		case 1:
			fmt.Print("Enter name: ")
			name, _ := reader.ReadString('\n')
			name = strings.TrimSpace(name)

			var age int
			fmt.Print("Enter age: ")
			fmt.Scanln(&age)

			addStudent(name, age)

		case 2:
			viewStudents()

		case 3:
			var index int
			fmt.Print("Enter student number to remove: ")
			fmt.Scanln(&index)
			removeStudent(index - 1)

		case 4:
			fmt.Print("Enter name to search: ")
			name, _ := reader.ReadString('\n')
			name = strings.TrimSpace(name)

			searchStudent(name)

		case 5:
			fmt.Println("👋 Exiting...")
			return

		default:
			fmt.Println("❌ Invalid choice!")
		}
	}
}
