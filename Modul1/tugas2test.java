import java.util.Scanner;

import FormatCodeException;
import LengthCodeException;
public class tugas2test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Boolean isLengthMatch = false, isFormatMatch = false;
        String code = "";
        do {
            try {
                System.out.print("Masukan Kode : ");
                code = input.next();
                if(!(code.length() == 15))
                    throw new LengthCodeException();
                isLengthMatch = (code.length() == 15) ? true : false;

                if(!(code.indexOf("10370311") == 4))
                    throw new FormatCodeException();
                isFormatMatch = (code.indexOf("10370311") == 4) ? true : false;
            } 
            catch (FormatCodeException e) {
                System.out.println(e);
            }
            catch (LengthCodeException e) {
                System.out.println(e);
            }
            catch (ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
        } 
        while(!(isLengthMatch && isFormatMatch));
        System.out.println("Nim Anda '"+code+"' Telah Berhasil Ditambah");
    }
}
