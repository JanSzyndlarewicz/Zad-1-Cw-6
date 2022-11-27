package Osoba;

import java.util.PrimitiveIterator;

public class Prywatny extends Klient{
    int znizka_lojalnosciowa;
    boolean czy_blok;

    public Prywatny(){
        super();
        znizka_lojalnosciowa = 0;
        czy_blok = false;
    }

    public Prywatny(String name, String second_name, String bitrhdate, String id_klienta, String start_umowy, String rodzaj_umowy, int cena, int znizka_lojalnosciowa, boolean czy_blok) {
        super(name, second_name, bitrhdate, id_klienta, start_umowy, rodzaj_umowy, cena);
        this.znizka_lojalnosciowa = znizka_lojalnosciowa;
        this.czy_blok = czy_blok;
    }

    public int getZnizka_lojalnosciowa() {
        return znizka_lojalnosciowa;
    }

    public void setZnizka_lojalnosciowa(int znizka_lojalnosciowa) {
        this.znizka_lojalnosciowa = znizka_lojalnosciowa;
    }

    public boolean isCzy_blok() {
        return czy_blok;
    }

    public void setCzy_blok(boolean czy_blok) {
        this.czy_blok = czy_blok;
    }


    @Override
    public String toString() {
        return "Prywatny {" +
                "name='" + getName() + '\'' +
                ", second_name='" + getSecond_name() + '\'' +
                ", bitrhdate='" + getBitrhdate() + '\'' +
                "start_umowy='" + getStart_umowy() + '\'' +
                ", rodzaj_umowy='" + getRodzaj_umowy() + '\'' +
                ", id_klienta='" + getId_klienta() + '\'' +
                ", cena=" + getCena() +
                "znizka_lojalnosciowa=" + znizka_lojalnosciowa +
                ", czy_blok=" + czy_blok +
                '}';
    }
}
