import java.util.Scanner;

public class drive {
    public int panjang, lebar, tinggi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        balok hasil = new balok();

        System.out.print("Input Panajang : ");
        hasil.setPanjang(input.nextInt());
        
        System.out.print("Input Tinggi : ");
        hasil.setTinggi(input.nextInt());

        System.out.print("Input Lebar : ");
        hasil.setLebar(input.nextInt());

        hasil.hasil();
    }
}
