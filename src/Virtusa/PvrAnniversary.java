package Virtusa;

/*
* 5
* elite or premium -> p/e
* refreshments/not -> y/n
* special coupons -> y/n
*
* */

import java.util.Scanner;

public class PvrAnniversary {
    public static int TotalTicketPrice(int NoOfTickets){
        int cost=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you interested in Elite or Premium");
        String eOrP = sc.nextLine();
        if(eOrP.equals("e")){
//            Cost = 75
            cost = NoOfTickets * 75;
        }else{
            cost = NoOfTickets * 120;
        }
        cost -=  (cost/100 * 12);
        System.out.println("Are you interested Refreshments or not");
        String refresh = sc.nextLine();
        if(refresh.equals("y")){
            cost += 50;
        }
        System.out.println("Do you have any special coupons");
        String coupons = sc.nextLine();
        if(coupons.equals("y")){
            cost -= (cost/100 * 8);
        }
        return cost;
    }

    public static void main(String[] args){
        System.out.println("PVR Anniversary");
        Scanner sc= new Scanner(System.in);
        int NoOfTickets = sc.nextInt();
        if(NoOfTickets>4 && NoOfTickets<40){
            int TotalCost = TotalTicketPrice(NoOfTickets);
            System.out.println("Total Cost = " + TotalCost);
        }else{
            System.out.println("Thanks for the request, You cannot book tickets now!");
        }
    }
}
