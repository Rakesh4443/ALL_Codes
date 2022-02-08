package org.spring.message_formater;

import org.IMessageFormater;

public class MessageWritter {
	HtmlMessageFormaterImpl messageformater;
	public void WriteMessage(String Message) {
		
        String formatedmessage = null;
		messageformater = new HtmlMessageFormaterImpl();
	    formatedmessage = messageformater.formatMessage(Message);
	    System.out.println(formatedmessage);
		
	}
}
