public class IsPrime {
    public static void main(String[] args){
        System.out.println("Here are the primes:");
        for (int x=0; x<100; x++){
            boolean res = primes(x);
            if (res == true){
                System.out.print(x + " ");
            if (x == 17){
                break;
            }
            }
        }
        System.out.println("");
    }

public static boolean primes(int wholeNumber){
    if (wholeNumber == 0 || wholeNumber == 1 ){
        return false;
    }
    
    for (int divisor = 2; divisor < wholeNumber; divisor++){
        if (wholeNumber % divisor == 0) {
            return false;   
        }
    }
    return true;
}

}
