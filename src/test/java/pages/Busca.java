package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Busca extends Base{

    public Busca(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public Busca preencherMarca(String marca){
        driver.findElement(By.className("SearchBar__input")).sendKeys(marca);
        return this;
    }
    public Busca preencherModelo(String modelo){
        driver.findElement(By.className("SearchBar__input")).sendKeys(modelo);
        return this;
    }

    public Busca preencherTodosOsCampos(String marca, String modelo){
        preencherMarca(marca);
        preencherModelo(modelo);
        return this;
    }



}