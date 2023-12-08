public class Museum {
    private String name;
    private int entryFee;

    public Museum(String name, int entryFee) {
        this.name = name;
        this.entryFee = entryFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "name='" + name + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
