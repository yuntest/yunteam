package yun.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateAction implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result = "Ŀ�ǵ带 �̿��� ������Ʈ";
		req.setAttribute("result", result);
		return "/update.jsp";
		
	}

}
