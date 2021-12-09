package drivers;

import excel.NikeReadExcel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GoogleChromeDriver {

    //public static ArrayList<Map<String, String>> listaProductos;
    public static WebDriver driver;

    public static void chromeWebDriver(String url)  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        driver.get(url);
        //listaProductos = NikeReadExcel.leerDatosDeHojaDeExcel("C:\\Users\\Angie\\IdeaProjects\\Mi primer reto Cucumber\\productos.xlsx","hoja1");

    }
}
