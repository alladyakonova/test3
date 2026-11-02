public class Company {
    static String companyName = "Microsoft";
    final int employeeID = 4;
    String employeeName;

    Company (int employeeID, String someEmployeeName) {
        this.employeeName = someEmployeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName () {
        return this.employeeName;
    }

    void setEmployeeName (String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    static void setCompanyName (String newCompanyName) {
        companyName = newCompanyName;
    }

}
