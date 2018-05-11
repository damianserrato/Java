public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String i = this.getRingtone();
        return "Hey, I was about t-- " + i;
    }
    @Override
    public String unlock() {
        return "Phone is now unlocked";
    }
    @Override
    public void displayInfo() {    
    }
}