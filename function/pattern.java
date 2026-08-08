public class pattern {
    public static void hollow_rectan(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // inverted pyramid

    public static void inverted_py(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // for space
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // for stars
            }
            System.out.println();
        }
    }

    // inverted number pyramid

    public static void num_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTri(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public static void zero_1triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow_rectan(4, 05);
        // inverted_py(5);

        // num_pyramid(5);
        // floydsTri(5);

        // zero_1triangle(5);
        // butterfly(8);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(5);
    }

}
