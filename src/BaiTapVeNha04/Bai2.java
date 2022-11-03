package BaiTapVeNha04;

public class Bai2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            KiemTra(i);
        }
    }

    public static void KiemTra(int a) {
        // Kiểm tra số nguyên tố
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0){
                return;
            }
        }
        // Kiểm tra tất cả các chữ số là nguyên tố
        int term = a;
        while (term > 0) {
            int d = term % 10;
            for (int i = 2; i <= Math.sqrt(d); i++) {
                if (d % i == 0){
                    return;
                }
            }
            term = term / 10;
        }

        // Đảo của nó cũng là 1 số nguyên tố
        term = a;
        int d = 0;
        while (term > 0) {
            d = d + term %10;
            term = term / 10;
        }
        for (int i = 2; i <= Math.sqrt(d); i++) {
            if (d % i == 0){
                return;
            }
        }

        System.out.println(a);

    }
}
