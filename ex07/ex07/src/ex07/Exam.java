/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.io.*;

public class Exam implements Serializable {
    private String rollNumber, fullName, examId, examName;
    private float mark;
    public Exam() {
        rollNumber = "";
        fullName = "";
        examId = "";
        examName = "";    
    }
    public Exam(String rollNumber, String fullName, String examId, String examName, float mark) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.examId = examId;
        this.examName = examName;
        this.mark = mark;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {     
        return "rollNumber:"+rollNumber+",fullName ="+fullName +
                ",examId = " + examId + "examName = "+examName+
                ", Mark = "+mark;
    }
    public static Exam input() {
        try {
            BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Please enter rollNumber : ");
            String rollNumber = reader.readLine();
            System.out.println("Please enter fullName : ");
            String fullName = reader.readLine();
            System.out.println("Please enter examId : ");
            String examId = reader.readLine();
            System.out.println("Please enter examName : ");
            String examName = reader.readLine();
            System.out.println("Please enter mark : ");
            float mark = Float.valueOf(reader.readLine());     
            return new Exam(rollNumber, fullName, examId, examName, mark);
        } catch(Exception e) {
            System.out.println("Error input Exam information: "+e);
            return null;
        }
    }
    
}
