package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.QuestionService;



@WebServlet("/AddQuestion")
public class AddQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public AddQuestionController() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*String ans1=request.getParameter("ans1");
		String ans2=request.getParameter("ans2");
		String ans3=request.getParameter("ans3");
		String ans4=request.getParameter("ans4");
		
		String categories=request.getParameter("categories");
		String question=request.getParameter("question");
		String level=request.getParameter("radLevel");
		
		switch(level)
		{
		case "de":
			level="Dễ";
			break;
		case "tb":
			level="Trung Bình";
			break;
		case "kh":
			level="Khó";
			break;
		}
		
		QuestionService.addQuestions(new Question(question, "", level,99, Integer.parseInt(categories), 2));
		RequestDispatcher  dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/listQuestion.jsp");
	dispatcher.forward(request, response);
		*/
		
		
		
	}

}