package org.spring.message_formater;

import org.IMessageFormater;

public class PdfMessageFormaterImpl implements IMessageFormater {

	public String formatMessage(String message) {
		// TODO Auto-generated method stub
		String pdfmessage = null;
	    pdfmessage = "<pdf>" + message + "</pdf>" ;
	    return pdfmessage;
	}

}
