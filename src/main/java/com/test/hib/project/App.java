package com.test.hib.project;

import com.test.hib.controller.findUser_Hql;

public class App {
    public static void main( String[] args) {

        findUser_Hql u = new findUser_Hql();
//        u.findUserSelect();
//        u.getRecordbyId();
//        u.getmaxSalary();
        u.NamedQueryExample();

    }
}

