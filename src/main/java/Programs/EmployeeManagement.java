package Programs;

import FIlesAndIO.IOStreams.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class EmployeeManagement {



    private static final String FILE_NAME = "employees.txt";
    private static final Logger LOGGER = Logger.getLogger(EmployeeManagement.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("employee_management.log");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            LOGGER.warning("Failed to create log file.");
        }
    }





    public static  void createEmployee(Employee employee) {
        try {
            FileWriter fileWriter=new FileWriter(FILE_NAME,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            writer.write(employee.toString());
            writer.write("\n");
            writer.close();
            LOGGER.info("Employee Add"+employee);
        } catch (IOException e) {
            LOGGER.warning("Failed to add new employee.");

        }
    }


    public static List<Employee>  getAll()
    {
        List<Employee> employees = new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(FILE_NAME);
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                int id = Integer.parseInt(employeeData[0]);
                String name = employeeData[1];
                int salary = Integer.parseInt(employeeData[2]);
                employees.add(new Employee(id, name,  salary));
            }
            reader.close();
            LOGGER.info("All employees retrieved.");
        } catch (IOException e) {
            LOGGER.warning("Failed to retrieve all employees.");
        }
        return employees;
    }


    private static void updateEmployee(int id, String name, int salary)
    {
        List<Employee> employees = getAll();
        try {
            FileWriter writer=new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (Employee employee:employees){
                if (employee.getId() == id)
                {
                    employee.setName(name);
                    employee.setSalary(salary);
                    LOGGER.info("Employee updated: " + employee);
                }
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            LOGGER.warning("Failed to update employee.");
        }

    }

    private static void deleteEmployee(int id) {
        List<Employee> employees = getAll();
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                if (employee.getId() != id) {
                    bufferedWriter.write(employee.toString());
                    bufferedWriter.newLine();
                } else {
                    LOGGER.info("Employee deleted: " + employee);
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            LOGGER.warning("Failed to delete employee.");
        }
    }


    public static void main(String[] args) {
        File file=new File(FILE_NAME);
        if (file.exists())
        {
            file.delete();
        }

        createEmployee(new Employee(1,"Rushi",10000));
        createEmployee(new Employee(2, "Manas", 10000));
        for (Employee employee:getAll()){
            System.out.println(employee);
        }
        System.out.println("After adding new employee:");
        createEmployee(new Employee(3, "Jay", 10000));
        for (Employee employee:getAll()){
            System.out.println(employee);
        }

        deleteEmployee(2);
        System.out.println("After deleting  employee with id : 2");
        for (Employee employee:getAll()){
            System.out.println(employee);
        }

        System.out.println("Update the salary of with id:3");
        updateEmployee(3,"Jay",10001);
        for (Employee employee:getAll()){
            System.out.println(employee);
        }
    }

}
