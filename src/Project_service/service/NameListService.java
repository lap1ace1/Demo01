package Project_service.service;

import Project_service.domain.*;

public class NameListService {
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);//员工的类型
            //获取通用属性
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                   break;
                case Data.PROGRAMMER:
                     equipment = creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case Data.DESIGNER:
                     equipment = creatEquipment(i);
                     bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock =  Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    private Equipment creatEquipment(int index){
        int equipmentType = Integer.parseInt(Data.EQUIPMENTS[index][0]);

        String modelOrName = Data.EQUIPMENTS[index][1];
        String priceOrDisplayOrTpye = Data.EQUIPMENTS[index][2];

        switch (equipmentType){
            case Data.PC:
                return new PC(modelOrName,priceOrDisplayOrTpye);
                case Data.NOTEBOOK:
                   double price =  Double.parseDouble(priceOrDisplayOrTpye);

               return new NoteBook(modelOrName,price);
                    case Data.PRINTER:
                        return new Printer(modelOrName,priceOrDisplayOrTpye);

        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (id==employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }

}
