package Tel_Java_Prac;

public class Question {
    private int id;
    private String question;
    private String[] options;
    private int correctAnswer;

    // Constructor
    public Question(int id, String question, String[] options, int correctAnswer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpt1() {
        return options[0];
    }

    public String getOpt2() {
        return options[1];
    }

    public String getOpt3() {
        return options[2];
    }

    public String getOpt4() {
        return options[3];
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
