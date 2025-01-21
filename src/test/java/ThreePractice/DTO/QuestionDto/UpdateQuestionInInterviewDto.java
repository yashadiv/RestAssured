package ThreePractice.DTO.QuestionDto;

import java.util.List;

public class UpdateQuestionInInterviewDto {
    private int _id;
    private int interview;
    private List<Integer> hist;
    private String type;
    private String answerLevel;
    private String timePlain;
    private String name;
    private String additionalQuestions;
    private int themeQuestionId;

    public UpdateQuestionInInterviewDto(int _id, int interview, List<Integer> hist, String type, String answerLevel, String timePlain, String name, String additionalQuestions, int themeQuestionId) {
        this._id = _id;
        this.interview = interview;
        this.hist = hist;
        this.type = type;
        this.answerLevel = answerLevel;
        this.timePlain = timePlain;
        this.name = name;
        this.additionalQuestions = additionalQuestions;
        this.themeQuestionId = themeQuestionId;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getInterview() {
        return interview;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }

    public List<Integer> getHist() {
        return hist;
    }

    public void setHist(List<Integer> hist) {
        this.hist = hist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswerLevel() {
        return answerLevel;
    }

    public void setAnswerLevel(String answerLevel) {
        this.answerLevel = answerLevel;
    }

    public String getTimePlain() {
        return timePlain;
    }

    public void setTimePlain(String timePlain) {
        this.timePlain = timePlain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalQuestions() {
        return additionalQuestions;
    }

    public void setAdditionalQuestions(String additionalQuestions) {
        this.additionalQuestions = additionalQuestions;
    }

    public int getThemeQuestionId() {
        return themeQuestionId;
    }

    public void setThemeQuestionId(int themeQuestionId) {
        this.themeQuestionId = themeQuestionId;
    }
}
