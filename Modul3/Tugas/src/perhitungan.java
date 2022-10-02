public class perhitungan{
    void perhitungan(){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
    }

    int luas(){
        return panjang * lebar * tinggi;
    }

    int volume(){
        return 4 * panjang * lebar * tinggi;
    }
}