package BaiTapVeNha04;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 1000000000; i++) {
            KiemTra(i);
        }
    }


    public static void KiemTra(int a) {
        //Kiểm tra số thuận nghịch
        int term = a;
        int d = 0;
        while (term > 0) {
            d = (d * 10) + term % 10;
            term = term / 10;
        }
        if (a == d) {
            //Kiểm tra số 0 6 8
            term = a;
            while (term > 0) {
                d = term % 10;
                if (d == 0 || d == 6 || d == 8) {
                    term = term / 10;
                } else {
                    return;
                }
            }

            //Kiểm tra tổng chia hết cho 10
            term = a;
            int S = 0;
            while (term > 0) {
                S = S + term % 10;
                term = term / 10;
            }
            if (S % 10 == 0) {
                System.out.println(a);
            }
        }
    }
}
