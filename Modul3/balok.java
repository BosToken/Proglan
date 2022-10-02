public class balok{
    public int panjang, lebar, tinggi;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    protected void hasil(){
        perhitungan ph = new perhitungan();
        System.out.println("Hasil luas balok : " + ph.luas(this));
        System.out.println("Hasil volume balok : " + ph.volume(this));
    }
}