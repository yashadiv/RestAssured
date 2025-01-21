package Practice.Dto.Dto.Questions;

import java.util.List;

public class LTPDto {
    private String name;
    private String answer;
    private String questionId;
    private List<FactsAndUseCases> facts;
    private List<FactsAndUseCases> useCases;

    public LTPDto(String name, String answer, String questionId, List<FactsAndUseCases> facts, List<FactsAndUseCases> useCases) {
        this.name = name;
        this.answer = answer;
        this.questionId = questionId;
        this.facts = facts;
        this.useCases = useCases;
    }

    public List<FactsAndUseCases> getFacts() {
        return facts;
    }

    public void setFacts(List<FactsAndUseCases> facts) {
        this.facts = facts;
    }

    public List<FactsAndUseCases> getUseCases() {
        return useCases;
    }

    public void setUseCases(List<FactsAndUseCases> useCases) {
        this.useCases = useCases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
