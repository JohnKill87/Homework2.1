public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин: " + "ФИО - " + super.getFullName() + ", магическая сила - " + super.getMagicPower() + ", расстояние трансгрессии - " + super.getTransgressionDistance() + ", хитрость - " + cunning + ", Решительность - " + determination + ", амбициозность - " + ambition + ", находчивость - " + resourcefulness + ", жажда власти - " + lustForPower;
    }

    public static void printAllStudents(Slytherin[] slytherins) {
        System.out.println("Список учеников Слизерина");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("ФИО " + slytherin.getFullName() + ", магическая сила " + slytherin.getMagicPower() + ", расстояние трансгрессии " + slytherin.getTransgressionDistance() + ", хитрость - " + slytherin.getCunning() + ", Решительность - " + slytherin.getDetermination() + ", амбициозность - " + slytherin.getAmbition() + ", находчивость - " + slytherin.getResourcefulness() + ", жажда власти - " + slytherin.getLustForPower());
        }
    }
    public static void findBestSlytherin(Slytherin slytherin, Slytherin slytherin1) {
        if (slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() < slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower()) {
            System.out.println("Лучший " + slytherin1);
        } else if (slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() > slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower()) {
            System.out.println("Лучший " + slytherin);
        } else {
            System.out.println("Ученики равны");
        }
    }
}
