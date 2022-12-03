import java.util.Random;

public class PlayerPosition {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6);
        System.out.println("position of die is\r"+rand_int1);
        switch (rand_int1) {
            case 0:
                System.out.println("Die Can not move");
                break;
            case 1:
                System.out.println("Die Can move "+rand_int1+"Time");
                break;
            case 2:
                System.out.println("Die move"+rand_int1+"Time");
                break;
            case 3:
                System.out.println("Die move"+rand_int1+"Time");
                break;
            case 4:
                System.out.println("Die move"+rand_int1+"Time");
                break;
            case 5:
                System.out.println("Die move"+rand_int1+"Time");
                break;
            case 6:
                System.out.println("Die move"+rand_int1+"Time");
                break;
            case 7:
                System.out.println("Die move"+rand_int1+"Time");
                break;
        }
    }

}
