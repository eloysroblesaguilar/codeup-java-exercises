public class Penguin {

    private String name;
    private int weight;
    private String species;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static boolean canFly() {
        return false;
    }

    public static boolean isEvil() {
        return true;
    }



    public Penguin() {
    }

    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String toString() {
        return String.format("{%nname: %s,%nweight: %d,%nsepcies: %s,%nsex: %s%n}", name, weight, species, sex);
    }

    public static void main(String[] args) {

        Penguin felicia = new Penguin("Felicia", 6, "Southern Rockhopper Penguin", 'F');

        System.out.println(felicia);
    }
}
