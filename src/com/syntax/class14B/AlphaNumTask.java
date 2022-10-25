package com.syntax.class14B;

public class AlphaNumTask {
    public static void main(String[] args) {
        // How many alphanumerical chars in  this String:

        String editedSentence="";
        String sentence = "Address: 506 Orchard rd, apt #301, VA.";                       //38

        editedSentence=sentence.replaceAll("[^a-zA-Z0-9]","");           //27

        System.out.println(editedSentence.length());//27

    }
        }







