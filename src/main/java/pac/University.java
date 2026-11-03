package pac;

public class University {
    static String universityName = "МГУ";
    final int studentID = 12;
    String studentName;

    University (int studentID, String studentName) {
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }


    void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ", ID студента: " + studentID + ", Университет: " + universityName);
    }

}
