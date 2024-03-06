import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();
        int tuoi = 2023 - namSinh;
        boolean laSoChan = tuoi % 2 == 0;

        System.out.println("Tuổi của bạn là: " + tuoi);
        System.out.println("Tuổi của bạn là " + (laSoChan ? "số chẵn" : "số lẻ"));
    }
}

