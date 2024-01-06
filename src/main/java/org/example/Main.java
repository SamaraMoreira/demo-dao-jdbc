package org.example;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(" === TEST 1: seller findByid ===");
        Seller seller = sellerDao.findById(1);
        System.out.println( seller);
        System.out.println(" === TEST 2: seller findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj:list) {
            System.out.println(obj);
        }
        System.out.println(" === TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj:list) {
            System.out.println(obj);
        }

    }
}