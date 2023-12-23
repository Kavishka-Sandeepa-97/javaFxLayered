package dao;

import dao.custom.impl.CustomerDaoImpl;
import dao.utill.DaoType;

public class DaoFactory {

    static DaoFactory daoFactory;
    private DaoFactory(){

    }

    public static DaoFactory getInstance(){
        return daoFactory==null?(daoFactory=new DaoFactory()):daoFactory;
    }
    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case CUSTOMER:return (T) new CustomerDaoImpl();
            //
        }
        return null;
    }
}