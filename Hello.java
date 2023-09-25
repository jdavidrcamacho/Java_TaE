public class Hello {

    public static void main(String[] args){
        System.out.println("Hello World! \n");
        boolean isAlien = true;
        if (isAlien == false){
            System.out.println("It is not an alien \n");
        }
        else{
            System.out.println("It is an alien!!!! \n");
        }

        int topScore = 80;
        if (topScore >= 100){
            System.out.println("High score!!! \n");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Another great score \n");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both condtions are true \n");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("Not an Error \n");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("Not supossed to occur \n");
        }

        String makeOfCar = "BMW";
        boolean isDomestic = (makeOfCar == "Volvo") ? false : true;
        if (isDomestic){
            System.out.println("It is german \n");
        }

        String s = (isDomestic) ? "Yes it is" : "No it isnt";
        System.out.println(s);
    }
}
