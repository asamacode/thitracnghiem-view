package grouptwo.quizexam.Model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Exams generated by hbm2java
 */
public class Exams implements java.io.Serializable {

	private int id;
	private Classes classes;
	private Profilemanager profilemanager;
	private String name;
	private Date timeStarting;
	private int numQuestions;
	private Date timeFinishing;
	private byte avtivate;
	private Set resulttestses = new HashSet(0);
	private Set detailexamses = new HashSet(0);

	public Exams() {
	}

	public Exams(int id, Classes classes, Profilemanager profilemanager, String name, Date timeStarting,
			int numQuestions, Date timeFinishing, byte avtivate) {
		this.id = id;
		this.classes = classes;
		this.profilemanager = profilemanager;
		this.name = name;
		this.timeStarting = timeStarting;
		this.numQuestions = numQuestions;
		this.timeFinishing = timeFinishing;
		this.avtivate = avtivate;
	}

	public Exams(int id, Classes classes, Profilemanager profilemanager, String name, Date timeStarting,
			int numQuestions, Date timeFinishing, byte avtivate, Set resulttestses, Set detailexamses) {
		this.id = id;
		this.classes = classes;
		this.profilemanager = profilemanager;
		this.name = name;
		this.timeStarting = timeStarting;
		this.numQuestions = numQuestions;
		this.timeFinishing = timeFinishing;
		this.avtivate = avtivate;
		this.resulttestses = resulttestses;
		this.detailexamses = detailexamses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Profilemanager getProfilemanager() {
		return this.profilemanager;
	}

	public void setProfilemanager(Profilemanager profilemanager) {
		this.profilemanager = profilemanager;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTimeStarting() {
		return this.timeStarting;
	}

	public void setTimeStarting(Date timeStarting) {
		this.timeStarting = timeStarting;
	}

	public int getNumQuestions() {
		return this.numQuestions;
	}

	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}

	public Date getTimeFinishing() {
		return this.timeFinishing;
	}

	public void setTimeFinishing(Date timeFinishing) {
		this.timeFinishing = timeFinishing;
	}

	public byte getAvtivate() {
		return this.avtivate;
	}

	public void setAvtivate(byte avtivate) {
		this.avtivate = avtivate;
	}

	public Set getResulttestses() {
		return this.resulttestses;
	}

	public void setResulttestses(Set resulttestses) {
		this.resulttestses = resulttestses;
	}

	public Set getDetailexamses() {
		return this.detailexamses;
	}

	public void setDetailexamses(Set detailexamses) {
		this.detailexamses = detailexamses;
	}

}
