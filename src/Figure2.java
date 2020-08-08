public class Figure2 {
    public static void main(String[] args) {
        int height = 7;

        for (int i = height / 2; i >= 0; i--) {
            for (int j = height; j >= 0; j--) {
                if (j < i || j > height - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= height / 2; i++) {
            for (int j = 0; j <= height; j++) {
                if (j < i || j > height - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
