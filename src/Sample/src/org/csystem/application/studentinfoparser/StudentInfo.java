package org.csystem.application.studentinfoparser;

public class StudentInfo {
    public String name;
    public String birthDate;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    //...

    public double getGrade()
    {
        return midtermGrade * 0.4 + finalGrade * 0.6;
    }


    public String toString()
    {
        double grade = getGrade();

        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midterm: %d, final: %d, grade:%.1f, status: %s}";

        return String.format(fmt, name, birthDate, lectureName, midtermGrade, finalGrade, grade, grade >= 50 ? "Geçti" : "Kaldı");
    }
}
