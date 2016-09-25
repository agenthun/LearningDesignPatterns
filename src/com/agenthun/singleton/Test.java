package com.agenthun.singleton;

/**
 * Created by agenthun on 16/9/25.
 * 输出结果：注意CEO地址
 * Staff = com.agenthun.singleton.CEO@511d50c0
 * Staff = com.agenthun.singleton.CEO@511d50c0
 * Staff = com.agenthun.singleton.VP@60e53b93
 * Staff = com.agenthun.singleton.VP@5e2de80c
 * Staff = com.agenthun.singleton.Staff@1d44bcfa
 * Staff = com.agenthun.singleton.Staff@266474c2
 * Staff = com.agenthun.singleton.Staff@6f94fa3e
 */
public class Test {
    public static void main(String[] args) {
        Company cp = new Company();

        //单例模式CEO
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        cp.addStaff(ceo1);
        cp.addStaff(ceo2);

        //加入VP, Staff
        Staff vp1 = new VP();
        Staff vp2 = new VP();

        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);

        cp.showAllStaffs();
    }
}
