/**
 * create a method that checks whether the given number is a Niven number or not, if it is, the method returns true, if not it returns false
 * @author Graham Ellacott
 */
public class Main {

  //the method that will check if the provided argument is a Niven number
  public static boolean isNiven(int number){
    //initialize variables
    int sum = 0; //the variable that will hold the sum of all the digits
    int digit; //stores the current digit of the provided number to add to the sum
    int testNum = number; //the number that will be taken apart to add all it's digits to the sum
    int remainder; //the variable that will hold the remainder of the number and the sum of it's digits

    //find the sum of all the digits
    do{
      //get the last digit of number and store it in the digit variable
      digit = testNum % 10;
      //add the current digit to the sum variable
      sum += digit;
      //remove the digit that was just checked from the number
      testNum /= 10; 
    }while(testNum > 0); //if the number still has more digits to be checked, repeat

    //check if the sum is a factor of the provided number
    //set the remainder to the remainder of number and the sum of it's digits
    remainder = number % sum;
    //check if the remainder is 0
    if(remainder == 0){ 
      //if the remainder is 0, then the number is a niven number
      return true;
    }else{
      //if it is not 0, then the sum is not a factor of the provided number
      return false;
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // test the module by printing out all niven numbers from 1 to 100
    for(int i = 1; i <= 100; i++){
      if(isNiven(i)){
        System.out.println(i);
      }
    }
    
  }
}
