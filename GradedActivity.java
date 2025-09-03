/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author thiag
 */
public class GradedActivity {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public char getGrade() {
        int intscore =  (int) score;
        switch (intscore / 10) {
            case 10: return 'A'; 
            case 9: return 'A'; 
            case 8: return 'B'; 
            case 7: return 'C'; 
            case 6: return 'D'; 
            default: return 'F'; 
        }
    }
}


