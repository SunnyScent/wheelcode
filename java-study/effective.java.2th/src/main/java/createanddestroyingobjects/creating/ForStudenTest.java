package createanddestroyingobjects.creating;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: SunnyScent
 * @Date: 2016-12-19
 * @Time: 23:56
 */

public class ForStudenTest {
    public static void main(String[] args) {
        Student s=new Student();
        List<Student> sl=new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            s.setName(i+"name");
            s.setAge(i+"age");
            sl.add(s);
        }


    }
}