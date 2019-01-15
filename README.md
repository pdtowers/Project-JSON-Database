# Project-JSON-Database

Stage #1: 100-cell database

Description
JSON database is a single file database that can store simple and complex bits of information for you in the form of JSON. Also, it is a remote database and you can get access to it using the internet.

For this stage, you need to simulate a database. This database can store text information in an array of size 100. From the start of the database, every cell contains an empty string. The user can save strings in the cells as well as read the information from cells. The user can also delete information in cells. After deletion, the cell should contain an empty string.

The user can input "set", "get", or " delete".

After “set,” he should specify a number from 1 to 100 and then the text to be saved to the cell. The program should output 'OK' or 'ERROR' if a number index is wrong. If the specified cell already contains information, you should simply rewrite it.

After “get,” the user should specify the number of the cell from which to get information. If the cell is empty or the number index is wrong, the program should output 'ERROR'; otherwise output the content of the cell.

After “delete”, the user should specify the number of the cell. If the number index is wrong, the program should output "ERROR", otherwise, output 'OK'. Notice, that you can delete an empty string; the result is also an empty string.

If the user wants to exit the program, he should enter “exit.”

Output example
The lines that start with ? represent the user input. 

? get 1
ERROR
? set 1 Hello world!
OK
? set 1 HelloWorld!
OK
? get 1
HelloWorld!
? delete 1
OK
? delete 1
OK
? get 1
ERROR
? set 55 Some text here
OK
? get 55
Some text here
? get 56
ERROR
? delete 55
OK
? delete 56
OK
? delete 100
OK
? delete 101
ERROR
? exit
