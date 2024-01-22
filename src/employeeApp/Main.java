package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
        Healthplan healthplan = new Healthplan(1, "HealthPlan1", Plan.BASIC);
        System.out.println(healthplan.toString());
        System.out.println("*************************************");

        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[]{"Plan1", "Plan2"});
        employee.addHealthPlan(0, "Plan1");
        employee.addHealthPlan(1, "Plan2");
        System.out.println(employee.toString());
        System.out.println("*************************************");


        Company company = new Company(1, "XYZ Company", 100000, new String[5]);
        company.addEmployee(0, "Employee1");
        company.addEmployee(1, "Employee2");
        System.out.println(company.toString());
    }
}
