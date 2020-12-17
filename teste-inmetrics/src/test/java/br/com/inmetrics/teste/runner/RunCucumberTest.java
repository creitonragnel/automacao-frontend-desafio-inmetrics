package br.com.inmetrics.teste.runner;

import static br.com.inmetrics.teste.core.DriverFactory.getDriver;
import static br.com.inmetrics.teste.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.inmetrics.teste.core.Propriedades;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {""}, 
plugin = {"json: target/cucumber.json"},
monochrome = true, dryRun = false, tags = {"@regressivo"})
public class RunCucumberTest {
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