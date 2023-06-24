import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 5;

        String[] questions = {
                "Question 1: What is the present simple form of 'eat'?\n(a) eat\n(b) ate\n(c) eaten\n(d) eating",
                "Question 2: Which sentence is in the present simple tense?\n(a) She will go to the store.\n(b) They are playing soccer.\n(c) I eat breakfast every morning.\n(d) He has written a book.",
                "Question 3: What time ___ to work every day?\n" +
                        "a) do you go\n" +
                        "b) does you go\n" +
                        "c) you go\n" +
                        "d) goes you",
                "Question 4: My sister ___ basketball on weekends.\n" +
                        "a) play\n" +
                        "b) plays\n" +
                        "c) playing\n" +
                        "d) played",
                "Question 5: We ___ English lessons every Tuesday.\n" +
                        "a) have\n" +
                        "b) has\n" +
                        "c) had\n" +
                        "d) having"
                // Add more questions here
        };

        String[] answers = {
                "a", // Answer for question 1
                "c", // Answer for question 2
                "a",
                "b",
                "a",

                // Add more answers here
        };

        System.out.println("Welcome to the Present Simple Quiz!");
        System.out.println("Enter your answers using the corresponding letter (a, b, c, d).");
        System.out.println("Enter '' to exit the program.");

        String adminPassword = "1111";
        String enteredPassword;

        while (true) {
            System.out.print("Enter the password to view correct answers (or press Enter to start the quiz): ");
            enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(adminPassword)) {
                showCorrectAnswers(questions, answers);
                break;
            } else if (enteredPassword.equals("")) {
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        }

        if (!enteredPassword.equals(adminPassword)) {
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println(questions[i]);
                String userAnswer = scanner.nextLine();

                if (userAnswer.equals("")) {
                    break;
                } else if (!userAnswer.matches("[abcd]")) {
                    System.out.println("Invalid option. Please choose a valid answer (a, b, c, d).");
                    i--; // Retry the same question
                    continue;
                }

                if (userAnswer.equals(answers[i])) {
                    score++;
                }
            }

            double percentage = (score / (double) totalQuestions) * 100;
            System.out.println("Quiz completed!");
            System.out.println("Your score: " + score + "/" + totalQuestions);
            System.out.println("Percentage: " + percentage + "%");
        }

        System.out.println("Thank you for using the Quiz Application!");
    }

    private static void showCorrectAnswers(String[] questions, String[] answers) {
        System.out.println("\nCorrect Answers:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Correct answer: " + answers[i]);
            System.out.println();
        }
    }
}