public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz();                                                 // Calls the fuction 'fizzBuzz'
    }

    public static void fizzBuzz(){                                  // Creates a function called 'fizzBuzz'

        for(int i = 1; i<101; i++ ){                                // Runs a for loop starting from one up until 100
            if(i % 3 == 0 && i % 5 == 0){                           // Checks to see if i is divisible by 3 and 5 (without remainders) if so will output 'FizzBuzz'
                System.out.println("FizzBuzz");                     
            }else if(i % 3 == 0){                                   // Checks to see if i is divisible by 3 (without remainders) if so will output 'Fizz'    
                System.out.println("Fizz"); 
            }else if(i % 5 == 0){                                   // Checks to see if i is divisible by 5 (without remainders) if so will output 'Buzz'  
                System.out.println("Buzz");                         
            }else{                                                  // If none of these conditions are true then it will just print out the number
                System.out.println(i);                              
            }
        }
    }
}
