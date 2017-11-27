import os
import sys

#Function Purpose: Read in the file and store as a list of lists

#Parameters: none
#Return: list of lists
def readFile():
    filename = input("Please enter the name of the file to be read.")
    while not os.path.exists(filename): #Make sure the file is a valid file
        filename = input("Please enter a valid file name.")
    try:
        file = open(filename, "r") #open the file
        list=[] #Create an empty list
        for line in file:
            temp = line.split("text:")
            list.append(temp[:1])#append the tweet text the list
        file.close()
        return list
    except:
        print("I'm sorry your file no longer exists.") #If the file ceases to exist, output error statement
        sys.exit(1)
