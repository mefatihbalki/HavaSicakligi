import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
//Kullanıcı Girişi
        Scanner input =new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz: ");
        heat = input.nextInt();
//Sıcaklığın Durumuna Göre Kullanıcıya Verilen Talimatlar
        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if (heat >=5 && heat< 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if (heat>=15 && heat<25){
            System.out.println("Piknik Yapabilirsiniz.");
        }else if (heat>=25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
//Program Bitişi
        }
    }
}