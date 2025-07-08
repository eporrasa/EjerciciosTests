package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CrearEmpresaSteps {
    private WebDriver driver;

    @Given("Estoy en la página principal")
    public void estoy_en_la_página_principal() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://personal-g83pfp8p.outsystemscloud.com/Consultas/");

    };

    @When("Selecciono el menú empresas")
    public void selecciono_el_menú_empresas() {
        WebElement element = driver.findElement(By.id("b4-mnuEmpresas"));
        element.click();
    }

    @When("Presiono el botón Nueva empresa")
    public void presiono_el_botón_Nueva_empresa() {
        WebElement element = driver.findElement(By.id("btn_Add_Empresa"));
        element.click();
    }
    @When("Ingreso {string} como nuevo NIT")
    public void ingreso_como_nuevo_NIT(String txt_NIT) {
        WebElement element = driver.findElement(By.id("Input_NIT"));
        element.sendKeys(txt_NIT);
    }

    @When("Ingreso {string} como nueva razon social")
    public void ingreso_como_nueva_razon_social(String txt_RazonSocial) {
        WebElement element = driver.findElement(By.id("Input_RazonSocial"));
        element.sendKeys(txt_RazonSocial);
    }

    @Then("Debo ver la nueva página para cargar la información")
    public void debo_ver_la_nueva_página_para_cargar_la_información(String tituloEsperado){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"lbl_Add_Empresa\"]"));
        System.out.println("tituloEsperado = " + tituloEsperado);
        System.out.println("titulo = " + element.getText());
        assertTrue(element.getText().contains(tituloEsperado));
        driver.quit();
    }
}
