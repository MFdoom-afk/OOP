package com.company;

import java.util.Scanner;

public class ConsoleExtension {
    public static DepartmentEquipment readInfo(){
        Scanner scanner = new Scanner(System.in);
        DepartmentEquipment equipment = null;
        try{
            System.out.print("Введите название кафедры: ");
            String department = scanner.next();
            if(department.length() <4 || department.length() > 10)
                throw new Exception("Неверно введено название кафедры");
            System.out.print("Введите название оборудования: ");
            String name = scanner.next();
            System.out.print("Введите количество единиц оборудования: ");
            int amount = scanner.nextInt();
            if(amount < 0 || amount > 10) throw new Exception("Некорректный ввод(I >= 0 или I <= 10)");
            System.out.print("Введите стоимость единицы оборудования: ");
            double cost = scanner.nextDouble();
            if(cost < 0 || cost > 1000) throw new Exception("Некорректный ввод(0 < F < 1000)");
            equipment = new DepartmentEquipment(department,name,amount,cost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return equipment;
    }
}
