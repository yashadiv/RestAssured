package Dto.UsersDto;

public class CustomData {
    private boolean isCV;
    private String salesOpenTime;
    private String salesStatus;

    public CustomData(boolean isCV, String salesOpenTime, String salesStatus) {
        this.isCV = isCV;
        this.salesOpenTime = salesOpenTime;
        this.salesStatus = salesStatus;
    }

    public boolean isCV() {
        return isCV;
    }

    public void setCV(boolean CV) {
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
