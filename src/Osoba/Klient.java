package Osoba;

public abstract class Klient extends Osoba {
    private String start_umowy, rodzaj_umowy, id_klienta;
    private int cena;

    public Klient(){
        super();
        id_klienta = "000000";
        start_umowy = "01.01.2000";
        rodzaj_umowy = "basic";
        cena = 0;
    }

    public Klient(String name, String second_name, String bitrhdate, String id_klienta, String start_umowy, String rodzaj_umowy, int cena) {
        super(name, second_name, bitrhdate);
        this.id_klienta = id_klienta;
        this.start_umowy = start_umowy;
        this.rodzaj_umowy = rodzaj_umowy;
        this.cena = cena;
    }

    public String getStart_umowy() {
        return start_umowy;
    }

    public void setStart_umowy(String start_umowy) {
        this.start_umowy = start_umowy;
    }

    public String getRodzaj_umowy() {
        return rodzaj_umowy;
    }

    public void setRodzaj_umowy(String rodzaj_umowy) {
        this.rodzaj_umowy = rodzaj_umowy;
    }

    public String getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(String id_klienta) {
        this.id_klienta = id_klienta;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Osoba.Osoba.Klient{" +
                "name='" + getName() + '\'' +
                ", second_name='" + getSecond_name() + '\'' +
                ", bitrhdate='" + getBitrhdate() + '\'' +
                "start_umowy='" + start_umowy + '\'' +
                ", rodzaj_umowy='" + rodzaj_umowy + '\'' +
                ", id_klienta='" + id_klienta + '\'' +
                ", cena=" + cena +
                '}';
    }
}
