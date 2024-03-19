public class Course {
    // Fields
    private String courseNumber, courseName;
    private double contactHours, creditHours;
    private final double COST_PER_HR = 72;

    // Constructor
    public Course(String courseNumber, String courseName, double contactHours, double creditHours) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.contactHours = contactHours;
        this.creditHours = creditHours;
    }

    // Setter methods
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setContactHours(double contactHours) {
        this.contactHours = contactHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    // Getter methods
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getContactHours() {
        return contactHours;
    }

    public double getCreditHours() {
        return creditHours;
    }

    // Method to calculate tuition cost
    public double getTuitionCost() {
        return creditHours * COST_PER_HR;
    }
}
