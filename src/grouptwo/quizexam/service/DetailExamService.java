package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.DetailExam;


public class DetailExamService extends BaseService {

	public DetailExamService() {
		super();
	}
	public List<DetailExam> getAllDetailExams() {
		String query = "Select * from detailexams";
		List<DetailExam> lstDetailExams = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				DetailExam detailexams = new DetailExam(
						rs.getInt(1),
						rs.getInt(2));
				lstDetailExams.add(detailexams);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstDetailExams;
	}

	public DetailExam getDetailExamsByIdExam(int id) {
		String query = "Select * from detailexams where Exam = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			DetailExam detailexam = new DetailExam(
					rs.getInt(1),
					rs.getInt(2));
			return detailexam;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public DetailExam getDeTailExamsByIdQuestion(String detailexam) {
		return null;
	}

	public boolean deleteDetailExams(int id1, int id2) {
		String query="Delete from detailexams where Exam=? and Question=?";
		List<Object> params= new ArrayList<>();
		params.add(id1);
		params.add(id2);
		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateDetailExams(DetailExam detailexam) {
		{
			String query ="update detailexams set "
					+ "Exam = ?,"
					+ "Question = ?,"
					+ "Where Exam= ?";
			List<Object> params= new ArrayList<>();
			params.add(detailexam.getExamId());
			params.add(detailexam.getQuestionId());
			params.add(detailexam.getExamId());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean addDetailExams(DetailExam detailexam) {
		String query="Insert into detailexams (Exam,Question)"
				+"values (?,?)";
	List<Object> params= new ArrayList<>();
	params.add(detailexam.getExamId());
	params.add(detailexam.getQuestionId());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
}