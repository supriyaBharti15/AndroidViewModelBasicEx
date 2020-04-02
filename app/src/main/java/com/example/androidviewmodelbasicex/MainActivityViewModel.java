package com.example.androidviewmodelbasicex;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private Integer score = 0;

    public Integer getScore() {
        if (score == null)
            score = 0;
        return score;
    }

    public void setScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }
}
