package Practice.Dto.Dto.UsersDto;

public class CustomData {
    private Boolean isCV;
    private String salesOpenTime;
    private String salesStatus;

    public CustomData(Boolean isCV, String salesOpenTime, String salesStatus) {
        this.isCV = isCV;
        this.salesOpenTime = salesOpenTime;
        this.salesStatus = salesStatus;
    }

    public Boolean isCV() {
        return isCV;
    }

    public void setCV(Boolean CV) {
        isCV = CV;
    }

    public String getSalesOpenTime() {
        return salesOpenTime;
    }

    public void setSalesOpenTime(String salesOpenTime) {
        this.salesOpenTime = salesOpenTime;
    }

    public String getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
    }
}
