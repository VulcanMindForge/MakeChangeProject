# MakeChangeProject

<h1 align="center">Hi 👋, I'm Jacob Stuart</h1>
<h3 align="center">Programming student with Skill Distillery</h3>

- I’m currently working on [MakeChangeProject](https://github.com/VulcanMindForge/MakeChangeProject)

- I’m currently learning **Java**

- All of my projects are available at [https://github.com/VulcanMindForge](https://github.com/VulcanMindForge)

<h3 align="left">Purpose of this project:</h3>
 <p align="left"> Calculate the amount of change returned to a customer based on the purchase price and the amount tendered. Notify the attendant how many of each type of currency ($100, $20, $10, $5, $1, .25c, .10c, .05c, .01c) is needed to make the change for the customer.</p>

<h3 align="left">How to use:</h3>
 <p align="left"> The program will greet you and ask if you are ready to take a customer. If you choose no, the program will say farewell and close. If you say yes you will be prompted to enter the cost of the item. After entering the cost you will be prompted to enter the amount recieved fromt the customer. If the customer gives exact change we thank them, if they don't give enough we explain it is not enough and request the remainder. If the customer give us more than enough we provide the amount of change they should recieve and break it down to the correct number of largest denominations to equal their change amount.</p>
 <p align="left"> You can modify the methods to convert to other monetary systems. Change the switch method to the proper names and amounts. Change the loop method to match the number of denominations set up in the switch method. Change the numMonies method so that the lowest denomination gets rounded properly.</p>


<h3 align="Left">Technologies used:</h3>
<p align="left">Overall I am learning and using Eclipse IDE to program in Java 1.8. Prior to this assignment we covered: Variables and Constants, Methods, Screen Output and Keyboard Input, Expressions, If/Else, Switch, While loops, For Loops, Cast Numerals. I plan to implement as many of these systems as make sense to get a better grasp of their uses and best practices.</p>

<h3 align="Left">Current progress:</h3>
<p align="left"> Finished with first version. Made some changes to the way the system worked after realizing I was repeating code. 
	<ol> 
		<li>Created switch method to do denomination calls and assign variables: Switch, call method with return</li>
		<li>Created loop that loops over every case in the switch method to check all denominations: For Loop, Method call, pass through variables, modify variable each loop.</li>
		<li>Created logic method numMonies that takes checks the given denomination and prints the amount needed to make change: Numerals, Casting, Method with param and return, If/Else, Sysout.</li>
		<li>Created multiple art methods including a greeting, farewell, and money drawer.: void method, sysout</li>
		<li>In Main, called greeting, set an infinite while loop with exit condition that calls farewell and ends loop. Loop calls for user input to determine if transaction needed, set scanner to take input from user, set nested if statements for makeing change, exact change, not enough payment. : PrintF, if/else, while.
		<li>Set variables and used scope across all methods.</li>
	</ol>
</p> 

<h3 align="Left">Next Step:</h3>
<p align="left"> 
	<ol> 
		<li>Have users test program and return suggestions for features</li>
		<li>Arrange for transaction where customer didn't provide enough money to continue until they have fully paid.</li>
		<li>Test with other currency systems</li>
	</ol>
</p> 
