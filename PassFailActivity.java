/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 2279654
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    @Override
    public char getGrade() {
        if (super.getScore() >= minPassingScore) {
            return 'P';
        }
        else return 'F'; 
    } 
}

