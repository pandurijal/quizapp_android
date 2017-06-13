package com.quizapp;

/**
 * Created by pandu on 31/05/17.
 */

public class Questions {

    public String mQuestions[] = {
        "Bahan bakar kereta api adalah... ",
        "Gunung tertinggi di dunia adalah... ",
        "Sebuah papan catur memiliki kotak-kotak tempat bidak sebanyak... "
    };

    private String mChoices[][] = {
        {"Batubara", "Bensin", "Solar", "Minyak Kelapa"},
        {"Kilimanjaro", "Everest", "Jaya Wijaya", "Semeru"},
        {"64", "68", "80", "56"}
    };

    private String mCorrectAnswers[] = {
        "Batubara",
        "Everest",
        "64"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
