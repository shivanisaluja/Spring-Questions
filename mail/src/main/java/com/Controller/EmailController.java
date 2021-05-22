package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Models.EmailModel;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

@Controller
public class EmailController {
	static String emailToRecipient,emailSubject, emailMessage,emailFileName;
	static final String emailFromRecipient = "sangeeta.saluja123@gmail.com";
	
//	static ModelAndView modelViewObj;
	
	@Autowired
	private JavaMailSender mailSenderObj;
	
	@RequestMapping(value ="/")
	public String showEmailForm(Model m , @ModelAttribute("email") EmailModel email ) {
		String name = "shivani";
		m.addAttribute("name", name);
		return "emailForm";
	}
	
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String send(Model m , @Valid @ModelAttribute("email") EmailModel email,BindingResult br) {
		if(br.hasErrors()) {
			String name = "shivani";
			m.addAttribute("name", name);
			return "emailForm";
		}
		System.out.println(email);
		
		emailSubject = email.getSubject();
		emailMessage = email.getMessage();
		emailToRecipient = email.getMailTo();
		emailFileName = email.getFileName();
		mailSenderObj.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMessageHelper.setTo(emailToRecipient);
				mimeMessageHelper.setFrom(emailFromRecipient);
				mimeMessageHelper.setText(emailMessage);
				mimeMessageHelper.setSubject(emailSubject);
				if(emailFileName !="") {
				DataSource datasource = new FileDataSource(emailFileName);  
				mimeMessageHelper.addAttachment(emailFileName, datasource);
				
				}
				
			}
		});
		System.out.println("email sent successfully");
		m.addAttribute("email", email);
		return "send";
	}
	
	

}
