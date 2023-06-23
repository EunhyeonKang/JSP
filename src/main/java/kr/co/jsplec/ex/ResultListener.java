package kr.co.jsplec.ex;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ResultListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		System.out.println("contextInitialized");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextDestroyed(sce);
		System.out.println("contextDestroyed");
	}
}
