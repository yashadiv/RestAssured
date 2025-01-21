package ThreePractice.DTO.InterviewsDto;

import java.util.List;

public class UpdateInterviewsDto <T>{
    private String name;
    private int _id;
    private List<T> questions;
    private String questionsSize;
    private String problemQuestions;
    private String growPoints;
    private String type;
    private String date;
    private String position;
    private String feedback;
    private String video;

    public UpdateInterviewsDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getQuestions() {
        return questions;
    }

    public void setQuestions(List<T> questions) {
        this.questions = questions;
    }

    public UpdateInterviewsDto(String name, int _id,List<T> questions, String questionsSize, String problemQuestions, String growPoints, String type, String date, String position, String feedback, String video) {
        this.name = name;
        this._id = _id;
        this.questions = questions;
        this.questionsSize = questionsSize;
        this.problemQuestions = problemQuestions;
        this.growPoints = growPoints;
        this.type = type;
        this.date = date;
        this.position = position;
        this.feedback = feedback;
        this.video = video;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getQuestionsSize() {
        return questionsSize;
    }

    public void setQuestionsSize(String questionsSize) {
        this.questionsSize = questionsSize;
    }

    public String getProblemQuestions() {
        return problemQuestions;
    }

    public void setProblemQuestions(String problemQuestions) {
        this.problemQuestions = problemQuestions;
    }

    public String getGrowPoints() {
        return growPoints;
    }

    public void setGrowPoints(String growPoints) {
        this.growPoints = growPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
