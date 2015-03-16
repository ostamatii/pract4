package my.ostamatii.components;
import org.springframework.stereotype.Component;


@Component("studyProccessBean")
public class StudyProccess {
	
	public void visitLecture(){
		System.out.println("There is a lecture");
	}
	
	public void toDoAnExam(){
		System.out.println("There is an exam");
	}
	
}
