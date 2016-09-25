package com.agenthun.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agenthun on 16/9/25.
 * 一个公司类
 */
public class Company {
    private List<Staff> allStaffs = new ArrayList<>();

    //加入新员工
    public void addStaff(Staff per) {
        allStaffs.add(per);
    }

    public void showAllStaffs() {
        for (Staff per :
                allStaffs) {
            System.out.println("Staff = " + per.toString());
        }
    }
}
