public abstract class Hogwarts {
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

    @Override
    public String toString() {
        return "Hogwarts{" + "fullName='" + fullName + '\'' + ", magicPower=" + magicPower + ", transgressionDistance=" + transgressionDistance + '}';
    }

    public static void printSeparator() {
        System.out.println("====================");
    }
    public static void comparisonOfStudentAbilities(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() + student1.getTransgressionDistance() > student2.getMagicPower() + student2.getTransgressionDistance()) {
            System.out.println("Лучший по силе магии и трансгрессии " + student1);
        } else {
            System.out.println("Лучший по силе магии и трансгрессии " + student2);
        }
    }
}
