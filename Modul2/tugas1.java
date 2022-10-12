import java.util.NoSuchElementException;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean isLengthMatch = false, isFormatMatch = false, isEmailStatus = false, isTlpStatus = false;
        int isEmailLength;
        String nim = "", email = "", nama, tlp;
        System.out.print("Masukan Nama : ");
        nama = input.next();
        do {
            System.out.print("Masukan No.Telpon : ");
            tlp = input.next();
            if(tlp.matches("[0-9]*"))
                isTlpStatus = true;

            System.out.print("Masukan Email : ");
            email = input.next();
            isEmailLength = email.length();
            if(isEmailLength <= 18){
                System.out.println("Email Harus Menggunakan `@webmail.umm.ac.id`");
            }
            else if(!(((email.indexOf("@webmail.umm.ac.id")) == (isEmailLength - 18)))){
                System.out.println("Email Harus Menggunakan `@webmail.umm.ac.id`");
            }
            else{
                isEmailStatus = true;
            }
        }
        while(!(isEmailStatus && isTlpStatus));

        do {
            try {
                System.out.print("Masukan Nim : ");
                nim = input.next();
                if(!(nim.length() == 15))
                    throw new LengthCodeException();
                isLengthMatch = (nim.length() == 15) ? true : false;

                if(!(nim.indexOf("10370311") == 4))
                    throw new FormatCodeException();
                isFormatMatch = (nim.indexOf("10370311") == 4) ? true : false;
            } 
            catch (FormatCodeException e) {
                System.out.println(e);
            }
            catch (LengthCodeException e) {
                System.out.println(e);
            }
            catch (NoSuchElementException e) {
                System.out.println("The code can not be empty");
            }
        } 
        while(!(isLengthMatch && isFormatMatch));
        System.out.println("\nData Berhasil Ditambahkan : \nNIM Mahasiswa : "+nim+"\nNama Mahasiswa : "+nama+"\nNo Telpon : "+tlp+"\nEmail : "+email);
    }
}