/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 2279654
 */
public class CourseGrades implements Analyzable {
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
    public double getAverage() {
        double sum = 0;
        for (GradedActivity grade : grades) {
            sum += grade.getScore();
        }
        double avg = sum / 4;
        return avg;
    }
    
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() > highest.getScore()) {
                highest = grade;
            }
        }

        return highest;
    }
    
    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() < lowest.getScore()) {
                lowest = grade;
            }
        }
        
        return lowest;
    }
    
    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade() +
               "\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade() +
               "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade() +
                "\nFinal Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade() +
                "\nAverage Score: " + getAverage() +
                "\nHighest Score: " + getHighest().getScore() +
                "\nLowest Score: " + getLowest().getScore();
    }
}




