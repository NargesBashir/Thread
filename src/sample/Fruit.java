package sample;

//superklasse

public class Fruit {
    public void grow (int hastighed){
        System.out.println("Frugten gror med en hastighed på"+hastighed+"cm om dagen");
    }
    public void die(String type){
        System.out.println(type+"er død");
    }
}
