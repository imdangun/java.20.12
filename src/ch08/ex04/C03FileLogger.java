package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("로깅 시작합니다.");
		logger.severe("에러가 발생했습니다.");
		logger.info("로깅 마칩니다.");
		
		handler.flush();
		handler.close();		
	}
	
	public static void main(String[] args) throws Exception {
		/*
		try {
			new C03FileLogger().log();
		} catch(Exception e) {}
		*/
	
		new C03FileLogger().log();
	}
}
