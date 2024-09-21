package runTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kazuki.hello.dao.Studao;
import com.kazuki.hello.dao.impl.StuDaoImpl;

public class StuDaoTest {
    @Test
    void showTest(){
        // StuDaoImpl stuDao = new StuDaoImpl();
        // stuDao.show();

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        Studao stuDao = (Studao)app.getBean("stuDao");

        stuDao.show();




    }
}
