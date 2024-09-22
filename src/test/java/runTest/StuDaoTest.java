package runTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kazuki.hello.dao.Studao;

public class StuDaoTest {

    // @Test
    // void showTest() {
    //     // `ApplicationContext.xml` を読み込む
    //     ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    //     // stuDao Bean を取得
    //     Studao stuDao = (Studao) app.getBean("stuDao");

    //     // stuDao の `show` メソッドを呼び出して、学生情報を表示
    //     stuDao.show();

    //     // アプリケーションコンテキストを閉じる
    //     app.close();
    // }

    @Test
    void SetTest() {
        // `ApplicationContext.xml` を読み込む
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // stuDao Bean を取得
        Studao bean = (Studao) app.getBean("stuDao");

        // stuDao の `show` メソッドを呼び出して、学生情報を表示
        bean.show();

        // アプリケーションコンテキストを閉じる
        
    }
}
