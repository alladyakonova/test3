package pac;

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

        University student1 = new University(5,"Павел Петров");
        University student2 = new University(7,"Анна Павлова");
        University student3 = new University(2,"Федор Иванов");

        University.changeUniversityName("СПбГУ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        ///

        GameSettings game1 = new GameSettings(3);
        GameSettings game2 = new GameSettings(4);

        GameSettings.setMaxPlayers(6);
        game1.addPlayer();
        game2.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();


        ///

        Person person1 = new Person("Иван", "Иванов", "879-45-6789");
        Person person2 = new Person("Петр", "Федоров", "345-45-6789");
        Person person3 = new Person("Алиса", "Петрова", "009-45-6789");

        person1.setFirstName("Джесси");
        person1.setLastName("Пинкман");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();




















    }

}
