import java.util.Scanner;

public class Menyer {
    Scanner sc = new Scanner(System.in);
   private String inputChoice;
    private String refill;
    Logic a = new Logic();


public void mainMeny(){
        System.out.print("buy, fill, remaining, exit: ");
   inputChoice = sc.nextLine();
while (true) {
    if(inputChoice.equals("buy")){
        buy();
    }
    if(inputChoice.equals("fill")){
        fill();
    }
    if(inputChoice.equals("remaining")){
        a.remaining();
    }
    if (inputChoice.equals("exit")){
        System.exit(0);
    }
    else {
        System.out.print("Chose between buy,fill,reamining,exit: ");
    }

    inputChoice = sc.nextLine();
}

}

    Logic userChoice = new Logic();

    public void buy(){
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String kaffeVal = sc.nextLine();

        if(kaffeVal.equals("1")){
            userChoice.Kaffeval("espresso");
        }
        if(kaffeVal.equals("2")){
            userChoice.Kaffeval("latte");
        }
        if(kaffeVal.equals("3")){
            userChoice.Kaffeval("cappuccino");
        }

    }

    public void fill(){
        Menyer meny = new Menyer();
        System.out.print("What do you want to fill? 1 - water, 2 - milk, 3 - coffebeans, 4 - cups, 5 - money: ");

        refill = sc.nextLine();


        while(true) {

            if (refill.equals("1")) {
                userChoice.refill("water");
                meny.mainMeny();
            } else if (refill.equals("2")) {
                userChoice.refill("milk");
                meny.mainMeny();
            } else if (refill.equals("3")) {
                userChoice.refill("coffebeans");
                meny.mainMeny();
            } else if (refill.equals("4")) {
                userChoice.refill("cups");
                meny.mainMeny();
            } else if (refill.equals("5")){
                userChoice.refill("money");
                meny.mainMeny();
            }
            else {
                System.out.println("Enter 1-5");
            }

            refill = sc.nextLine();

        }


    }





}






