/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class ExamTest {
    private Hashtable<String, Exam> hashtable;
    private Hashtable<String, Exam> secondHashtable;
    String textFileName = "C:\\temp\\studentmark.txt";

    
    
    public void makeExams(){
        hashtable = new Hashtable<>();
        for(int i = 0; i < 1; i++) {
            Exam exam = Exam.input();
            if(exam != null) {
                String key = String.format("%s%s", exam.getRollNumber(), exam.getExamId());
                hashtable.put(key, exam);
            }
        }
    }
    public void saveListToTextFile() {
        try {
            FileOutputStream file;
            file = new FileOutputStream(textFileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(file);
            objectOut.writeObject(hashtable);
            
            objectOut.close();
            file.close();
            System.out.println("The Exam collection were succesfully written to a file");
        } catch(Exception e) {
            System.out.println("The Exam collection were FAILED written to a file"+e);
        }
    }
    public void readObjectFromTextFile() {
        //hashtable
        try {
            FileInputStream file = new FileInputStream(new File(textFileName));
            ObjectInputStream objectOut = new ObjectInputStream(file);
            secondHashtable = (Hashtable<String, Exam>)objectOut.readObject();
            objectOut.close();
            file.close();
           
            System.out.println("Read file succesfully");
            
        } catch(Exception e) {
            System.out.println("Read file FAILED: "+e);
        }
    }
    public void printHashtable(Hashtable<String, Exam> hashObject) {
        hashObject.forEach((k, v) -> {
            Exam exam = (Exam)v;
            System.out.println(exam.toString());
        });
        
    }
    public Hashtable<String, Exam> getHashtable() {
        return hashtable;
    }

    public void setHashtable(Hashtable<String, Exam> hashtable) {
        this.hashtable = hashtable;
    }

    public Hashtable<String, Exam> getSecondHashtable() {
        return secondHashtable;
    }

    public void setSecondHashtable(Hashtable<String, Exam> secondHashtable) {
        this.secondHashtable = secondHashtable;
    }

    public String getTextFileName() {
        return textFileName;
    }

    public void setTextFileName(String textFileName) {
        this.textFileName = textFileName;
    }
}
