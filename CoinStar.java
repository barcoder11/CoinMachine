/**
 * Program  will ask  users for a input  and then solve use the integer to calculate the total receipt.
 * @author Sangay pemba
 * @since 09/29/25
 */

public class  CoinStar {
    public static void main(String [] args){
        cTotal();

    }
    //INPUT
    public static void cTotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies did you insert?");
        int coin = scanner.nextInt();
         
        //PROCESS
        final double PERCENT = .20; 
        double total = coin * .01;
        double taxed = total * PERCENT;
        double reciept = total - taxed;


        //OUTPUT
        System.out.println("You have deposited $" + total);
        System.out.println("The processing fee is: $" + taxed);
        System.out.println("You earned $" + reciept);

        scanner.close();
    
    }
}
