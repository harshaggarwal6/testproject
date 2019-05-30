package com.example.demo;

import java.io.IOException;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class Example {
	public Integer main() throws IOException {
		Email from = new Email("harsh.kumar1@mattsenkumar.net");
		String subject = "Hello World from the SendGrid Java Library!";
		Email to = new Email("harshaggarwal76@gmail.com");
		Content content = new Content("text/plain", "Hello, Email!");
		Mail mail = new Mail(from, subject, to, content);

		SendGrid sg = new SendGrid("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");
		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
			return response.getStatusCode();
		} catch (IOException ex) {
			throw ex;
		}
	}
}