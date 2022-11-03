package BaiTapVeNha04;

public class Bai18 {
    public static void main(String[] args) {
        System.out.print("Các số thuận nghịch có 6 chữ số và tổng các chữ số chia hết cho 10 là: ");
        for (int i = 100000; i < 1000000; i++) {
            SoThuanNgich(i);
        }
    }

    public static void SoThuanNgich(int n) {
        int term = n;
        int d = 0;
        while (term > 0) {

            d = (d * 10) + term%10;
            term = term/10;
        }
        if (n == d) {
            term = n;
            int S = 0;
            while (term > 0) {
                int b = term % 10;
                S += b;
                term = term / 10;
            }
            if (S % 10 == 0) {
                System.out.print(n + " ");
            }
        }
    }

}
