package Programs.test;

import FIlesAndIO.IOStreams.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmployeesManagement {

    private static final String FILE_NAME = "employees.ser";
    private static final Logger LOGGER = Logger.getLogger(EmployeesManagement.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("employee.log");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.severe("Error setting up log file handler: " + e);
        }
    }


    public static void addEmployee(Employee employee) {
        List<Employee> employees = getAllEmployees();
        employees.add(employee);
        writeEmployeesToFile(employees);
    }

    public static void deleteEmployee(int id) {
        List<Employee> employees = getAllEmployees();
        employees.removeIf(employee -> employee.getId() == id);
        writeEmployeesToFile(employees);
    }

    public static void updateEmployee(int id, Employee updatedEmployee) {
        List<Employee> employees = getAllEmployees();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == id) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
        writeEmployeesToFile(employees);
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    Employee employee = (Employee) objectInputStream.readObject();
                    employees.add(employee);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.warning("Error reading employees from file: " + e);
        }
        return employees;
    }

    private static void writeEmployeesToFile(List<Employee> employees) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Employee employee : employees) {
                objectOutputStream.writeObject(employee);
            }
        } catch (IOException e) {
            LOGGER.warning("Error writing employees to file: " + e);
        }
    }

    public static   void printAllEmployee(List<Employee> employees){
        employees.forEach(System.out::println);
    }



    public static void main(String[] args) {

        addEmployee(new Employee(1,"Rushi",10000));
        addEmployee(new Employee(2,"Manas",10000));
        printAllEmployee(getAllEmployees());
        updateEmployee(1,new Employee(1,"Rushi",10250));
        printAllEmployee(getAllEmployees());
        deleteEmployee(1);
        printAllEmployee(getAllEmployees());


    }

}
