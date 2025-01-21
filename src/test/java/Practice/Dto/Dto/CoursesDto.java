package Practice.Dto.Dto;

import java.util.List;

public class CoursesDto {
    private String name;
    private List<ModuleDto> modules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModuleDto> getModuleDto() {
        return modules;
    }

    public void setModuleDto(List<ModuleDto> moduleDto) {
        this.modules = moduleDto;
    }

    public CoursesDto(String name, List<ModuleDto> moduleDto) {
        this.name = name;
        this.modules = moduleDto;
    }
}
