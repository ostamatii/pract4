package my.ostamatii.components;

import my.ostamatii.classes.Student;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("goodStudentBean")
@Scope("prototype")
public class GoodStudent implements Student {
	private String name="Good";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void relaxing(){
		System.out.println(name+": I am relaxing now");
	}
	
	public void toDoHomeWork(){
		System.out.println(name+": I am doing my home work, I have lecture soon");
	}
	
	public void studyBeforeExam(){
		System.out.println(name+": I am studying a lot, I have an exam soon");
	}

}
