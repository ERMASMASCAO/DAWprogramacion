/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the limit.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class NumberDisplay
{
    private int limit;  //Son 2 atributos de objetos por que no tienen la palabra Static.
    private int value;

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplay(int rollOverLimit) // es un constructor y devuelve los objetos de la clase NumberDisplay y recibe un argumento (int) entero.
    {
        limit = rollOverLimit;
        value = 0;
    }

    /**
     * Return the current value.
     */
    public int getValue() //Es un metodo que devuelve un entero (int) y es un getter por que devuelve un valor.
    {
        return value;
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    public String getDisplayValue() //Es un getter y no es Static por que es un metodo de objeto
    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }

    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValue(int replacementValue) //set recibe un entero que va mirando que si esta dentro del limite lo pasa a value
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void increment() //Es un metodo que no te devuelve nada e incrementa el valor de value en 1 y por ejemplo si value vale 59 y se aumenta 1 seria 6 y la siguiente vez valdria 0 para que no se pase de ese rango.
    {
        value = (value + 1) % limit;
    }
}