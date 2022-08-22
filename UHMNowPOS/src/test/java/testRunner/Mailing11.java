package testRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;

@SuppressWarnings("unused")
public class Mailing11 {
	
	public void Mailing111() throws Exception {
		
	
		 
		System.out.println("Email Sending");
		
		Date dt = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(dt); 
	    
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	    String formattedDate = sdf.format(date);
	    System.out.println(formattedDate);
	    
	    // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\SChauraisa\\Music\\Automation_Projects\\DemoBlaze\\target\\HtmlReports\\HtmlReports.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Execution report");
		  attachment.setName("Execution_report_"+strDate+".html");
		  
		// Create the email message
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("tselenium06@gmail.com", "Shivam@09"));
			email.setSSLOnConnect(true);
		  email.addTo("chaurasiatext3@gmail.com", " Test Manager");
		  email.setFrom("tselenium06@gmail.com", "Shivam Chaurasia (QA)");
		  email.setSubject("Execution report on "+formattedDate);
		  
		  
		  // set the html message
		  
		  email.setHtmlMsg("<html><Head><style>P{font-size:18px;}</style></Head><H3>Hello, Good day!</H3><P>All scenarios have been executed. Please find the attached report of the execution. </P><h3>Thanks,<br> Shivam</h3> </html>");
 
		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
		  
			System.out.println("Email Sent");
	}



}
