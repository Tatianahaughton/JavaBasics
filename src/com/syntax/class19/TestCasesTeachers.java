package com.syntax.class19;

public class TestCasesTeachers {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Larissa", true, 12);
        teacher.print();

        MathTeacher teacher2 = new MathTeacher("Adam", false, 5, "Math", 22);
        teacher2.print();
        teacher2.printOut();

        ChemistryTeacher teacher1 = new ChemistryTeacher("Abby", false, 3, 45);
        teacher1.print();
        teacher1.printChemMessage();

        PianoTeacher teacher3=new PianoTeacher("Linda",true,13,"Music");
        teacher3.print();
        teacher3.printMusicMessage();


    }
}
