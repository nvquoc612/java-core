package codelearn.SoHoc;

public class isPrime {
//    //    int a,b;
//    public static int twoNumber(int a, int b) {
//        return a + b;
//    }

    static boolean checkSoNguyenTo(int n) {
        if (n <= 1) {
            System.out.println("Đây không phải là số nguyên tố");
            return false;
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkSoNguyenTo(47));
    }
}
