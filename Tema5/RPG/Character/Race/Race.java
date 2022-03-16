package Character.Race;
import Character.Stat;


public abstract class Race {
    
    //Devuelve el modificador de la profesion según el stat.
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase.
    public boolean equals(Object object){
        return getClass().getName().equals(object.getClass().getName());
    }
    //Devuelve el nombre simple de la clase.
    public String toString (){
        return getClass().getName();
    }
}
