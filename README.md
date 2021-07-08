# API_UI_Test_Amplience

================================================

To make it in two different ways, I made the first task in TestNG and used Hamcrest Matchers for Assertion.
For the second task I used Cucumber BDD. I also used my ready Configuration.properties, Driver and Utilities packages.

Tried to commit every page I created to briefly explain what I did, why I did.

Created BasePage to store my Web Elements and made the class abstract to hide the implementation. 
Created DashboardPage which extends BasePage to retrieve the web elements.

After cloning the project there are couple of ways to run the code.

For the Second Task:

1- Go to src -> test -> java -> Amplience -> runners -> CukesRunner 
Run the code.
(tags can be modified to run the specific scenarios)

2- Go to src -> test -> resources -> features -> CheckGitPageDetails 
Run the code. 

3- Run the code from Terminal with "mvn clean verify" keyword.

For the First Task:

-Go to src -> test -> java -> Amplience -> steps -> JsonBodyCheck
Run the "checkUser()".

================================================


