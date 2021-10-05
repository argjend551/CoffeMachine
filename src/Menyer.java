import java.util.Scanner;

public class Menyer {
    Scanner sc = new Scanner(System.in);
   private String inputChoice;
    private String refill;
    Logic a = new Logic();

// Main menyn för kaffe maskinen

public void mainMeny(){
        System.out.print("buy, fill, remaining, exit: ");
   inputChoice = sc.nextLine();
while (true) {
    if(inputChoice.equals("buy")){
        Buy();
    }
    if(inputChoice.equals("fill")){
        Fill();
    }
    if(inputChoice.equals("remaining")){
        a.Remaining();
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

// meny för att välja vilken kaffe du vill ha
// Skickar värdet espresso,latte,cappuccino beroende vilken du väljer till metoden Kaffeval i klassen Logic


    public void Buy(){
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String kaffeVal = sc.nextLine();


        if(kaffeVal.equals("1")){
            userChoice.CoffeChoice("espresso");
        }
        if(kaffeVal.equals("2")){
            userChoice.CoffeChoice("latte");
        }
        if(kaffeVal.equals("3")){
            userChoice.CoffeChoice("cappuccino");
        }

    }


    // Meny för att välja vad du vill fylla på, när du gjort ditt val skickas värdet till metoden Refill i Logic klassen.

    public void Fill(){
        Menyer meny = new Menyer();
        System.out.print("What do you want to fill? 1 - water, 2 - milk, 3 - coffebeans, 4 - cups, 5 - money: ");

        refill = sc.nextLine();


        while(true) {

            if (refill.equals("1")) {
                userChoice.Refill("water");
                meny.mainMeny();
            } else if (refill.equals("2")) {
                userChoice.Refill("milk");
                meny.mainMeny();
            } else if (refill.equals("3")) {
                userChoice.Refill("coffebeans");
                meny.mainMeny();
            } else if (refill.equals("4")) {
                userChoice.Refill("cups");
                meny.mainMeny();
            } else if (refill.equals("5")){
                userChoice.Refill("money");
                meny.mainMeny();
            }
            else {
                System.out.println("Enter 1-5");
            }

            refill = sc.nextLine();

        }


    }





}






