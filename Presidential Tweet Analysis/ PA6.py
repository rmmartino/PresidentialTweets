# Lab2 Rebecca and Sarah
# Course : CS201.02
# Date : December 5, 2016
# Assignment : PA6
# Problem Statement : This program will offer the user the options to find the candidate most mentioned with a word, make a graph of the frequency of candidates mentioned,
# find the frequency of change in candidate mentioned, or make a graph of the frequency of an issue, depending on what the user chooses to do
# Data In : file name to be read: filename, choice of what to do: choice, word to match with candidate: word, output file name for change in frequency: output file
# Data Out: menu options,frequency_of_issues.png, output file, candidate_mention_frequency.png, candidate mentioned most frequently with the input word
# Sources: Python textbook pp. 825
# Other files: n/a

import os
import sys
import pylab

# Function Purpose: Read in the file and make sure it exists
# Author: Sarah and Rebecca
# Parameters: none
# Return: filename
def inputFilename():
    filename = input("Please enter the name of the file to be read.").strip()
    while not os.path.exists(filename): #Make sure the file is a valid file
        filename = input("Please enter a valid file name.")
    return filename


# Function Purpose: Read in the file and store as a list of lists
# Author: Sarah and Rebecca
# Parameters: filename
# Return: list of lists
def readFile(filename):
    try:
        file = open(filename, "r") #open the file
        list=[] #Create an empty list
        for line in file:
            temp = line.lower().strip("\n").split("text: ")
            list.append(temp[1])#append the tweet text the list
        file.close()
        return list
    except FileNotFoundError:
        print("I'm sorry your file no longer exists.") #If the file ceases to exist, output error statement
        sys.exit(1)


# Function name: optionMenu
# Author: Sarah
# Purpose: offer the user the options to find the candidate most mentioned with a word, make a graph of the frequency of candidates mentioned, find the frequency of change in candidate mentioned, make a graph of the frequency of an issue, or to quit
# Parameters: none
# Return value: choice
def optionMenu():
    print("You can chose one of the following 5 options:") #Ask the user to chose an option from the following options
    print("1. Find the candidate mentioned most frequently with a word.")
    print("2. Make a graph of the frequency of candidates mentioned.")
    print("3. Find the frequency of change in candidate mentioned.")
    print("4. Make a graph of the frequency of an issue")
    print("5. Quit.")
    print("")
    choice = input ("Please enter the number corresponding to your choice.")
    if choice != "1" and choice != "2" and choice != "3" and choice != "4" and choice != "5": #make sure that the users option is one of the 5
        choice = input("Please enter a number 1-5") #Ask them to input a valid option
    return choice


# Function name: candidateWordAssociation
# Authors: Sarah and Rebecca
# Purpose: find which candidate was mentioned most with an inputted word (option 1)
# Parameters: list of lists
# Return value: candidate name
def candidateWordAssociation(tweet_list, word):
    tweets_with_word = []
    #Make list of tweets with the word
    for tweet in tweet_list:
        if word in tweet:
            tweets_with_word.append(tweet)
    if len(tweets_with_word) == 0: #If there are no tweets with the word, tell the user
        print ("The word was not in any of the tweets")

    trump = 0
    hillaryclinton = 0
    berniesanders = 0
    carson = 0
    cruz = 0
    omalley = 0
    bush = 0
    fiorina = 0
    rubio = 0
    randpaul = 0

    #add to the count for each candidate if their name is in the tweet with the word given by the user
    for tweet in tweets_with_word:
        if "trump" in tweet:
            trump += 1
        if "hillary" in tweet or "clinton" in tweet:
            hillaryclinton += 1
        if "bernie" in tweet or "sanders" in tweet:
            berniesanders += 1
        if "carson" in tweet:
            carson += 1
        if "cruz" in tweet:
            cruz += 1
        if "o'malley" in tweet:
            omalley += 1
        if "bush" in tweet:
            bush += 1
        if "fiorina" in tweet:
            fiorina += 1
        if "rubio" in tweet:
            rubio += 1
        if "rand paul" in tweet:
            randpaul += 1

    #Find which candidates name was most frequent (which had the highest count)
    maximum = max(trump, hillaryclinton, berniesanders, carson, cruz, omalley, bush, fiorina, rubio, randpaul, 1)
    if trump == maximum:
        return "Trump"
    if hillaryclinton == maximum:
        return "Hillary Clinton"
    if berniesanders == maximum:
        return "Bernie Sanders"
    if carson == maximum:
        return "Carson"
    if cruz == maximum:
        return "Cruz"
    if omalley == maximum:
        return "O'Malley"
    if bush == maximum:
        return "Bush"
    if fiorina == maximum:
        return "Fionina"
    if rubio == maximum:
        return "rubio"
    if randpaul == maximum:
        return "randpaul"
    if 1 == maximum:
        return "No candidate"


