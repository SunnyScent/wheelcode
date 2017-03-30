package createanddestroyingobjects.item5;

import java.util.Date;

/**
 * @author: SunnyScent
 * @Date: 2016-12-20
 * @Time: 11:35
 */

public class PersonTest {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Person p=new Person(new Date());
            p.isBabyBoomer();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("总共花费时间："+(endTime-startTime));

    }
}