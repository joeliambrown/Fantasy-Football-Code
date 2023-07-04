import java.util.*;
public class Coachs
{
   private String coachName;
   private int coachBids;
   private static ArrayList<String> ticketList = new ArrayList<String>();
   
   public Coachs(String newCoachName, int newCoachBids)
   {
      coachName = newCoachName;
      coachBids = newCoachBids;
      
      for(int i=0; i<coachBids; i++)
      {
         ticketList.add(coachName);
      }
   }
   
   public int getCoachBids()
   {
      return coachBids;
   }
   
   public String getCoachName()
   {
      return coachName;
   }
   
   public static ArrayList<String> getTicketList()
   {
      return ticketList;
   }
   
   public void setTicketList(ArrayList<String> newTicketList)
   {
      ticketList = newTicketList;
   }
}