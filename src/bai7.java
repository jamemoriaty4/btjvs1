import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhapaj số ngueyen: ");
        int k = sc.nextInt();

        int sum = 0;// tổng các chữ số
        while(k>0){
            sum+= k%10;
            k /=10;
        }

        int i = 0;
        while(k>0){
            i = i*10+k%10;
            k /=10;
        }

        System.out.println("tổng các chữ số là "+sum);
        System.out.println("số nghịc đảo la "+ i);

    }
}
