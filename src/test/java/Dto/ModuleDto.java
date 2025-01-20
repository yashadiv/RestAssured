package Dto;

import java.util.List;

public class ModuleDto {
    private String name;
    private List<Integer> questions;
    private String module;

    public ModuleDto(String name, String module) {
        this.name = name;
        this.module = module;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Integer> questions) {
        this.questions = questions;
    }

    public ModuleDto(String name, List<Integer> quests) {
        this.name = name;
        this.questions = quests;
    }
}
