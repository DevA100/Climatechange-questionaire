public class Question {

String questions;
int firstAnswer;
int secondAnswer;
int thirdAnswer;
int fourthAnswer;
int fifthAnswer;
int score;

public Question(String questions, int firstAnswer, int secondAnswer, int thirdAnswer, int fourthAnswer, int fifthAnswer,int score){

this.questions = questions;
this.firstAnswer = firstAnswer;
this.secondAnswer = secondAnswer;
this.thirdAnswer = thirdAnswer;
this.fourthAnswer = fourthAnswer;
this.fifthAnswer = fifthAnswer;
this.score = score;

}

public void setQuestions(){
    this.questions = questions;
}

public void setFirstAnswer(){
    this.firstAnswer = firstAnswer;
}
public void setSecondAnswer(){
    this.secondAnswer = secondAnswer;
}
public void  setThirdAnswer(){
    this.thirdAnswer = thirdAnswer;
}
public void setFourthAnswer(){
    this.fourthAnswer = fourthAnswer;
}
public void setFifthAnswer(){
    this.fifthAnswer = fifthAnswer;
}
public void setScore(){
    this.score = score;
}


    public String getQuestions(){
    return questions;
}
public int getFirstAnswer(){
    return firstAnswer;
}
    public int getSecondAnswer() {
        return secondAnswer;
    }
    public int getThirdAnswer() {
        return thirdAnswer;
    }
    public int getFourthAnswer(){
    return fourthAnswer;
    }
    public int getFifthAnswer() {
        return fifthAnswer;
    }
    public int getScore() {
        return score;
    }


}


