package main

import (
	"booking-app/helper"
	"fmt"
	"sync"
	"time"
)

var confName = "Go Conference"

const confTickets = 50

var remainingTickets uint = 50
var bookings = make([]UserData, 0)

type UserData struct {
	firstName string
	lastName  string
	email     string
	tickets   uint
}

var wg = sync.WaitGroup{}

func main() {

	greetUsers(confName, confTickets, remainingTickets)

	for {

		firstName, lastName, email, userTickets := getUserInput()

		isValidName, isValidEmail, isValidUserTicketCount := helper.ValidUserInput(firstName, lastName, email, userTickets, remainingTickets)

		if isValidName && isValidEmail && isValidUserTicketCount {

			bookTicket(remainingTickets, userTickets, firstName, lastName, email, confName)

			wg.Add(1)
			go sendTicket(userTickets, firstName, lastName, email)

			firstNames := getFirstNames()
			fmt.Printf("The first name of bookings are: %v\n", firstNames)

		}

		if remainingTickets == 0 {
			//end program
			fmt.Printf("The %v is sold out! Come back next year.\n", confName)
			break
		} else {
			if !isValidName {
				fmt.Println("The first name or last name entered is to short.")
			}
			if !isValidEmail {
				fmt.Println("The email address you entered does not contain the @ sign.")
			}
			if !isValidUserTicketCount {
				fmt.Println("The number of tickets entered is invalid.")
			}
			fmt.Println("Yoru input data is invalid, please try again.")
		}

	}
	
	wg.Wait()

}

func greetUsers(confName string, confTickets int, remainingTickets uint) {
	fmt.Printf("Welcome to %v Booking Application\n", confName)
	fmt.Printf("We have a total of %v tickets and %v are still available \n", confTickets, remainingTickets)
	fmt.Println("Get your tickets here to attend")
}

func getFirstNames() []string {
	firstNames := []string{}
	for _, booking := range bookings {
		firstNames = append(firstNames, booking.firstName)
	}
	return firstNames
}

func getUserInput() (string, string, string, uint) {
	var (
		firstName   string
		lastName    string
		email       string
		userTickets uint
	)

	fmt.Println("Enter your first Name:")
	fmt.Scan(&firstName)
	fmt.Println("Enter your last Name:")
	fmt.Scan(&lastName)
	fmt.Println("Enter your email:")
	fmt.Scan(&email)
	fmt.Println("How Many tickets do you want:")
	fmt.Scan(&userTickets)

	return firstName, lastName, email, userTickets
}

func bookTicket(remainingTickets uint, userTickets uint, firstName string, lastName string, email string, confName string) {
	remainingTickets -= userTickets

	var userData = UserData{
		firstName: firstName,
		lastName:  lastName,
		email:     email,
		tickets:   userTickets,
	}

	bookings = append(bookings, userData)

	fmt.Printf("List of bookings is %v\n", bookings)

	fmt.Printf("Thank you %v %v for purchasing %v tickets. You will receive a confirmation on your email %v shortly.\n", firstName, lastName, userTickets, email)
	fmt.Printf("There are %v tickets remaining for the conference %v\n", remainingTickets, confName)
}

func sendTicket(userTickets uint, firstName string, lastName string, email string) {

	time.Sleep(10 * time.Second)

	var ticket = fmt.Sprintf("%v ticket for %v %v", userTickets, firstName, lastName)
	fmt.Println("#######################")
	fmt.Printf("Sending ticket: \n %v\n to email address %v\n", ticket, email)
	fmt.Println("#######################")
	wg.Done()

}
