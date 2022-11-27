package Osoba;

public abstract class Osoba {
    private String name, second_name, bitrhdate;

    public Osoba(){
        name = "";
        second_name = "";
        bitrhdate = "01.01.1900";
    }

    public Osoba(String name, String second_name, String bitrhdate) {
        this.name = name;
        this.second_name = second_name;
        this.bitrhdate = bitrhdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getBitrhdate() {
        return bitrhdate;
    }

    public void setBitrhdate(String bitrhdate) {
        this.bitrhdate = bitrhdate;
    }

    @Override
    public String toString() {
        return "Osoba.Osoba{" +
                "name='" + name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", bitrhdate='" + bitrhdate + '\'' +
                '}';
    }
}
