package ThreePractice.DTO.QuestionDto;

import java.util.List;

public class NewQuestionInInterviewDto {
    private int _id;
    private int interview;
    private List<Integer> hist;
    private String type;

    public NewQuestionInInterviewDto(int _id, int interview, List<Integer> hist, String type) {
        this._id = _id;
        this.interview = interview;
        this.hist = hist;
        this.type = type;
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
}
