public class Zadanie {
    private int priorytet, budget;
    private String opis, deadline;

    public Zadanie(){
        priorytet = 0;
        budget = 0;
        opis = "";
        deadline = "";
    }

    public Zadanie(int priorytet, int budget, String opis, String deadline) {
        if(priorytet>=0 && priorytet<=10){
            this.priorytet = priorytet;
        }
        else{
            this.priorytet = 0;
        }

        this.budget = budget;
        this.opis = opis;
        this.deadline = deadline;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "priorytet=" + priorytet +
                ", budget=" + budget +
                ", opis='" + opis + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
