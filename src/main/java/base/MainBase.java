package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBase {
	
	public static WebDriver drive;
	public static Properties prop;
	public static Logger logs;
	
	public MainBase() {
		prop =new Properties();
		logs = Logger.getLogger(MainBase.class);
		logs.info("intilese from const");
		try {
			FileInputStream fi =new FileInputStream("C:\\SeleniumProject\\NaukariAutoamtion\\src\\main\\java\\config\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void intlize() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\chrome77\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.manage().deleteAllCookies();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		drive.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		drive.get(prop.getProperty("url"));
		System.out.println(" intilize complete");	
	}
	
	}