# function name: findFrequency
# Authors: Sarah and Rebecca
# purpose: determine the frequency of a candidates name
# parameters: list, name
# return value: number of tweets
def findFrequency(list, name):
    count = 0
    #Finds the frequency of a candidates name being mentioned in the tweet
    for tweet in list:

        if name in tweet:
            count += 1
    return count


# function name: frequencyChange
# Authors: Sarah and Rebecca
# purpose: determine the difference in how frequently each candidate's name is mentioned over 2 years and write to file (option 2)
# parameters: list of lists
# return value: none
def frequencyChange(tweet_list):
    second_file = inputFilename()
    second_list = readFile(second_file)

    #Store the change in frequency for each candidate
    trump = findFrequency(tweet_list, "trump") - findFrequency(second_list, "trump")
    hillary = (findFrequency(tweet_list, "hillary") + findFrequency(tweet_list, "clinton")) - (findFrequency(second_list, "hillary") + findFrequency(second_list, "clinton"))
    berniesanders = (findFrequency(tweet_list, "bernie") + findFrequency(tweet_list, "sanders")) - (findFrequency(second_list, "bernie") + findFrequency(second_list, "sanders"))
    carson = findFrequency(tweet_list, "carson") -  findFrequency(second_list, "carson")
    cruz = findFrequency(tweet_list, "cruz") - findFrequency(second_list, "cruz")
    omalley= findFrequency(tweet_list, "o'malley") - findFrequency(second_list, "o'malley")
    bush = findFrequency(tweet_list, "bush") - findFrequency(second_list, "bush")
    fiorina = findFrequency(tweet_list, "fiorina") - findFrequency(second_list, "fiorina")
    rubio = findFrequency(tweet_list, "rubio") - findFrequency(second_list, "rubio")
    paul = findFrequency(tweet_list, "rand paul") - findFrequency(second_list, "rand paul")

    #Output all of the frequencies of change to a new ouput file given by the user.
    output = input("What file to you want to write the results to?")
    file = open(output, "w")
    print ("The frequency of change for Trump was:", trump, file=file)
    print("The frequency of change for Hillary Clinton was:", hillary, file=file)
    print("The frequency of change for Bernie Sanders was:", berniesanders, file=file)
    print("The frequency of change for Carson was:", carson, file=file)
    print("The frequency of change for Cruz was:", cruz, file=file)
    print("The frequency of change for O'Malley was:", omalley, file=file)
    print("The frequency of change for Bush was:", bush, file=file)
    print("The frequency of change for Fiorina was:", fiorina, file=file)
    print("The frequency of change for Rubio was:", rubio, file=file)
    print("The frequency of change for Rand Paul was:", paul, file=file)
    file.close()


