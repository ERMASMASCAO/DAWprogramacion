import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList <Membership> members; 
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    public int joinedIntMonth (int month){
       int resultado = 0;

       if (month < 1 || month > 12) {
           System.out.println("JoinedInMonth - Mes incorrecto");
       }else{
       
       for (Membership item : members) {
           if (item.getMonth() == month) {
               resultado++;
           }
       }
    }
        return month;
    }


    public void purgue (int month){
        Iterator <Membership> it = members.iterator();
        while(it.hasNext()) {
            Membership member = it.next();
            if(member.getMonth() == month) {
                it.remove();
        }
    }
    }
}


