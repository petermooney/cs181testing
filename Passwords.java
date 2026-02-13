import java.util.Random;
public class Passwords {
    
    public static void main(String args[])
    {
        System.out.println("Generating passwords"); 
        Random randGen = new Random(); // our random class 
        // Step 1
        int n = 8; // password length

        String password = ""; // our password String 

        for (int i = 0; i < n; i++) // iterate n times // Step 2
        {
            //Each time we iterate use the Random class to 
            // generate a random integer between 48 and 122 

            int randNum = 48 + randGen.nextInt(75);
            // cast the integer to a character - ASCII table 
            char randChar = (char)(randNum);
            // add character to password String 
            password = password + randChar; 

        } // end for 
        // Step 3 - print password
        System.out.println("Your password is " + password);  
    }
}