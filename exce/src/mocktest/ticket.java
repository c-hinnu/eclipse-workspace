package mocktest;
import java.util.*;

import java.util.Scanner;

 class Tickets
{
private int ticketid;
public int getTicketid() {
	return ticketid;
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public static int getAvailableTickets() {
	return availableTickets;
}
public static void setAvailableTickets(int availableTickets) {
	
	Tickets.availableTickets = availableTickets;
	if(availableTickets<1)
	{
		System.out.println("not");
	}
    }
private int price;
static int availableTickets;
public int calculateTicketCost(int nooftickets)
{
	availableTickets=availableTickets-nooftickets;
	return(nooftickets*getPrice());
}
}

public class ticket {

	public static void main(String[] args) {
		int b,at,ti,pri,nt;
Tickets t= new Tickets();
	System.out.println("enter no of bookings");
	Scanner sca=new Scanner (System.in);
	b=sca.nextInt();
	System.out.println("enter available tickets");
	t.availableTickets=sca.nextInt();
	for(int i=0;i<b;i++)
	{
	System.out.println("enter ticket id");
	int tick=sca.nextInt();
	t.setTicketid(tick);
	System.out.println("enter ticket price");
	pri=sca.nextInt();
	t.setPrice(pri);
	System.out.println("enter number of ticket ");
	nt=sca.nextInt();
	System.out.println("available Tickets"+t.getAvailableTickets());
	
	System.out.println("amount"+t.calculateTicketCost(nt));
	System.out.println("available tickets after booking"+t.getAvailableTickets());
	
	
	

	

	}

}}
