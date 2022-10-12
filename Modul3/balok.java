public class balok {
    public int tinggi, lebar, panjang;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    protected void hasil(){
        perhitungan ph = new perhitungan();
        System.out.println("Hasil luas balok : "+ph.luas(this));
        System.out.println("Hasil volume balok : "+ph.volume(this));
    }
}
