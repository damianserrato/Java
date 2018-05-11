public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String g = this.getRingtone();
        return "Hey, this is your Galaxy Phone saying, " + g;
    }
    @Override
    public String unlock() {
        return "Your Galaxy phone is now unlocked";
    }
    @Override
    public void displayInfo() {          
    }
}