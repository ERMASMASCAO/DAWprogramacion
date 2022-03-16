public abstract class Stat {
    
    //Atribute
    private int value;

    //Constructor

    public  Stat (int value){
        this.value = value;
    }
    //Devuelve el valor actual de las características
    public int getValue(){
        return value;
    }
    //Incrementa en 1 el valor de las características
    public void increase(){
        value++;
    }
    //Decrementa en 1 el valor de las características
    public void decremented(){
        value--;
    }
    //Devuelve el nombre simple de la clase
    public String toString(){
       return getClass().getName();
    }
}
