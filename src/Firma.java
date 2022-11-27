public class Firma extends Klient{
    String nip, beniefity;
    int ilosc_obslugiwanych_osob, znizka_procent;


    public Firma(){
        super();
        nip = "0000000000";
        ilosc_obslugiwanych_osob = 0;
        znizka_procent = 0;
        beniefity = "";
    }

    public Firma(String name, String second_name, String bitrhdate, String id_klienta, String start_umowy, String rodzaj_umowy, int cena, String nip, int ilosc_obslugiwanych_osob, int znizka_procent, String beniefity) {
        super(name, second_name, bitrhdate, id_klienta, start_umowy, rodzaj_umowy, cena);
        this.nip = nip;
        this.ilosc_obslugiwanych_osob = ilosc_obslugiwanych_osob;
        this.znizka_procent = znizka_procent;
        this.beniefity = beniefity;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBeniefity() {
        return beniefity;
    }

    public void setBeniefity(String beniefity) {
        this.beniefity = beniefity;
    }

    public int getIlosc_obslugiwanych_osob() {
        return ilosc_obslugiwanych_osob;
    }

    public void setIlosc_obslugiwanych_osob(int ilosc_obslugiwanych_osob) {
        this.ilosc_obslugiwanych_osob = ilosc_obslugiwanych_osob;
    }

    public int getZnizka_procent() {
        return znizka_procent;
    }

    public void setZnizka_procent(int znizka_procent) {
        this.znizka_procent = znizka_procent;
    }

    @Override
    public String getStart_umowy() {
        return super.getStart_umowy();
    }

    @Override
    public String getRodzaj_umowy() {
        return super.getRodzaj_umowy();
    }

    @Override
    public String getId_klienta() {
        return super.getId_klienta();
    }

    @Override
    public int getCena() {
        return super.getCena();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getBitrhdate() {
        return super.getBitrhdate();
    }

    @Override
    public String toString() {
        return "Firma{" +
                "name='" + getName() + '\'' +
                ", second_name='" + getSecond_name() + '\'' +
                ", bitrhdate='" + getBitrhdate() + '\'' +
                "start_umowy='" + getStart_umowy() + '\'' +
                ", rodzaj_umowy='" + getRodzaj_umowy() + '\'' +
                ", id_klienta='" + getId_klienta() + '\'' +
                ", cena=" + getCena() +
                "nip='" + nip + '\'' +
                ", beniefity='" + beniefity + '\'' +
                ", ilosc_obslugiwanych_osob=" + ilosc_obslugiwanych_osob +
                ", znizka_procent=" + znizka_procent +
                '}';
    }
}
