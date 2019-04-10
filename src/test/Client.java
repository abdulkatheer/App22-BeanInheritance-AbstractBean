package test;

import beans.Student;
import business.MarkSheet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Abstract bean is making a bean abstract to restrict the object creating by ApplicationContext
        So we can provide generic things inside abstract bean such as common properties.
        This application uses abstract factory to store and generate students' marksheet.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        MarkSheet m = (MarkSheet) context.getBean("marksheet");

        Student s1 = (Student) context.getBean("s1");
        Student s2 = (Student) context.getBean("s2");
        Student s3 = (Student) context.getBean("s3");
        Student s4 = (Student) context.getBean("s4");
        m.getMarkSheet(s1);
        m.getMarkSheet(s2);
        m.getMarkSheet(s3);
        m.getMarkSheet(s4);
    }
}
