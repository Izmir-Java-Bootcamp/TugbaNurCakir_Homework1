
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a pattern string :"); //Getting a string value from the user
        Scanner input = new Scanner(System.in);
        String pattern = input.nextLine();
        String str = "";

        //will work at least once because we will doWhile loop.
        do{
            System.out.println("Enter a string:");

            str = input.nextLine();

            if(occursIn(pattern,str)){ //if there is str in pattern
                System.out.println(pattern+" occurs in "+str);
            }
            else{//if there is not str in pattern
                System.out.println(pattern+" does NOT occur in "+str);
            }

        }while(!str.equals("exit")); //If user write 'exit', the program is finish.

        System.out.println("Bye");

    }

    public static boolean occursIn(String pattern,String str){
        String[] eachSlice=pattern.split("\\*");
        //will split the string according to the star and assign it to the variable(array)
        String word="";

        for (int i = 0; i < eachSlice.length; i++) {
            word+=eachSlice[i]+".*";
        }

        if(str.matches(word)) {
            return true;
        }
        else{
            return false;
        }
    }

}