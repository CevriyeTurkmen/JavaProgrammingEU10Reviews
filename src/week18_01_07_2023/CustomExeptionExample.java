package week18_01_07_2023;

public class CustomExeptionExample {

    public static void main(String[] args) {
        //ArithmeticException
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            //  throw new CustomArithmeticException();
            throw new CustomArithmeticException("you have an error");
        }
    }

}
