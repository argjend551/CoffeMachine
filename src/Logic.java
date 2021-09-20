import java.util.Scanner;

public class Logic {

    Scanner sc = new Scanner(System.in);

    static int water;
    static int milk;
    static int coffebeans;
    static int cups;
    static int money;



    public void Kaffeval(String val){


        if(val == "espresso" && CheckifEmpty() == true){


            System.out.println("i have enough of resources making you a espresso!");
            water = water - 2;
            coffebeans = coffebeans - 20;
            cups = cups - 1;
            money = money -2;

        }
        if(val == "latte" && CheckifEmpty() == true){
            System.out.println("i have enough of resources making you a latte!");
            water = water - 2;
            coffebeans = coffebeans - 13;
            milk = milk - 5;
            cups = cups - 1;
            money = money -2;

        }
        if(val == "cappuccino" && CheckifEmpty() == true){
            System.out.println("i have enough of resources making you a cappuccino!");
            water = water - 2;
            coffebeans = coffebeans - 15;
            milk = milk - 3;
            cups = cups - 1;
            money = money -2;

        }


    }

    public void refill(String Val){

        if(Val == "water" ){

            System.out.println("how much water do you want to refill? ");
            int waterfill = sc.nextInt();
            water = water + waterfill;
            System.out.println(waterfill + " added to your water");

        }

        if (Val == "milk"){

            System.out.println("how much milk do you want to refill? ");
            int milkfill = sc.nextInt();
            milk = milk + milkfill;
            System.out.println(milkfill + " added to your milk");



        }
        if(Val == "coffebeans"){

            System.out.println("how much coffebeans do you want to refill? ");
            int coffebeansfill = sc.nextInt();
            coffebeans = coffebeans + coffebeansfill;
            System.out.println(coffebeansfill + " added to your coffebeans");



        }
        if(Val == "cups"){

            System.out.println("how many cups do you want to refill? ");
            int cupsfill = sc.nextInt();
            cups = cups + cupsfill;
            System.out.println(cupsfill + " added to your cups");



        }
        if(Val == "money"){

            System.out.println("how much money do you want to deposit? ");
           int moneyfill = sc.nextInt();
            money = money + moneyfill;
            System.out.println(moneyfill + " added to your money");


        }

    }

    public boolean CheckifEmpty(){
        Menyer m = new Menyer();

        if(water<2){
            System.out.println("not enough water");


        }
        if(milk<3){
            System.out.println("not enough milk");


        }
        if(coffebeans<20){
            System.out.println("not enough coffebeans");


        }
        if(cups<1){
            System.out.println("no cups");


        }
        if(money<2){
            System.out.println("not enough money");

        } if (water >= 2 && milk >= 3 && coffebeans >= 20 && cups >= 1 && money >= 3){
            return true;

        } else {
            m.mainMeny();
            return false;
        }





    }


    public void remaining(){

        System.out.println("water: " + water);
        System.out.println("milk: " + Logic.milk);
        System.out.println("coffebeans: " + Logic.coffebeans);
        System.out.println("cups: " + Logic.cups);
        System.out.println("money: " + Logic.money);


    }
}
