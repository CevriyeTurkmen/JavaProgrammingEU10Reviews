package week19_01_14_2023.anilmals;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }

    public void hunt(){
        System.out.println("Bird is hunting insect");
    }



}
