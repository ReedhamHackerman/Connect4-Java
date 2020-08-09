# Connect4-Java Game
This is a Popular Java game where duo can place a discs on board of 7 * 6 . When a player manages tomake a line, column, or diagonal of 4 discs, the game ends.

##Problem
Connect 4 is a board game for 2 players in which the goal is to make a line, or column, or
diagonal, of 4 colored discs in a grid of 6 rows and 7 columns. Each colored disc is “dropped” in
the grid by a player, and falls straight down to the lowest available position within the column in
which it was dropped. In other words, a dropped disc either falls to the bottom of the column, or
onto another disc that had already been dropped in that column.
Each player has 21 discs; one player has blue discs and the other player has green discs
One after the other, the players drop one disc at a time in the grid. When a player manages to
make a line, column, or diagonal of 4 discs, the game ends.
###Detailed Discription
First, the initial grid is shown on the screen.
Second, you use a prompt to ask the player 1 to enter the number of a column, using the
following message:
Which column do you put a disc into?
If the player's input is invalid because it is not a number, you tell the player to enter a
number.
If the player's input is invalid because it is a number that falls outside of the grid's boudaries,
you tell the player to choose the number of a column.
If the player's input is invalid because the chosen column is already full of discs, you tell the
player that it is full and ask him/her to choose another column.
If the player's input is valid, you move on the to the next step.
Third, the grid is shown again on the screen after the disc has been placed by the player.
Underneath the grid, a message is shown, saying:
Player has placed a blue disc in row x, column y.
For example, such a message could say:
Player has placed a blue disc in row 6, column 7.
This would of course correspond to the row at index 0 and the column at index 6 in the 2D
array.
Fourth, the grid is evaluated to see if there is a winner. If there is a winner, the game stops
and the winner is signaled through an onscreen message saying:
Player 1 wins!
Then, the program goes to the eighth step.
Fifth, player 2 chooses a column to put a disc into.
Sixth, the grid is shown again on the screen after the disc has been placed by player 2.
Underneath the grid, a message is shown, saying, for example: Player 2 has placed a blue disc
in row 6, column 7.
Seventh, the grid is evaluated to see if there is a winner. If there is a winner, the game stops
and the winner is signaled through an onscreen message saying:
Player 2 wins!
Then, the program goes to the eighth step.
Eighth, if there is no winner, the program goes back to the second step. If there is a winner
or if this is a draw (if no one wins), the program will terminated and you have to run again
##Solution
###Create 2D Array of char(like char[][])
###Create a Function To Get The Input From User
###Call Array And User Input in Loop
###First place Discs Statically
###Check Win Condition And Modify The PlaceDiscs function
###Validate Input (Io Exception , Input Mismatch,Range )
###Congratulations !!! You Did It

#Contribution
[Reedham Patel](https://www.linkedin.com/in/reedham-patel-2319681a2/)                                                                                   
[PC Gaming Colony](https://pcgamingcolony.com/)