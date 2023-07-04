//Joe Brown is awesome 
import java.util.*;
public class FantasyDraft
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      boolean x = true;
      
      int coachNum = 0;
      
      while(x)
      {
         System.out.println("Welcome to the York Dukes Fantasy Draft Order Lottery!");
         System.out.println("Would you like to ");
         System.out.println("1.) Add coachs");
         System.out.println("2.) Select a draft order");
         System.out.println("3.) Exit menu");
         int input = kbd.nextInt();
         
         if(input == 1)
         {
            addCoachs();
            coachNum++;
         }
         
         else if(input == 2)
         {
            draftSelection(coachNum);
         }
         
         else
            x = false;
      }
   }
   
   public static void draftSelection(int numOfCoachs)
   {
      ArrayList<String> thisDraftTicketList = new ArrayList<String>();
         
         for(String temp : Coachs.getTicketList())
         {
            thisDraftTicketList.add(temp);
         }
         System.out.println("And the Draft Order for the 2022 Fantasy Season is");
         for(int i=0; i<numOfCoachs; i++)
         {
            int randSelection = (int)(Math.random()*thisDraftTicketList.size());
            
            System.out.println((i+1)+".) "+thisDraftTicketList.get(randSelection));
            
            thisDraftTicketList = ticketWipe(thisDraftTicketList, thisDraftTicketList.get(randSelection));
         }
   }
   
   public static ArrayList<String> ticketWipe(ArrayList<String> initialList, String name)
   {
      ArrayList<String> finalList = new ArrayList<String>();
      
      for(String temp : initialList)
      {
         if(!(temp.equals(name)))
         {
            finalList.add(temp);
         }
      }  
      
      return finalList;
   }
   
   public static void addCoachs()
   {
      Scanner kbd = new Scanner(System.in);
      System.out.println("Coach Name: ");
      String coachName = kbd.next();
      System.out.println("Number of Bids: ");
      int bids = kbd.nextInt();
      new Coachs(coachName, bids);
      
      System.out.println("New coach added");
   }
}