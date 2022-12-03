import java.util.Random;

public class Roll_Die {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6);
        System.out.println("position of die is\r"+rand_int1);

    }
}
