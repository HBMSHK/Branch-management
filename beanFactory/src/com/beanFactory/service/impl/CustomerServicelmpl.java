package com.beanFactory.service.impl;

import com.beanFactory.dao.CustomerDao;
import com.beanFactory.dao.impl.CustomerDaolmpl;
import com.beanFactory.service.CustomerService;

public class CustomerServicelmpl implements CustomerService {
    private CustomerDao cd=new CustomerDaolmpl();
    @Override
    public void save(){cd.save();}

}
