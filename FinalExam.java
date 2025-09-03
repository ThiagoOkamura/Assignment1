/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author thiag
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestiions, int numMissed) {
        this.numQuestions = numQuestiions;
        this.numMissed = numMissed;
        pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}

