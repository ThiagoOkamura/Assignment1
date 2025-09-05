/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 2279654
 */
public class PassFailExam extends PassFailActivity {
     private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        
        pointsEach = 100 / numQuestions;
        double numericScore = 100 - (numMissed * pointsEach);
        
        setScore(numericScore);
    }

    @Override
    public String toString() {
        return "Each question counts for " + pointsEach + " points." +
                "\nThe exam score is " + getScore() +
                "\nThe exam grade is " + getGrade();
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }  
}

