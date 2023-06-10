public class Hogwarts {
    private String fullName;
    private int magicPower;

    private int transgressionDistance;

    public Hogwarts(String fullName, int magicPower, int transgressionDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public static void printSeparator() {
        System.out.println("====================");
    }
    public static void comparisonOfStudentAbilities(Gryffindor[] gryffindor, Slytherin[] slytherin) {
        if (gryffindor[0].getMagicPower() + gryffindor[0].getTransgressionDistance() > slytherin[0].getMagicPower() + slytherin[0].getTransgressionDistance()) {
            System.out.println("Лучший по силе магии и трансгрессии " + gryffindor[0]);
        } else {
            System.out.println("Лучший по силе магии и трансгрессии " + slytherin[0]);
        }
    }
}
