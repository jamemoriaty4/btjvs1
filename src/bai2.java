import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp vào chiều dài: ");
        int chieudai = sc.nextInt();
        System.out.println("nhập vào chiều rộng: ");
        int chieurong = sc.nextInt();

        while(chieurong>chieudai){
            System.out.println("nhập lại số liệu! ");
            System.out.println("nhâp vào chiều dài: ");
             chieudai = sc.nextInt();
            System.out.println("nhập vào chiều rộng: ");
            chieurong = sc.nextInt();
        }
        int chuvi = (chieudai+ chieurong)*2;
        int dientich = chieudai*chieurong;
        System.out.println("chu vi hcn là : "+ chuvi);
        System.out.println("diện tích hcn là : "+dientich);
    }
}
