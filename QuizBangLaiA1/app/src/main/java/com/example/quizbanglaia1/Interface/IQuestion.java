package com.example.quizbanglaia1.Interface;

import com.example.quizbanglaia1.Model.CurrentQuestion;

public interface IQuestion {

    CurrentQuestion getSelectedAnswer();
    void showCorrectAnswer();
    void disableAnswer();
    void resetQuestion();

}
