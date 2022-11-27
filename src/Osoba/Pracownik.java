package Osoba;

import Zadanie.Zadanie;

import java.util.Arrays;

public class Pracownik extends Osoba {
    private String stanowisko;
    private Zadanie[] task;

    public Pracownik(){
        super();
        stanowisko = "";
        task = null;
    }

    public Pracownik(String name, String second_name, String bitrhdate, String stanowisko, Zadanie[] task) {
        super(name, second_name, bitrhdate);
        this.stanowisko = stanowisko;
        this.task = task;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Zadanie[] getTask() {
        return task;
    }

    public void setTask(Zadanie[] task) {
        this.task = task;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSecond_name() {
        return super.getSecond_name();
    }

    @Override
    public String getBitrhdate() {
        return super.getBitrhdate();
    }

    @Override
    public String toString() {
        return "Osoba.Osoba.Pracownik{" +
                "name='" + getName() + '\'' +
                ", second_name='" + getSecond_name() + '\'' +
                ", bitrhdate='" + getBitrhdate() + '\'' +
                "stanowisko='" + stanowisko + '\'' +
                ", task=" + Arrays.toString(task) +
                '}';
    }
}
