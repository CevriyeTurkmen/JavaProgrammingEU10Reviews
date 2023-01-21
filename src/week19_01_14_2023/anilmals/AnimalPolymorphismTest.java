package week19_01_14_2023.anilmals;

public class AnimalPolymorphismTest {
    public static void main(String[] args) {

        Animal animal= new Bird();
        animal.move();
        animal=new Cow();
        animal.move();
        Animal animal1=new Bird();

        ((Bird) animal1).hunt();
    }
}
