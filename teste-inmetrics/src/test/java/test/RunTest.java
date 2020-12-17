package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Propriedades;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
plugin = { "pretty", "html:target/cucumber-reports" },
glue = {""}, monochrome = true, dryRun = false)
public class RunTest {
	@Rule
	public static TestName testName = new TestName();
	
	@AfterClass
	public static void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {			
			killDriver();
		}
	}
}