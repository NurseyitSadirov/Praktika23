public class Bank {



    private String bank;
    private int id;
    private int summa;

    public Bank(String bank, int id, int summa) {
        this.bank = bank;
        this.id = id;
        this.summa = summa;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bank='" + bank + '\'' +
                ", id=" + id +
                ", summa=" + summa +
                '}';
    }
}
