package cycle;

public class Practice9 {

    public static void main(String[] args) {
        while (true) {
            System.out.println("This is an infinite while loop");
        }

        do {
            System.out.println("This is an infinite  do-while loop.");
        } while (true);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; //Aborts the loop when i = 5
            }
            System.out.println("i: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skips the current iteration when i = 5
            }
            System.out.println("i: " + i);
        }


    }

}
