import java.util.ArrayList;
import java.util.List;

public class Result {
    private final List<Quiz> selectedQuizList = new ArrayList<Quiz>();
    private final List<String> answers = new ArrayList<String>();

    public Result() {

    }

    public List<Quiz> getSelectedQuizList() {
        return this.selectedQuizList;
    }

    public List<String> getAnswers() {
        return this.answers;
    }

    public void addSelectedQuiz(Quiz quiz) {
        this.selectedQuizList.add(quiz);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void printResult() {
        System.out.println("---総合結果---\n");
        for (int i = 0; i < this.selectedQuizList.size(); i++) {
            Quiz quiz = this.selectedQuizList.get(i);
            String answer = this.answers.get(i);
            System.out.println("問題番号" + quiz.getName());
            System.out.println("あなたの答え：" + answer + "  正解：" + quiz.getCorrectAnswer() + "\n");
        }
    }

    public int getScore() {
        try {
            int score = 0;
            for (int i = 0; i < this.selectedQuizList.size(); i++) {
                Quiz quiz = selectedQuizList.get(i);
                String answer = answers.get(i);
                if (quiz.getCorrectAnswer().equals(answer)) {
                    score++;
                }
            }
            return score;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! Can't call this method now...");
            return 0;
        }
    }
}
