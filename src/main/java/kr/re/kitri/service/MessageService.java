package kr.re.kitri.service;

import kr.re.kitri.dao.MessageDao;

public class MessageService {
	
	private MessageDao dao;
	
//	public MessageService(MessageDao messageDao) {
//		this.messageDao = messageDao;
//		System.out.println("callback by container");
//	}
	
	public void setMsgDao(MessageDao messageDao) {
		this.dao = messageDao;
		System.out.println("callback by container");
	}

	public String getMessage() {
		
		String msg = dao.retrieveMessage();
		
		return msg;
	}

}
