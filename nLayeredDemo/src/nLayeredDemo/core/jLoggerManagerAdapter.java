package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		 jLoggerManager manager = new jLoggerManager();  
		 manager.log(message);
	}
	

}
