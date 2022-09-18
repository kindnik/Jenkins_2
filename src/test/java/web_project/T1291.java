package web_project;

import project.pages.Java_kurs;
import project.pages.MainPage;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class T1291 {
    private Java_kurs открыть_курсы_Java;
    private MainPage mainPage;

    public void scenario_T1291() {
        step("[Step 1]: Перейти на вкладку 'Java'", () -> {
            mainPage = new MainPage();
            открыть_курсы_Java = mainPage.открыть_курсы_Java();

            result("Перешли на вкладку 'Java'");
        });

        step("[Step 2]: Проверить написанное выражение 'Выберите уровень'", () -> {
            открыть_курсы_Java.checkText("Выберите уровень");

            result("Перешли на вкладку 'Java'");
        });

    }
}
