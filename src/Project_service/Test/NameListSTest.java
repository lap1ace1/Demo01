package Project_service.Test;

import Project_service.domain.Employee;
import Project_service.service.NameListService;
import Project_service.service.TeamException;

public class NameListSTest {
    public static void main(String[] args) {
        NameListService nameListService = new NameListService();

        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
       // try {
       //     NameListService nameListService = new NameListService();
       //     int id = 3;
       //     Employee employee = nameListService.getEmployee(id);
       //     System.out.println(employee);
       // } catch (TeamException e) {
       //     System.out.println(e.getMessage());
       // }

    }


}
