import bean.Emp;
import config.SpringConfig;
import lx.B;
import lx.User;
import lx.student;
import mapper.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 王国梁
 * @date 2023/3/28 12:07
 */
public class text1 {
    public static void main(String[] args) {
        method14();
//        method13();
//        method12();
//        method11();
//        method10();
//        method9();
//        method8();
//        method7();
//        method6();
//        method5();
//        method4();
//        method2();
    }

    private static void method14() {

    }

    private static void method13() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean7.xml");
        transfer.service.UserService userService = context.getBean("userService", transfer.service.UserService.class);
        userService.bankMoney();



    }

    private static void method12() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean6.xml");
        jdbc.service.UserService userService = context.getBean("userService", jdbc.service.UserService.class);
        List<jdbc.entity.User> all = userService.findAll();
        System.out.println(all);

    }

    private static void method11() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean6.xml");
        jdbc.service.UserService userService = context.getBean("userService", jdbc.service.UserService.class);
        jdbc.entity.User user = userService.selectAll(1);
        System.out.println("以下为返回对象的属性");
        System.out.println(user.toString());

    }

    private static void method10() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean6.xml");
        jdbc.service.UserService userService = context.getBean("userService", jdbc.service.UserService.class);
        String table1 = new Scanner(System.in).nextLine();
        int count = userService.serviceSelect(table1);
        System.out.println("表中有 " + count+ " 条数据！");

    }

    private static void method9() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean6.xml");
        jdbc.service.UserService userService = context.getBean("userService", jdbc.service.UserService.class);
        jdbc.entity.User user = new jdbc.entity.User();
        user.setUserId(3);
        user.setUserName("HTTP");
        user.setUstatus("c");
        userService.userServiceAlter(user);

    }

    static void method1(){
        ApplicationContext Context
                = new ClassPathXmlApplicationContext("bean.xml");
        student ss = Context.getBean("s", student.class);
        System.out.println(ss);
        ss.eat();
        System.out.println(ss.name);
    }
    static void method2(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("User", User.class);
        System.out.println(user.name);
        System.out.println(user.age);
        user.eat();

    }
    static void method3(){
        ApplicationContext Context
                = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = Context.getBean("userService", UserService.class);
        userService.add();
        userService.getUserDao().add();
    }
    static void method4(){
        ApplicationContext ApplicationContext
                = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = ApplicationContext.getBean("emp1", Emp.class);
        System.out.println(emp.getEname());
        System.out.println(emp.getEgender());
        System.out.println(emp.getDept().getDname());

    }
    static void method5(){
        ApplicationContext a
                = new ClassPathXmlApplicationContext("bean4.xml");
        B b1 = a.getBean("a", B.class);
        System.out.println(b1.getName());
    }

    static void method6(){
        ApplicationContext ApplicationContext
                = new ClassPathXmlApplicationContext("bean5.xml");
        User1 user1 = ApplicationContext.getBean("user1", User1.class);
        System.out.println(user1);
        user1.add();
        user1.getUserDao().add();

    }
    static void method7(){
        ApplicationContext Context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        User1 user1 = Context.getBean("user1", User1.class);
        System.out.println(user1);

    }

    static void method8(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean6.xml");
        jdbc.service.UserService userService = context.getBean("userService", jdbc.service.UserService.class);
        jdbc.entity.User user = new jdbc.entity.User();
        user.setUserId(3);
        user.setUserName("Css");
        user.setUstatus("a");
        userService.userServiceAdd(user);

    }

}
