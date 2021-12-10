package OOP;

class BloodData {
    private String bloodType, rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}