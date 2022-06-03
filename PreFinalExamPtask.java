import java.util.Scanner;

public class PreFinalExamPtask {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        String nameOne, nameTwo, nameThree;
        String one, two, three, four, five, six;
        String numberOne = "1";
        String numberTwo = "2";
        String numberThree = "3";
        String numberFour = "4";
        String numberFive = "5";
        String numberSix = "6";
        
        System.out.println("Enter three first names: ");
        nameOne = input.nextLine();
        nameTwo = input.nextLine();
        nameThree = input.nextLine();
        
        System.out.println("");
        
        System.out.println("Possible names are:");
        
        one = nameOne + " " + nameTwo;
        two = nameOne + " " + nameThree;
        three = nameTwo + " " + nameOne;
        four =  nameTwo + " " + nameThree;
        five = nameThree + " " + nameOne;
        six = nameThree + " " + nameTwo;
      
         System.out.println(numberOne + "." + one);
         System.out.println(numberTwo + "." + two);
         System.out.println(numberThree + "." + three);
         System.out.println(numberFour + "." + four);
         System.out.println(numberFive + "." + five);
         System.out.println(numberSix + "." + six);
         
         System.out.println("");
         
        int i = 1;
        String SuggestedOne = one.toLowerCase();
        String SuggestedTwo = two.toLowerCase();
        String SuggestedThree = three.toLowerCase();
        String SuggestedFour = four.toLowerCase();
        String SuggestedFive = five.toLowerCase();
        String SuggestedSix = six.toLowerCase();
         
        System.out.print("Enter 1-6 to select name: ");
        i = input.nextInt();
         
       switch (i) {
       case 1:
        System.out.println("The initial for " + one + " is " + one.charAt(0) + one.charAt(5));
        System.out.println("Suggested username: " + SuggestedOne.replace(' ', '_'));
        break; 

        case 2:
        System.out.println("The initial for " + two + " is " + two.charAt(0) + two.charAt(5));
        System.out.println("Suggested username: " + SuggestedTwo.replace(' ', '_'));
        break;

        case 3:
        System.out.println("The initial for " + three + " is " + three.charAt(0) + three.charAt(5));
        System.out.println("Suggested username: " + SuggestedThree.replace(' ', '_'));
        break;

        case 4:
        System.out.println("The initial for " + four + " is " + four.charAt(0) + four.charAt(5));
        System.out.println("Suggested username: " + SuggestedFour.replace(' ', '_'));
        break;
        
        case 5:
        System.out.println("The initial for " + five + " is " + five.charAt(0) + five.charAt(5));
        System.out.println("Suggested username: " + SuggestedFive.replace(' ', '_'));
        break;
        
        case 6:
        System.out.println("The initial for " + six + " is " + six.charAt(0) + six.charAt(5));
        System.out.println("Suggested username: " + SuggestedSix.replace(' ', '_'));
        break;

        default :
        System.out.println("Invalid Input");
        break;
     
       }
             
    }
      
}
    