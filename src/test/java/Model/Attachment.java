package Model;

public class Attachment {
    private Long versionOrdinaryPayment;
    private String version;
    private Long versionCriticalUpdate;
    private String platform;
    private String url;
    private String hash;
    private String architecture;

    public Long getVersionOrdinaryPayment() { return versionOrdinaryPayment; }
    public void setVersionOrdinaryPayment(Long value) { this.versionOrdinaryPayment = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public Long getVersionCriticalUpdate() { return versionCriticalUpdate; }
    public void setVersionCriticalUpdate(Long value) { this.versionCriticalUpdate = value; }

    public String getPlatform() { return platform; }
    public void setPlatform(String value) { this.platform = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getHash() { return hash; }
    public void setHash(String value) { this.hash = value; }

    public String getArchitecture() { return architecture; }
    public void setArchitecture(String value) { this.architecture = value; }
}
