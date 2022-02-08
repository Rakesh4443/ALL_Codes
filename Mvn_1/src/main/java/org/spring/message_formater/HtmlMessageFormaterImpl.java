package org.spring.message_formater;

import org.IMessageFormater;

public class HtmlMessageFormaterImpl implements IMessageFormater {

	public String formatMessage(String message) {
		// TODO Auto-generated method stub
		
		String htmlmessage = null;
	    htmlmessage = "<html><body>" + message + "</html></body>" ;
	    return htmlmessage;
	}

}
