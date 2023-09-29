public class ForLoops {
    public static void main(String[] args){
        for (int i = 0; i<=5; i++){
            System.out.println("The number is " + i);
        }
        
        double a = 10000;
        for (double i = 7.5;  i<100; i+=0.25){
            if (i > 8.5){
                break;
            }
            System.out.println("The amount for "+ i +"% is " +calculateInterest(a, i) );
        }
    
    }

    public static double calculateInterest(double amount, double interest){
        return (amount * (interest/100));
    }
}