# function name: nameFrequencyGraph
# Authors: Sarah and Rebecca
# purpose: make a graph that shows the frequency of how many times each candidate's name is mentioned (option 2)
# parameters: list of lists
# return value: output file
def nameFrequencyGraph(tweet_list):
    nameslist = [1,2,3,4,5,6,7,8,9,10]
    LABELS = ["Trump", "Clinton", "Sanders", "Carson", "Cruz", "O'Malley", "Bush", "Fiorina", "Rubio", "Rand Paul"]
    frequency = []
    #Find frequencies of each candidate mentioned in the tweets list
    trump = findFrequency(tweet_list, "trump")
    hillary = (findFrequency(tweet_list, "hillary") + findFrequency(tweet_list, "clinton"))
    berniesanders = (findFrequency(tweet_list, "bernie") + findFrequency(tweet_list, "sanders"))
    carson = findFrequency(tweet_list, "carson")
    cruz = findFrequency(tweet_list, "cruz")
    omalley = findFrequency(tweet_list, "o'malley")
    bush = findFrequency(tweet_list, "bush")
    fiorina = findFrequency(tweet_list, "fiorina")
    rubio = findFrequency(tweet_list, "rubio")
    paul = findFrequency(tweet_list, "rand paul")

    #Make a list of the frequencies
    frequency.append(trump)
    frequency.append(hillary)
    frequency.append(berniesanders)
    frequency.append(carson)
    frequency.append(cruz)
    frequency.append(omalley)
    frequency.append(bush)
    frequency.append(fiorina)
    frequency.append(rubio)
    frequency.append(paul)

    #Make the graph and save it to candidate_mention_frequency.png
    pylab.bar(nameslist, frequency)
    pylab.xticks(nameslist, LABELS, rotation="vertical")
    pylab.xlabel("Candidate")
    pylab.ylabel("Frequency")
    pylab.title("Candidate Mention Frequency in Tweets")
    pylab.tight_layout()

    pylab.savefig((input("Please enter the name of the file you want the graph to be sent to:")))


# function name: inputIssueChoice
# author: Rebecca and Sarah
# purpose: give the user the top 10 most talked about issues and ask them to choose 3 (option 4)
# parameters: none
# return value: choice
def inputIssueChoice():
    #Print all the menu choices
    print("Of the following issues, please pick 3 you want to see how relevant they were with Hillary Clinton and Donald Trump")
    print("1: immigration \t \t \t 2: gun control")
    print("3: climate change \t \t 4: refugees")
    print("4: health care \t \t \t 5: abortion")
    print("5: death penalty \t \t 6: taxes")
    print("7: equal pay \t \t \t 8: same-sex marraige")
    print("9: the wall \t \t \t 10: education")
    choice = input("What is the issue do you want shown in the graph (Enter 1-10)?")
    while (not choice.isdigit()) or int(choice) > 10 or int(choice) < 1: #Make sure that their choice is valid
        choice = input("Please enter a valid choice (1-10):")
    return choice


# function name: issueFrequency
# authors: Sarah and Rebecca
# purpose: create a graph that shows the frequency of issues chosen by the user (option 4)
# parameters: list of lists
# return value: output file
def issueFrequency(tweet_list):
    choice1 = inputIssueChoice()
    choice2 = inputIssueChoice()
    choice3 = inputIssueChoice()

    #Find the frequency of each of their choices
    choice1_frequency = findFrequency(tweet_list, choice1)
    choice2_frequency = findFrequency(tweet_list, choice2)
    choice3_frequency = findFrequency(tweet_list, choice3)

    #Make the graph of the frequencies of the issues and save in frequency_of_issues.png
    choices= [1,2,3]
    frequencies= [choice1_frequency, choice2_frequency, choice3_frequency]
    pylab.bar(choices,frequencies)
    xlabels = ["choice1", "choice2", "choice3"]
    pylab.xticks(choices, xlabels)
    pylab.xlabel("Issues")
    pylab.ylabel("Frequency")
    pylab.title("Frequency of Issues")
    pylab.savefig(input("Please enter the name of the file you want the graph to be sent to:"))


# Function name: main
# Authors: Sarah and Rebecca
# Purpose: give the purpose, call the functions, output the information for their choice
# Parameters: none
# Return value: none
def main():
    file = inputFilename()
    tweet_list = readFile(file) #Make the list
    function_choice = optionMenu() #Give the user their options
    #While they chose not to quit, run the corresponding function.
    while function_choice != "5":
        if function_choice == "1":
            word = input("Please input a word for which you want to know the candidate most associated with that word:").strip().lower()
            maximum = candidateWordAssociation(tweet_list, word)
            if len(tweet_list) == 0:
                print("The word was not in any of the tweets\n")
            else:
                print(maximum, "was mentioned most with the word", word, ".\n")
        elif function_choice == "2":
            nameFrequencyGraph(tweet_list)
            print("View the graph in the file of your choice.\n")
        elif function_choice == "3":
            frequencyChange(tweet_list)
            print("")
        else:
            issueFrequency(tweet_list)
            print("View the graph in the file of your choice.\n")
        function_choice = optionMenu()
    print("Thank you for using the program") #Thank user

main()
