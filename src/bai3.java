import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào bán kính");
        int r = sc.nextInt();
        double chuvi = 2 * r *3.14;
        double dientich = r*r*3.14;
        System.out.println("chu vi là "+chuvi);
        System.out.println("dien tich la: "+dientich );
    }
}
