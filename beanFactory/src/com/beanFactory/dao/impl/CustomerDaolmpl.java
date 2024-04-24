package com.beanFactory.dao.impl;

import com.beanFactory.dao.CustomerDao;

public class CustomerDaolmpl implements CustomerDao {
    @Override
    public void save(){
        System.out.println("存入数据库");
    }
}
