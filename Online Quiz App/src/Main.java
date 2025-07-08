import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Add questions
        questions.add(new Question("Which of the following is not a Java keyword?",
                new String[]{"static", "boolean", "final", "try"}, 1));
        questions.add(new Question("What is the size of an int variable in Java?",
                new String[]{"8 bits", "16 bits", "32 bits", "64 bits"}, 2));
        questions.add(new Question("Which method is used to start a thread execution in Java?",
                new String[]{"run()", "start()", "execute()", "init()"}, 1));
        questions.add(new Question("Which of the following is used to handle exceptions in Java?",
                new String[]{"throw", "catch", "try-catch", "final"}, 2));
        questions.add(new Question("What is the superclass of all classes in Java?",
                new String[]{"Object", "String", "Class", "Superclass"}, 0));
        questions.add(new Question("Which collection class stores elements in key-value pairs and does not allow duplicate keys?",
                new String[]{"ArrayList","HashSet","HashMap","TreeSet"},2));
        questions.add(new Question(" Which of these is not a primitive data type in Java?",
                new String[]{"int","char","String","boolean"},2));
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"super","this","extends","implements"},2));
        questions.add(new Question("Which interface must be implemented to create a thread in Java?",
                new String[]{"Runnable","Serializable","Clonable","Thredable"},0));
        questions.add(new Question("What will System.out.println(10 + 20 + \"Hello\") print?",
                new String[]{"30Hello","Hello30","1020Hello","Hello1020"},0));

        int score = 0;

        // Ask each question
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt() - 1;

            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.options[q.correctOption]);
            }
        }

        // Final score
        System.out.println("Quiz Complete! Your score: " + score + "/" + questions.size());

    }
}
