package com.company;

public class Test {
    public static void addTest(ArrDeque<DepartmentEquipment> deque){
        DepartmentEquipment equipment = ConsoleExtension.readInfo();
        deque.add(equipment);
        System.out.println(deque);
    }
    public static void addFirstTest(ArrDeque<DepartmentEquipment> deque){
        DepartmentEquipment equipment = ConsoleExtension.readInfo();
        deque.addFirst(equipment);
        System.out.println(deque);
    }

    public static void removeLastTest(ArrDeque<DepartmentEquipment> deque){
        System.out.println("Коллекция до удаления");
        System.out.println(deque);
        deque.removeLast();
        System.out.println("Коллекция после удаления");
        System.out.println(deque);
    }

    public static void removeFirstTest(ArrDeque<DepartmentEquipment> deque){
        System.out.println("Коллекция до удаления");
        System.out.println(deque);
        deque.removeFirst();
        System.out.println("Коллекция после удаления");
        System.out.println(deque);
    }

}
