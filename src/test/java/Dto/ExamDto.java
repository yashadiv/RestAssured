package Dto;

public class ExamDto {
    private String name;
    private String minutesStr;


    public ExamDto(String name, String minutesStr) {
        this.name = name;
        this.minutesStr = minutesStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinutesStr() {
        return minutesStr;
    }

    public void setMinutesStr(String minutesStr) {
        this.minutesStr = minutesStr;
    }
}
