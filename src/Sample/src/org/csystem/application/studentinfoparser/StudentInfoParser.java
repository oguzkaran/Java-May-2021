package org.csystem.application.studentinfoparser;

import org.csystem.application.date.DateUtil;

public class StudentInfoParser {
    public StudentInfo studentInfo;

    public static String getBirthDate(String str)
    {
        String [] birthDateInfo = str.split("[/]");
        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);

        return DateUtil.getDateTR(day, month, year);
    }


    public StudentInfoParser(String str)
    {
        /*
            <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
	        Oğuz Karan:10/09/1976:Matematik:54:78
	        Büşra Uludağ Polat:09/08/1994:Programlamaya Giriş:89:100
	        Furkan Genç:02/11/2006:Tarih:78:98
        */

        String [] studentInfoStr = str.split("[:]+");

        //...

        studentInfo = new StudentInfo();
        studentInfo.name = studentInfoStr[0];
        studentInfo.birthDate = getBirthDate(studentInfoStr[1]);
        studentInfo.lectureName = studentInfoStr[2];
        studentInfo.midtermGrade = Integer.parseInt(studentInfoStr[3]);
        studentInfo.finalGrade = Integer.parseInt(studentInfoStr[4]);
    }
}
