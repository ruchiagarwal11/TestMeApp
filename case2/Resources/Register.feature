Feature: Registration Functionality
 @Registration
  Scenario: Registartion with valid data
Given  Navigate to Home page
When user click "signup"
When  user name as "rinkiagarwal"
When user fname as "rinkiyaagrwal"
When user lname as "agarwal1"
When user password as "pass123"
When user confirmpassword as "pass123"
When user gender as "female"
When user email as "ruchi@gmail.com"
When user contactnumber as "7023553432"
When user dob as "03/08/1995"
When user address as "abs , nbd"
When  user selects  security question "What is your Pet Name?"
When user enter as "jullie"
Then user Registred  sucessfully
And verify user registred sucessfully

@case4
  Scenario: Login with valid credentials
 Given  Navigate to Home page
 When  user enters "Lalitha" and "password123"
Then user logged in sucessfully
   
@case4
  Scenario: The One Where user Picks different product through search functionality
When  Larry searches below products in the search box as Bags
Then product should be added in the cart if available
@case4
Scenario: Payment
When user open cart
When user checkout
When user fill the address as nbd,jj
When user click  payment
Then payment sucessfull

   
    
  
    