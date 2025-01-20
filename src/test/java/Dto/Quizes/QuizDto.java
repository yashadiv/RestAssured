package Dto.Quizes;

public class QuizDto {
    private String name;
    private String answerType;
    private boolean isValid;
    private VariationsDto variations;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public QuizDto(String name, String answerType, boolean isValid, VariationsDto variations) {
        this.name = name;
        this.answerType = answerType;
        this.isValid = isValid;
        this.variations = variations;
    }
}
