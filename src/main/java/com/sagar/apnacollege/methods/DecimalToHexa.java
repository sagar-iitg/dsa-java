package methods;

public class DecimalToHexa {

    public static void main(String[] args) {
        int n = 10012;
        solve(n);
        System.out.println(Integer.toHexString(n));
    }

    static void solve(int n) {

        char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hex_no = "";
        while (n > 0) {

            int rem = n % 16;
            hex_no = hexChar[rem] + hex_no;
            n = n / 16;
        }
        System.out.println(hex_no);

    }

}
