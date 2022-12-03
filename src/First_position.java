import java.util.Random;

public class First_position {

    public static void main(String[] args) {
        System.out.println("single player at start\r\n"
                + "position 0");
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1);
        System.out.println("Starting position of die is\r"+rand_int1);

    }
}
