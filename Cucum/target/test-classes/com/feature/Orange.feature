Feature: Adding new Employee Details
Scenario Outline: Login Functionality
Given user Launch the url
When user enter the "<UserName>" in UserName Field
And user enter the "<password>" in password Field
Then user click the Login Button And It Navigate To Home Page
Examples:

            | UserName     | password   |
            | adinm@12     | admin123   |
            | denim@34     | denim123   |
            | opadi        | opr123     |
            | Admin        | admin123   |