import java.util.Scanner;

public class tugas2 {

    // static void cekName(String name); 
    // void cekFrom(char from);
    // void cekDate(int date);
    // void list();
    public String book[][] =  new String[100][101];
    book[10][100] = "test";

    public String[][] place = new String[1][11];
    place[0][0] = "Malang"; place[0][1] = "Bandung"; place[0][2] = "Surabaya";

    public static void cekDate(int date){
        if(date < 2018 || date > 2022){

        }
    }

    public static void cekFrom(char from){
        for(int i = 0; place[i][0] != '\0'; i++){
            if(from.compareTo(place[i]) == 0){
                return i;
            }
        }
    }

    public static void cekName(String name){
        for(int i = 0; book[i][0] != '\0'; i++){
            if(name.compareTo(book[i]) == 0){
                return i;
            }
        }
    }

    public void list(){
        for(int i = 0; book[i][0] != '\0'; i++){
            System.out.println(book[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inName, inFrom;
        int inDate, inIndex;

        System.out.println("Welcome To Library");
        System.out.println("Nama : ");
        inName = input.nextLine();
        cekName(inName);
        System.out.println("From : ");
        inName = input.nextLine();
        cekFrom(inFrom);
        System.out.println("Date : ");
        inDate = input.nextInt();
        cekDate(inDate);
        System.out.println(inName+""+inFrom+""+inDate);
        book[1] = new String(name);
        System.out.println("Buku berhasil Ditambahkan");
    }
}
