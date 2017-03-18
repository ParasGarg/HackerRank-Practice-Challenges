class Solution {
    public static boolean flag = false;
    public static int  B;
    public static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        
        try {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception ex) {
            System.out.print(ex.getClass().getName() + " Breadth and height must be positive");
        }
    }
}