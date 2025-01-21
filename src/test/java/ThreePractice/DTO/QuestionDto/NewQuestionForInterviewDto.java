package ThreePractice.DTO.QuestionDto;

public class NewQuestionForInterviewDto {
    private int interview;

    public int getInterview() {
        return interview;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }

    public NewQuestionForInterviewDto(int interview) {
        this.interview = interview;
    }
}
