import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ 1: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 3: ");
        int c = scanner.nextInt();


        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println("Số nguyên lớn nhất là: " + max);
        System.out.println("Số nguyên nhỏ nhất là: " + min);
    }
}
