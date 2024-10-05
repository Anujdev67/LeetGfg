package Tel_Java_Prac;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of int?", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, 3);
        questions[1] = new Question(2, "What is the size of double?", new String[]{"4 bytes", "8 bytes", "16 bytes", "2 bytes"}, 2);
        questions[2] = new Question(3, "What is the size of char?", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, 2);
        questions[3] = new Question(4, "What is the size of long?", new String[]{"4 bytes", "8 bytes", "16 bytes", "2 bytes"}, 2);
        questions[4] = new Question(5, "What is the size of boolean?", new String[]{"1 byte", "2 bytes", "4 bytes", "Not precisely defined"}, 4);
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.getCorrectAnswer()) {
                selection[i] = "Correct";
            } else {
                selection[i] = "Incorrect";
            }
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (selection[i].equals("Correct")) {
                score++;
            }
        }

        System.out.println("Your total score is: " + score + " out of " + questions.length);
    }

    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }
}