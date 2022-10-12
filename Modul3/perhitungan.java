public class perhitungan {
    // void perhitungan(){
    //     int panjang = sisi.getPanjang();
    //     int lebar = sisi.getLebar();
    //     int tinggi = sisi.getTinggi();
    //     luas = panjang * lebar * tinggi;

    //     int panjangV = sisi.getPanjang();
    //     int lebarV = sisi.getLebar();
    //     int tinggiV = sisi.getTinggi();
    //     volume = 4 * panjangV * lebarV * tinggiV;
    // }

    public int luas(balok sisi){
        return (2 * (sisi.getPanjang() * sisi.getLebar()) + (sisi.getLebar() * sisi.getTinggi()) + (sisi.getPanjang() * sisi.getTinggi()));
    }

    public int volume(balok sisi){
        return sisi.getPanjang() * sisi.getTinggi() * sisi.getLebar();
    }

}
