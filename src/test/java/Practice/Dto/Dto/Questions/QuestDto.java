package Practice.Dto.Dto.Questions;

public class QuestDto {
    private String name;
    private int _id;
    private String changeKey;
    private String question;
    private VersionDetails versionDetails;
    private LTPDto ltpDto;

    public QuestDto(String changeKey, String question, VersionDetails versionDetails, LTPDto ltpDto) {
        this.changeKey = changeKey;
        this.question = question;
        this.versionDetails = versionDetails;
        this.ltpDto = ltpDto;
    }

    public QuestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
