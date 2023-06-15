# SmartWise

 A java program that validates which card the user has and puts in a database that puts a score to the card which me and my classmates worked on to pass for the finals for the course COMP103

<p align = "center">
  <img src="https://github.com/Gooseytwoshoes/Creditcard-Database/blob/main/README-Asset/bc708f525c5564857a1e16356be3a378.gif" alt="CC-GIF" width = "450"/>
</p>

<br>

# CreditWise

A seamless interface for using your (imaginary) credit card where you can verify, what type of credit card you have, track your billing cycle, and earn imaginary and useless points on something that doesn't exist if you registered in this imaginary program

  ## Login and registration screen
  - a login screen alike the ATM machine but better
  - registration of cards is seamless
  - registration where you can give your personal information
  
  ## CreditWise points
  - Imaginary and useless points that you could earn by using this program
  
  ## Rewards and freebies
  - Check out what you can get with useless and imaginary points
  
<br>

# Flowchart
<p align = "center">
  <img src="https://github.com/Gooseytwoshoes/Creditcard-Database/blob/main/README-Asset/CreditWise.flowchart.png" alt="flowchart" width = "1500"/>
</p>

## algorithm
1. START
2. Display the homepage.
3. Prompt the user.
-	If the choice is "1":
	-	Proceed to registration.
-	If the choice is "2":
	-	Proceed to login function.
-	If the choice is "3":
	-	Print the help information.
-	If the choice is "0":
	-	Print thank you message
	-	go to step 29.
-	If the choice is invalid:
	-	Print invalid input message and wait for user confirmation.

<br />
<br />
>registration:
<br />
4. Prompt the user for their name and store it in an array.

5. Prompt the user to enter their credit card number and store it in an array.

6. Validate credit card number on what type of card it is.

-	If the credit card is invalid, display error message and prompt user again.

7. Prompt the user to enter their password and store it in the userInfo array.
8. Prompt the user to confirm their credentials.

-	If the response is "1", set credentialsConfirmed to true.

9. Add the user's credentials to the credentials array.
10. go back to step 2

<br />
<br />
>login function:
<br />

11. Prompt the user to enter their name and store it in the loginDetails array.

12. Prompt the user to enter their password and store it in the loginDetails array.

13. Checks through the credentials array to find a matching credential information.

-	If a matching user is found, call the profile function matching user credentials.
-	If no matching user is found, print error message.

<br />
<br />
>profile function:
<br />

14. Display the profile page.

15. prompt user.

-	If the choice is "1":
	-	Go to step 16.
- If the choice is "2":
	- Go to step 18.
- If the choice is "3":
	- Go to step 22.
- If the choice is "4":
	- Go to step 27.
- If the choice is "0":
	- Go back to step 2.
- If the choice is invalid:
	- Print invalid input message.
	
<br />
<br />
>CheckPoints function:
<br />

16. Print user's name and points.

17. Go back to step 14.

<br />
<br />
>Redeem function:
<br />

18. Print redemption options.
19. Prompt user to claim food or accessories.
-	If user promts 1 or 2 proceed to step 20.
-	If user prompts 0, go back to step 14.
20. Check if the user has enough points to claim.
-	If user has enough points, go to step 21.
-	If user does not have enough points, print insufficient points message.
21. Print confirmation message.
-	If the user confirms, reduce 50 points from their points.
-	if user doesn't confirm go back to step 18.

<br />
<br />
>Freebies function:
<br />

22. Print freebies page, show user what freebie they'll get.
23. Prompt user if they want to claim it.

-	If user prompts 1, go to step 24.
-	If user prompts 0, go back to step 14.

24. Print redemption confirmation message.
25. Prompt user to confirm.
-	If user confirms, go to step .
-	If user declines, go back to step 22.
26. Print successful claim message and go back to step 14

<br />
<br />
>Rewards Center function:
<br />

27. Print rewards center
28. Prompt user.
-	If user prompts 1, go to step 16.
-	If user prompts 2, print out future feature message and go back to step 14.
-	if user prompts 3, print information about points.
-	if user prompts 0, go back to step 14.
<br />
29. END
