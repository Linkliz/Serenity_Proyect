   Feature: Add two number on dneonline service
     I as a user want to add two numbers
     Scenario: Add two number
       When you add two number
         |number_one   |number_two |
         | 2           | 4         |
       Then I should see the response of the service is 200