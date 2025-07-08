import java.util.*;

class Question {
    String question;
    String[] options;
    int correctOption; // index (0-3)

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }
}
