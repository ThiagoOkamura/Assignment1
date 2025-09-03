/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 2279654
 */
public class CourseGrades implements <Analyzable> {
    private GradedActivity[] grades = new GradedActivity[4];

    public CourseGrades() {
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return "Lab Score: " + 
    }
    
    @Override
    public void getAverage() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        
        double average = sum / 4;
        System.out.println("Average score: " + average);
    }
    
    @Override
    public void getHighest() {
        double highest = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        System.out.println("Highest score: " + highest);
    }
    
    @Override
    public void getLowest() {
        double lowest = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("Highest score: " + lowest);
    }
}


