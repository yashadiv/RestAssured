package Practice.Dto.Dto.Templates;

import java.util.List;

public class TemplateDto {private String name;
    private String desc;
    private List<ExamAndCourses> exams;
    private List<ExamAndCourses>courses;

    public TemplateDto(String name, String desc, List<ExamAndCourses> exams, List<ExamAndCourses> courses) {
        this.name = name;
        this.desc = desc;
        this.exams = exams;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<ExamAndCourses> getExams() {
        return exams;
    }

    public void setExams(List<ExamAndCourses> exams) {
        this.exams = exams;
    }

    public List<ExamAndCourses> getCourses() {
        return courses;
    }

    public void setCourses(List<ExamAndCourses> courses) {
        this.courses = courses;
    }

}
