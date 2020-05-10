package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileProcessing {
    public static void FileWrite(ArrDeque<DepartmentEquipment> list){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Equipment.txt"))){
            os.writeObject(list);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrDeque<DepartmentEquipment> FileRead(){
        ArrDeque<DepartmentEquipment> list;
        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Equipment.txt"))){
            list = (ArrDeque<DepartmentEquipment>) oi.readObject();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            list = null;
        }
        return list;
    }
}
