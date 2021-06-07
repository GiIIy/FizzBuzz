def fizzBuzz():                                             # Creates a function called 'fizzBuzz'
    
    for x in range(1,101):                                  # Runs a for loop starting from one up until 100
        if x % 3 == 0 and x % 5 == 0:                       # Checks to see if i is divisible by 3 and 5 (without remainders) if so will output 'FizzBuzz'
            print("FizzBuzz")
        elif x % 3 == 0:                                    # Checks to see if i is divisible by 3 (without remainders) if so will output 'Fizz'
            print("Fizz")
        elif x % 5 == 0:                                    # Checks to see if i is divisible by 5 (without remainders) if so will output 'Buzz'
            print("Buzz")
        else:                                               # If none of these conditions are true then it will just print out the number
            print(x)                        


fizzBuzz()                                                      # Calls the fuction 'fizzBuzz'



