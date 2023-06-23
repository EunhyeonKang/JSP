package kr.co.jsplec.ex;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

// 웹 어플리케이션의 생명주기를 감시하는 리스너 
// ServletContextListener 메서드가 웹어플리케이션의 시작과 종료 시 호출
//@WebListener
public class ContextListenerEx implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		System.out.println("리스너 테스트");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextDestroyed(sce);
	}
}
