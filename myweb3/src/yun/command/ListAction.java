package yun.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListAction implements CommandHandler {
//내가만든 인터페이스 상속
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result = "커맨드패턴을 적용한 목록보기";
		req.setAttribute("result", result);
		return "/list.jsp";
	}

}
