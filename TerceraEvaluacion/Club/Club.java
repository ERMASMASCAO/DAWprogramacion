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
    ArrayList <Membership> members = new ArrayList <> ();

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership members)
    {
        
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    /**
     * Determinar el número de miembros que se han unido en el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido ese mes
     */
    public int joinedInMonth (int month){
        
        return month;
    }
    public void purge(int month){
               
        Iterator <Membership> memb = members.iterator();
        while(memb.hasNext()) {
            Membership members = memb.next();
            if(memb.equals(month)) {
                memb.remove();
            }
        }
    }
}
