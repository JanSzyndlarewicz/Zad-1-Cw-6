public class Pracownik extends Osoba{
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

   public String toString(){
        String tmp = "";
        for(int i=0; i< task.length; i++){
            tmp += task[i].toString() + "; "
        }

       return "Imię: " + getName() + ", nazwisko: " + getSecond_name() + ", urodziny: " + getBitrhdate() + ", stanowisko: " + getStanowisko() + ", zadania: " + tmp;
   }
}
