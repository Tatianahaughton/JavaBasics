package com.syntax.class19;

public class ChemistryTeacher extends Teacher {
    public int classSize;

    ChemistryTeacher(String name,boolean isStrict, int yearsWorked, int classSize) {
        super(name, isStrict, yearsWorked);
        this.classSize=classSize;
    }
    void printChemMessage() {
        System.out.println(name+" teaches class size of "+classSize);
    }
}
