public class Main {
    public static void main(String[] args) {
        Company worker1 = new Company(5, "John");
        Company worker2 = new Company(8, "Tom");

        Company.printCompanyName();
        Company.setCompanyName("Google");
        Company.printCompanyName();

        System.out.println("Название компании: " + Company.companyName + ", ID сотрудника: " + worker1.employeeID + ", Имя сотрудника: " + worker1.employeeName);
        System.out.println("Название компании: " + Company.companyName + ", ID сотрудника: " + worker2.employeeID + ", Имя сотрудника: " + worker2.employeeName);

        ///

        System.out.println("Площадь круга равна: " + MathConstants.calculateCircleArea(2));
        System.out.println("Длина окружности равна: " + MathConstants.calculateCircumference(1));

        System.out.println("Результат: " + MathConstants.calculateExponentialGrowth(2, 2, 3));


        ///







    }

}
