/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class ClockDisplay //clase publica con 3 atributos privados
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private NumberDisplay seconds;

    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay() // Es el constructor en el cual se le da valor a los atributos de ClockDisplay
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int second) //Es un constructor donde le das 2 argumento a los cuales luego creas el number display que son las hora que eso es cuando te refieres a la otra clase y en setTime le dices las horas y los minutos.
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute,second);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick() //Es un metodo que no devuelve nada, coge minutos con un limite de 60 y  si por ejemplo minutos vale 13 pasará a valer 14 y si vale 59 pasará a valer 0 e incrementara las horas 1.
    {
        seconds.increment();
        if (seconds.getValue()== 0){
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
    }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute,int second) //Es un metodo void que no devuelve nada y estas llamando a un objeto de otra clase
    {   
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime() 
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay() // Esta modificando el atributo de displayString al valor de la hora mas los minutos ejemplo --> 10:32
    {
        displayString = hours.getDisplayValue() + ":" + ":" +
                        minutes.getDisplayValue() + ":" + ":" +
                        seconds.getDisplayValue();
    }
}