public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 55, 55, 65, 50, 80),
                new Gryffindor("Гермиона Грейнджер", 75, 65, 70, 40, 50),
                new Gryffindor("Рон Уизли", 40, 50, 40, 50, 35),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария Смит", 65, 35, 55, 40, 60),
                new Hufflepuff("Седрик Диггори", 45, 55, 50, 70, 60),
                new Hufflepuff("Джастин Финч-Флетчли", 40, 60, 70, 35, 45),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 45, 75, 35, 50, 55, 60),
                new Ravenclaw("Падма Патил", 60, 50, 65, 45, 35, 80),
                new Ravenclaw("Маркус Белби", 70, 55, 65, 45, 65, 50),
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", 55, 45, 65, 80, 75, 50, 45),
                new Slytherin("Грэхэм Монтегю", 45, 55, 35, 45, 55, 70, 25),
                new Slytherin("Грегори Гойл", 40, 65, 45, 50, 30, 45, 30),
        };

        Gryffindor.printAllStudents(gryffindor);
        Hogwarts.printSeparator();
        Hufflepuff.printAllStudents(hufflepuff);
        Hogwarts.printSeparator();
        Ravenclaw.printAllStudents(ravenclaw);
        Hogwarts.printSeparator();
        Slytherin.printAllStudents(slytherin);
        Hogwarts.printSeparator();
        Gryffindor.findBestGryffindor(gryffindor, gryffindor);
        Hogwarts.printSeparator();
        Hufflepuff.findBestHufflepuff(hufflepuff, hufflepuff);
        Hogwarts.printSeparator();
        Ravenclaw.findBestRavenclaw(ravenclaw, ravenclaw);
        Hogwarts.printSeparator();
        Slytherin.findBestSlytherin(slytherin, slytherin);
        Hogwarts.printSeparator();
        Hogwarts.comparisonOfStudentAbilities(gryffindor, slytherin);
    }
}


