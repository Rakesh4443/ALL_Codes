package org.spring.message_formater;

import org.IMessageFormater;

public class MessageWritter1 {

	IMessageFormater messageformater;
	public void WriteMessage(String Message) {
		
        String formatedmessage = null;
		messageformater = new PdfMessageFormaterImpl();
	    formatedmessage = messageformater.formatMessage(Message);
	    System.out.println(formatedmessage);
		
	}

}
