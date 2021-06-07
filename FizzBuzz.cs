using System;

class MainClass {
  public static void Main (string[] args) {
    
    fizzBuzz();                                   // Calls the fuction 'fizzBuzz'           

  }

  public static void fizzBuzz(){                  // Creates a function called 'fizzBuzz'      
    
    for (int i = 1; i<101; i++){                  // Runs a for loop starting from one up until 100
      string f= "";                               // Creates Variable f
      if(i % 3 == 0){                             // Checks to see if i is divisible by 3 (without remainders) if so add 'fizz' to f
        f = "Fizz";
      }if(i % 5 == 0){                            // Checks to see if i is divisible by 5 (without remainders) if so add 'buzz' to f  
        f = f + "Buzz";
      }if(f==""){                                 // If none of these conditions are true then it will just print out the number
        Console.Write(i);
      }
      Console.Write(f);                           // outputs variable f
      Console.WriteLine();                        // moves to new line

    }
  }
}
