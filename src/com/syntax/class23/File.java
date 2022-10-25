package com.syntax.class23;

public abstract class File {
    abstract void open();

    void edit(){
        System.out.println("Edit file");
    }

    void close (){
        System.out.println("close file");
    }
}

class JavaFile extends File {
    void open() {
        System.out.println("Opening Java file using notepad++");
    }
}

    class WordFile extends File {
        void open() {
            System.out.println("To open a document file, we need Microsoft Word to be installed ");
        }
    }

        class PdfFile extends File {
            void open() {
                System.out.println("To open a pdf file you need a pdf reader");
            }
        }

