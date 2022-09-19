package web_project;

import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.qameta.allure.Allure.step;
import static project.Base.openURL;
import static project.Base.setUpAll;

public class T1288 {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Step("[T1288 (1.0)] - Открытие главной страницы")
    public void t1288() {
        setUpAll();

        step("[Step 1] Открыть главную страницу ", () -> {
            openURL();
        });
    }
}
