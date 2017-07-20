package Locator;

import org.openqa.selenium.By;

public interface LoginLocator {
By emailid = By.id("identifierId");
By Next=By.xpath(".//*[@id='identifierNext']/content/span");
By password = By.xpath(".//*[@id='password']/div[1]");
By pnext=By.xpath(".//*[@id='passwordNext']/content");
}
