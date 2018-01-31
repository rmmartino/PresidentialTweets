# CS201 PROGRAMMING ASSIGNMENT 6

Assignment Description written by Dr. Olsen

## PURPOSE OF THE ASSIGNMENT
Social media has been a huge player in this year's election. 
For this PA, you will investigate how the tweets related to various presidential candidates differed during a single weekend during the primary.

## Details
You must create a program that can read in all data from the file, store it in a list, and then answer questions about that data.

### File Info
Your file in this PA contains all tweets over a 24 hour period that mentioned one of the presidential primary candidates.
Those candidates (in no particular order) are Hillary Clinton, Bernie Sanders, Donald Trump, Ted Cruz, Ben Carson, Martin O'Malley, Jeb Bush, Carly Fiorina, Marco Rubio, and Rand Paul.

Each line of your input file contains the following:
* An ID of the twitter user who wrote the tweet, with "id:" before it
* The contents of the tweet, with "text:" before it

The user provides the name of the file to use as input. You have access to 4 files: a short version and the full version from Nov 19, 2015 and from Nov 19, 2016. 

### Program Abilities
Your program must answer the following questions:
* Which candidate is mentioned most frequently with a particular word? (word provided by the user)
* How frequently is each candidate mentioned in a tweet? Create a graph showing each candidate and the number of tweets mentioning them, sorted from least to most frequent.
* How has the frequency of mention changed for each candidate between two different years on the same day? Ask the user for a second input file. Read in this input file, and then compare data from the two input files. Output the difference between the two years for each candidate to a file (each line should state the candidate and then the change in frequency).
* Another question of your choice!

You must give a menu with all options for the user. The program should only end when the user chooses the option to end from the menu.

### Important Notes on File Data
Note that this data was created by searching for only last names for some candidates, and both first and last names for other candidates.
You will need to take that information into account as you answer questions related to a candidate's name.
The values searched for in tweets to create this data are:
['trump', 'hillary', 'clinton', 'bernie', 'sanders', 'carson', 'cruz', "o'malley", 'bush', 'cruz', 'fiorina', "rubio", "rand paul"]

You will also need to be very careful on how you split this data when storing it -- you may want to consider splitting on a phrase instead of a single character.
