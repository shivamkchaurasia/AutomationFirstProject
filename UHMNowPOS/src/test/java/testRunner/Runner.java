package testRunner;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue={"stepDefinition"},monochrome=true,
plugin= {"pretty","html:target//HtmlReports/HtmlReports.html"}, publish = true )

public class Runner {

	@AfterClass

	public static void Mailing() throws AddressException, IOException, MessagingException{
		
		Runtime rsh=Runtime.getRuntime();  	  
		rsh.addShutdownHook(new Thread(){  
		public void run(){  
			Mailing11 sm = new Mailing11();
			try {
				sm.Mailing111();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Report has been sent");
			
		    }  
		}  
		);  
		try{Thread.sleep(5000);}catch (Exception e) 
		{
			System.out.println(e);
		}  
		
		
		}
	}


