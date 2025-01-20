package Dto.Questions;

public class VersionDetails {
    private int patch;
    private int subVersion;
    private int version;
    private String versionStr;

    public VersionDetails(int patch, int subVersion, int version, String versionStr) {
        this.patch = patch;
        this.subVersion = subVersion;
        this.version = version;
        this.versionStr = versionStr;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    public int getSubVersion() {
        return subVersion;
    }

    public void setSubVersion(int subVersion) {
        this.subVersion = subVersion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getVersionStr() {
        return versionStr;
    }

    public void setVersionStr(String versionStr) {
        this.versionStr = versionStr;
    }
}
