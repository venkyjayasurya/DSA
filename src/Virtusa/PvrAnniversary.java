package Virtusa;

import java.util.Scanner;

public class PvrAnniversary {
    int TotalTicketPrice(int NoOfTickets){
        int cost=0, refreshCost=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you interested in Elite or Premium");
        String eOrP = sc.nextLine();
        if(eOrP.equals("e")){
//            Cost = 75
            cost = NoOfTickets * 75;
        }else{
            // Cost = 120 for premium
            cost = NoOfTickets * 120;
        }
        cost = cost - (cost/100 * 12);
        System.out.println("Are you interested Refreshments or not");
        String refresh = sc.nextLine();
        if(refresh.equals("y")){
            refreshCost = (50 * NoOfTickets);
        }
        System.out.println("Do you have any special coupons");
        String coupons = sc.nextLine();
        if(coupons.equals("y")){
            cost = cost - (cost/100 * 8);
        }
        cost = cost + refreshCost;
        return cost;
    }

    public static void main(String[] args){
        PvrAnniversary obj= new PvrAnniversary();
        System.out.println("PVR Anniversary");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Tickets:");
        int NoOfTickets = sc.nextInt();
        if(NoOfTickets>4 && NoOfTickets<40){
            int TotalCost = obj.TotalTicketPrice(NoOfTickets);
            System.out.println("Total Cost = " + TotalCost);
        }else{
            System.out.println("Thanks for your request, You cannot book tickets now!");
        }
    }
}
