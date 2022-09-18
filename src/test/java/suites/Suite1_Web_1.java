package suites;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import web_project.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Suite1_Web_1 {

    @Test
    @Order(1)
    @DisplayName("SADDTU-T1285 (1.0): Пользователь переходит на вкладку «Расписание»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1285() {
        new T1288().t1288();
        new T1285().scenario_T1285();
    }

    @Test
    @Order(2)
    @DisplayName("SADDTU-T1286 (1.0): Пользователь переходит на вкладку «Контакты»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1286() {
        new T1288().t1288();
        new T1286().scenario_T1286();
    }

    @Test
    @Order(3)
    @DisplayName("SADDTU-T1287 (1.0): Пользователь переходит на вкладку «Каталог»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1287() {
        new T1288().t1288();
        new T1287().scenario_T1287();
    }

    @Test
    @Order(4)
    @DisplayName("SADDTU-T1289 (1.0): Пользователь переходит на вкладку «Корпоративное обучение»")
    @Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1289() {
        new T1288().t1288();
        new T1289().scenario_T1289();
    }

    @Test
    @Order(5)
    @DisplayName("SADDTU-T1290 (1.0): Пользователь переходит на вкладку «Оценка персонала»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1290() {
        new T1288().t1288();
        new T1290().scenario_T1290();
    }

    @Test
    @Order(6)
    @DisplayName("SADDTU-T1290 (1.0): Пользователь переходит на вкладку «Java»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1291() {
        new T1288().t1288();
        new T1291().scenario_T1291();
    }

    @Test
    @Order(7)
    @DisplayName("открывается страница и открывается вкладка корпоративное обучение, " +
            "убираются галочки настоящий и ознакомлен, заполниться имя и телефон")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1292() {
        new T1288().t1288();
        new T1292().scenario_T1292();
    }

}


