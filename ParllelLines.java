public class ParllelLines {
    public static void main(String args[]) {
        int i, n = 5;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == n-1 )
                    System.out.print("* ");
                else
                    System.out.print("  	 ");
            }
            System.out.println();
        }
    }
}