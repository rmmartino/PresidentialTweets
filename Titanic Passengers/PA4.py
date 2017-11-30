#Programmer: Sarah Flaherty
#Course: CS 201-02
#Date: 11/7/16
#Programming Assignment: PA4
#Problem Statement: Titanic Questions Answered
#Data In: file read
#Data Out: new file, total survivors, percent of each class survived, percent of each gender survived
#Other files needed: file input from user, file written to
#Credits: Github Instructions

import sys
import os

#filename: Error check
#Parameters: filename
#Return: filename
def error_check(filename):
    while not os.path.exists(filename):
        filename=input("Please enter a valid file.")
    return filename

# Function Name: File Processing
# Parameters: user_file and write_to_file
# Return: none
def file_processing(user_file , write_to_file):
    try:
        inputfile = open(user_file, "r")
        outputfile = open(write_to_file, "w")
        total_survivors = 0
        class1_total = 0
        class2_total = 0
        class3_total = 0
        class1_surviors = 0
        class2_survivors = 0
        class3_survivors = 0
        total_passengers = 0
        females = 0
        males = 0
        females_survived = 0
        males_survived = 0
        for line in inputfile:
            class_number, survived, name, sex, age, embark, dest = line.split("|")
            total_passengers += 1
            if sex == "female":
                females += 1
            else:
                males += 1
            if class_number == "1":
                class1_total += 1
            elif class_number == "2":
                class2_total += 1
            else:
                class3_total += 1
            if survived == "1":
                print(line, file= outputfile)
                total_survivors +=1
                if sex == "female":
                    females_survived +=1
                else:
                    males_survived += 1
                if class_number == "1":
                    class1_surviors +=1
                elif class_number == "2":
                    class2_survivors +=1
                else:
                    class3_survivors +=1
        if class1_total != 0:
            class1_percent = class1_surviors / class1_total * 100
            class1_percent = round(class1_percent, 2)
        else:
            class1_percent = 0
        if class2_total != 0:
            class2_percent = class2_survivors / class2_total *100
            class2_percent = round(class2_percent, 2)
        else:
            class2_percent = 0
        if class3_total != 0:
            class3_percent = class3_survivors / class3_total *100
            class3_percent = round(class3_percent, 2)
        else:
            class3_percent = 0
        if females != 0:
            survived_females_percent = females_survived / females *100
            survived_females_percent = round(survived_females_percent,2)
        else:
            survived_females_percent = 0
        if males != 0:
            survived_males_percent = males_survived / males *100
            survived_males_percent = round(survived_males_percent,2)
        else:
            survived_males_percent = 0
        print(total_survivors, "people survived")
        print(class1_percent, "% of the first class survived.")
        print(class2_percent, "% of the second class survived.")
        print(class3_percent, "% of the third class survived.")
        print(survived_females_percent, "% of females survived.")
        print(survived_males_percent, "% of males survived")
        inputfile.close()
        outputfile.close()

    except FileNotFoundError:
        print("I'm sorry this file no longer exists.")
        sys.exit(1)

# Function Name: Main
# Parameters: none
# Return: none
def main():
    print("This software with determine the total number of survivors, the percentage of survivors from each class, percentage of each gender survived, and output the survivors information to a new file from a chosen file.")
    filename = input("Please enter the file name to be read: ")
    user_file = error_check(filename)
    write_to_file = input("Please enter the file name to be written to: ")
    file_processing(user_file, write_to_file)

main()
