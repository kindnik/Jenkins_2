package suites;

import io.qameta.allure.Owner;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import web_project.T1285;
import web_project.T1286;
import web_project.T1288;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Suite1_Web_1 {

    @Test
    @Owner("Oshurkov Nikta")
    @Order(1)
    @DisplayName("SADDTU-T1285 (1.0): Пользователь переходит на вкладку «Расписание»")

    public void t1285() {
        new T1288().t1288();
        new T1285().scenario_T1285();
    }

    @Test
    @Owner("Oshurkov Nikta")
    @Order(2)
    @DisplayName("SADDTU-T1286 (1.0): Пользователь переходит на вкладку «Контакты»")

    public void t1286() {
        new T1288().t1288();
        new T1286().scenario_T1286();
    }

}


