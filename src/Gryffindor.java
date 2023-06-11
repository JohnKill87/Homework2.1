import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int magicPower, int transgressionDistance, int nobleness, int honor, int bravery) {
        super(fullName, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
        @Override
    public String toString() {
        return "Гриффиндор: " + "ФИО - " + super.getFullName() + ", магическая сила - " + super.getMagicPower() + ", расстояние трансгрессии - " + super.getTransgressionDistance() + ", благородство - " + nobleness + ", честь - " + honor + ", храбрость - " + bravery;
    }
    public static void printAllStudents(Gryffindor[] gryffindors) {
        System.out.println("Список учеников Гриффиндора");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("ФИО: " + gryffindor.getFullName() + ", магическая сила - " + gryffindor.getMagicPower() + ", расстояние трансгрессии - " + gryffindor.getTransgressionDistance() + ", благородство - " + gryffindor.getNobleness() + ", честь - " + gryffindor.getHonor() + ", храбрость - " + gryffindor.getBravery());
        }
    }
    public static void findBestGryffindor(Gryffindor gryffindor, Gryffindor gryffindor1) {
        if (gryffindor.getNobleness() + gryffindor.getHonor() + gryffindor.getBravery() < gryffindor1.getNobleness() + gryffindor1.getHonor() + gryffindor1.getBravery()) {
            System.out.println("Лучший " + gryffindor1);
        } else if (gryffindor.getNobleness() + gryffindor.getHonor() + gryffindor.getBravery() > gryffindor1.getNobleness() + gryffindor1.getHonor() + gryffindor1.getBravery()) {
            System.out.println("Лучший " + gryffindor);
        } else {
            System.out.println("Ученики равны");
        }
    }
}
