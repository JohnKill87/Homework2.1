public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String fullName, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wittiness, int creativity) {
        super(fullName, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран: " + "ФИО - " +super.getFullName() + ", магическая сила - " + super.getMagicPower() + ", расстояние трансгрессии - " + super.getTransgressionDistance() + ", ум - " + intelligence + ", мудрость - " + wisdom + ", остроумие - " + wittiness + ", творчество - " + creativity;
    }

    public static void printAllStudents(Ravenclaw[] ravenclaws) {
        System.out.println("Список учеников Когтеврана");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("ФИО " + ravenclaw.getFullName() + ", магическая сила " + ravenclaw.getMagicPower() + ", расстояние трансгрессии " + ravenclaw.getTransgressionDistance() + ", ум - " + ravenclaw.getIntelligence() + ", мудрость - " + ravenclaw.getWisdom() + ", остроумие - " + ravenclaw.getWittiness() + ", творчество - " + ravenclaw.getCreativity());
        }
    }
    public static void findBestRavenclaw(Ravenclaw ravenclaw, Ravenclaw ravenclaw1) {
        if (ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWittiness() + ravenclaw.getCreativity() < ravenclaw1.getIntelligence() + ravenclaw1.getWisdom() + ravenclaw1.getWittiness() + ravenclaw1.getCreativity()) {
            System.out.println("Лучший " + ravenclaw1);
        } else if (ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWittiness() + ravenclaw.getCreativity() > ravenclaw1.getIntelligence() + ravenclaw1.getWisdom() + ravenclaw1.getWittiness() + ravenclaw1.getCreativity()) {
            System.out.println("Лучший " + ravenclaw);
        } else {
            System.out.println("Ученики равны");
        }
    }
}
