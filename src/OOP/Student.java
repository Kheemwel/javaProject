package OOP;

class Student extends Person {
    private String program;
    private int yearLevel;

    public String getProgram() {
        return program;
    }

    public void setProgram(String p) {
        program = p;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int y) {
        yearLevel = y;
    }
}
