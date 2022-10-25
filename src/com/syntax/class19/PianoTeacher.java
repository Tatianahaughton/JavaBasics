package com.syntax.class19;

public class PianoTeacher extends Teacher{
  String subject;

  PianoTeacher(String name,boolean isStrict, int yearsWorked, String subject) {
      super(name,isStrict,yearsWorked);
      this.subject=subject;
  }

  void printMusicMessage() {
      System.out.println(name+" has been teaching "+subject+"for "+yearsWorked+" years");
  }
}
