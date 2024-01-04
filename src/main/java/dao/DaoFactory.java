package dao;

import db.DB;
import impl.DepartmentDaoJDBC;
import impl.SellerDaoJDBC;

public class DaoFactory {

        public static SellerDao createSellerDao() {
            return new SellerDaoJDBC(DB.getConnection());
        }

        public static DepartmentDao createDepartmentDao() {
            return new DepartmentDaoJDBC(DB.getConnection());
        }
    }

