package Generics;

public class Info <T> {
    /*
    <T> - это placeholder, который временно заполняет место, в которое потом будет указан тип
    * */

    private T value; //не может быть статичной
    public Info(T value){
        this.value =value;
    }
    public String toString(){
        return "{["+value+"]}";
    }
}
