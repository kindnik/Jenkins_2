package suites;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import web_project.T1285;
import web_project.T1286;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Suite1_Web_1 {

    @Test
    @Order(1)
    @DisplayName("SADDTU-T1285 (1.0): Пользователь переходит на вкладку «Расписание»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1285() {

        new T1285().scenario_T1285();
    }

    @Test
    @Order(2)
    @DisplayName("SADDTU-T1286 (1.0): Пользователь переходит на вкладку «Контакты»")
    //@Issues({@Issue("33"), @Issue("7"), @Issue("29")})
    public void t1286() {

        new T1286().scenario_T1286();
    }

}


