package org.example;

import dao.DaoFactory;
import dao.DepartmentDao;
import dao.SellerDao;
import entities.Department;
import entities.Seller;
import impl.DepartmentDaoJDBC;

import javax.swing.*;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
          SellerDao sellerDao = DaoFactory.createSellerDao();
          DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

//        System.out.println(" === TEST 1: seller findByid ===");
//        Seller seller = sellerDao.findById(1);
//        System.out.println( seller);
//        System.out.println(" === TEST 2: seller findByDepartment ===");
//        Department department = new Department(2,null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj:list) {
//            System.out.println(obj);
//        }
//        System.out.println(" === TEST 3: seller findAll ===");
//        list = sellerDao.findAll();
//        for (Seller obj:list) {
//            System.out.println(obj);
//        }
//        System.out.println(" === TEST 4: seller insert ===");
//          Seller newSeller = new Seller(null, "Vini", "greg@gmail.com", new Date(), 4000.0, department);
//          sellerDao.insert(newSeller);
//        System.out.println(" Inserted! New id = " + newSeller.getId());
//
//        System.out.println(" === TEST 5: seller update===");
//        seller = sellerDao.findById(2);
//        seller.setName("Samara");
//        sellerDao.update(seller);
//        System.out.println(" Update completed!");
//
//        System.out.println(" === TEST 6: seller delete===");
//        var id1  = JOptionPane.showInputDialog("Entre com o id para exclusão: ");
//        sellerDao.deleteById(Integer.valueOf(id1));
//        System.out.println(" Delete completed!");


//        System.out.println(" === TEST 1: departmen insert ===");
//        Department newDep = new Department(null, "Teste");
//        DepartmentDao.insert(newDep);
//        System.out.println(" Inserted! New id = " + newDep.getId());
//
//        System.out.println(" === TEST 2: departmen update===");
//        Department dep = DepartmentDao.findById(1);
//        dep.setName("vini");
//        DepartmentDao.update(dep);
//        System.out.println(" Update completed!");

//        System.out.println(" === TEST 3: department findByid ===");
//        Department dep = DepartmentDao.findById(1);
//        System.out.println(dep);
//        System.out.println(" === TEST 4: Department delete===");
//        var id1  = JOptionPane.showInputDialog("Entre com o id para exclusão: ");
//        DepartmentDao.deleteById(Integer.valueOf(id1));
//        System.out.println(" Delete completed!");
        System.out.println(" === TEST 5: departmen findAll ===");
        List<Department> list = DepartmentDao.findAll();
        for (Department obj:list) {
            System.out.println(obj);
        }

    }
}