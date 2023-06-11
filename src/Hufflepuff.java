public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй: " + "ФИО - " + super.getFullName() + ", магическая сила - " + super.getMagicPower() + ", расстояние трансгрессии - " + super.getTransgressionDistance() + ", трудолюбие - " + diligence + ", верность - " + loyalty + ", честность - " + honesty;
    }

    public static void printAllStudents(Hufflepuff[] hufflepuffs) {
        System.out.println("Список учеников Пуффендуй");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("ФИО " + hufflepuff.getFullName() + ", магическая сила " + hufflepuff.getMagicPower() + ", расстояние трансгрессии " + hufflepuff.getTransgressionDistance() + ", трудолюбие - " + hufflepuff.getDiligence() + ", верность - " + hufflepuff.getLoyalty() + ", честность - " + hufflepuff.getHonesty());
        }
    }
    public static void findBestHufflepuff(Hufflepuff hufflepuff, Hufflepuff hufflepuff1) {
        if (hufflepuff.getDiligence() + hufflepuff.getLoyalty() + hufflepuff.getHonesty() < hufflepuff1.getDiligence() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty()) {
            System.out.println("Лучший " + hufflepuff1);
        } else if (hufflepuff.getDiligence() + hufflepuff.getLoyalty() + hufflepuff.getHonesty() > hufflepuff1.getDiligence() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty()) {
            System.out.println("Лучший " + hufflepuff);
        } else {
            System.out.println("Ученики равны");
        }
    }
}
