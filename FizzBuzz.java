public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz();                                                 // Calls the fuction 'fizzBuzz'
    }

    public static void fizzBuzz(){                                  // Creates a function called 'fizzBuzz'

        for(int i = 1; i<101; i++ ){                                // Runs a for loop starting from one up until 100
            String f= "";                                           // Creates Variable f
            if(i % 3 == 0){                                         // Checks to see if i is divisible by 3 (without remainders) if so add 'fizz' to f
                f = "Fizz";                     
            }if(i % 3 == 0){                                        // Checks to see if i is divisible by 5 (without remainders) if so add 'buzz' to f  
                f = f + "Buzz";
            } if(f==""){                                           // If none of these conditions are true then it will just print out the number
                f = Integer.toString(i);                 
            }
            System.out.println(f);                                // outputs variable f
        }
    }
}
