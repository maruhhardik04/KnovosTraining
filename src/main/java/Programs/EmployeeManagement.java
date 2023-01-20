/**
 * The EmployeeManagement class is used to manage Employee records.
 * The class allows for creating, reading, updating and deleting Employee records.
 * The class also uses logging to log any errors that occur.
 *
 * @author Hardik Maru
 */



package Programs;

import FIlesAndIO.IOStreams.Employee;

import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class EmployeeManagement {

    /**
     * The name of the file where the Employee records are stored
     */
    private static final String FILE_NAME = "employees.ser";
    /**
     * The Logger object used to log errors
     */
    private static final Logger LOGGER = Logger.getLogger(EmployeeManagement.class.getName());

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

    /**
     * Creates a new Employee record
     *
     * @param employee the Employee object to be created
     *
     */
    public static void create(Employee employee) {
        List<Employee> employees = selectAll();
        employees.add(employee);
        writeEmployeesToFile(employees);
    }

    /**
     * Deletes an Employee record
     *
     * @param id the id of the Employee to be deleted
     */
    public static void delete(int id) {
        List<Employee> employees = selectAll();
        employees.removeIf(employee -> employee.getId() == id);
        writeEmployeesToFile(employees);
    }

    /**
     * Updates an Employee record
     *
     * @param id the id of the Employee to be updated
     * @param updatedEmployee the updated Employee object
     */
    public static void update(int id, Employee updatedEmployee) {
        List<Employee> employees = selectAll();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == id) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
        writeEmployeesToFile(employees);
    }

    /**
     * Selects all Employee records
     *
     * @return a List of Employee objects
     */
    public static List<Employee> selectAll() {
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

    /**
     * Writes a List of Employee objects to the file
     *
     * @param employees the List of Employee objects to be written
     */
    private static void writeEmployeesToFile(List<Employee> employees) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Employee employee : employees) {
                objectOutputStream.writeObject(employee);
            }
        } catch (IOException e) {
            LOGGER.warning("Error writing employees to file: " + e);
        }
    }

    /**
     * Prints a List of Employee objects
     *
     * @param employees the List of Employee objects to be printed
     */
    public static  void print(List<Employee> employees){
        employees.forEach(System.out::println);
    }



    public static void main(String[] args) {

        create(new Employee(1,"Rushi",10000));
        create(new Employee(2,"Manas",10000));
        print(selectAll());
        update(1,new Employee(1,"Rushi",10250));
        print(selectAll());
        delete(1);
        print(selectAll());


    }
}
