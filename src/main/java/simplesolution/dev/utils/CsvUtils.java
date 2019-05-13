package simplesolution.dev.utils;

import simplesolution.dev.model.Employee;

import java.io.PrintWriter;
import java.util.List;

public class CsvUtils {

    public static void downloadCsv(PrintWriter writer, List<Employee> employees) {
        writer.write("Employee ID, First Name, Last Name \n");
        for (Employee employee : employees) {
            writer.write(employee.getEmployeeId() + "," + employee.getFirstName() + "," + employee.getLastName() + "\n");
        }
    }

}
