package web_project;

import project.pages.MainPage;
import project.pages.Каталог_курсов_по_направлениям;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;
import static project.pages.MainPage.Вкладки.Каталог;

public class T1287 {
    private MainPage mainPage;
    private Каталог_курсов_по_направлениям каталог_курсов_по_направлениям;

    String курс_1 = "SQA-050";
    String курс_2 = "SQA-051";

    public void scenario_T1287() {

        step("[Step 1]: Перейти на вкладку 'Каталог'", () -> {
            mainPage = new MainPage();
            каталог_курсов_по_направлениям = mainPage
                    .userGoToPage(Каталог)
                    .return_to_page(new Каталог_курсов_по_направлениям());

            result("Перешли на вкладку 'Каталог'");
        });

        step("[Step 2]: Найти курс по запросу: '" + курс_1 + "'", () -> {
            каталог_курсов_по_направлениям.searchCourse(курс_1);

            result("В поисковую строку введен курс: '" + курс_1 + "'");
        });

        step("[Step 3]: Проверить, что курс: '" + курс_1 + "' отобразился на странице", () -> {
            каталог_курсов_по_направлениям.checkCourse("Школа автоматизированного тестирования. Часть 2. Selenium WebDriver");

            result("Курс: '" + курс_1 + "' отобразился на странице");
        });

        step("[Step 4]: Найти курс по запросу: '" + курс_2 + "'", () -> {
            каталог_курсов_по_направлениям.searchCourse(курс_2);

            result("В поисковую строку введен курс: '" + курс_2 + "'");
        });

        step("[Step 5]: Проверить, что курс: '" + курс_2 + "' отобразился на странице", () -> {
            каталог_курсов_по_направлениям.checkCourse("Школа автоматизированного тестирования. Часть 3. BDD-тестирование с Cucumber");

            result("Курс: '" + курс_2 + "' отобразился на странице");
        });
    }
}
