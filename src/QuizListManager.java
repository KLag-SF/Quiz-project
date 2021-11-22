import java.util.Scanner;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public QuizListManager(QuizList quizList) {
        this.quizList = quizList;
    }

    public Result runQuiz() {
        Cls.clear();
//        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        result.addAnswer(userAnswer);
        printBar();
//        if (userAnswer.equals(quiz.getCorrectAnswer())) {
//            println("\t正解！〇");
//        } else {
//            println("\t不正解...×");
//        }
        printBar();
        println("解説へ [Enter]");
        scanln();
        printBar();
//        println(quiz.getExplanation());
        goNextProblem();
        return this.result;
    }

    private static String acceptUserAnswer() {
        System.out.print("\n答えを入力してください>>");
        return scanln();
    }

    private static void goNextProblem() {
        System.out.print("\n次の問題へ [Enter]");
        scanln();
    }

    private static String scanln() {
        return scanner.nextLine();
    }

    private static void printBar() {
        println("---------------------------------");
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
