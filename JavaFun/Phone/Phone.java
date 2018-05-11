public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public abstract void displayInfo();
    public abstract String ring();

    public String getVersion() {
        return this.versionNumber;
    }
    public void setVersion(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    public int getBattery() {
        return this.batteryPercentage;
    }
    public void setBattery(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getRingtone() {
        return this.ringTone;
    }
    public void setRingtone(String ringTone) {
        this.ringTone = ringTone;
    }
}