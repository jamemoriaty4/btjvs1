import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán :");
        float DT = sc.nextFloat();
        System.out.println("nhập điểm văn :");
        float Dv = sc.nextFloat();
        System.out.println("nhập điểm anh :");
        float Da = sc.nextFloat();
        float DTB = (Da+DT+Dv)/3;
        float tongDiem = Da+DT+Dv;
        System.out.println("điểm tb : %.2f"+DTB);
        System.out.println("tổng điểm : %.2f"+tongDiem);


    }
}
