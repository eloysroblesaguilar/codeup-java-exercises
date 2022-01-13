package groceries;

public class Foodstuff {
    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Foodstuff(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Foodstuff() {
    }
}
