package yun.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yun.command.CommandHandler;
import yun.command.ContentAction;
import yun.command.ListAction;
import yun.command.UpdateAction;
import yun.command.WriteAction;

public class YunController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		userProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		userProcess(req, resp);
	}
	protected void userProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.http요청받음 (awt의 obj 반환)
		String type = req.getParameter("type");
		//2.요구기능분석
		CommandHandler command = null;
		String goPage = null;
		if(type.equals("list")){
			//3.기능처리
			command = new ListAction();
		}else if(type.equals("write")){
			command = new WriteAction();
		}else if(type.equals("content")){
			command = new ContentAction();
		}else if(type.equals("update")){
			command = new UpdateAction();
		}
		//4.결과저장
		goPage = command.process(req, resp);
		//5.이동
		RequestDispatcher dis = req.getRequestDispatcher(goPage);
		dis.forward(req, resp);
	}
	
}
