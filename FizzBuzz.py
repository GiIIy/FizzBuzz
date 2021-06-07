def fizzBuzz():                                             # Creates a function called 'fizzBuzz'
    
    for i in range(1,101):                                  # Runs a for loop starting from one up until 100
        f = ""
        
        if x % 3 == 0:                                    # Checks to see if i is divisible by 3 (without remainders) if so will output 'Fizz'
            f = "Fizz"
        if x % 5 == 0:                                    # Checks to see if i is divisible by 5 (without remainders) if so will output 'Buzz'
            f = f + "Buzz"
        if f=="":                                               # If none of these conditions are true then it will just print out the number
            f = x   
            
        print(f)

        
        
        
        
fizzBuzz()                                                      # Calls the fuction 'fizzBuzz'



