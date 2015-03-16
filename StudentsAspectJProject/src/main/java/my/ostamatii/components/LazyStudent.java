package my.ostamatii.components;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import my.ostamatii.classes.Student;


@Component("lazyStudentBean")
@Scope("prototype")
@Aspect
public class LazyStudent implements Student {
	@Pointcut("execution(* my.ostamatii.components.StudyProccess.visitLecture(..))")
	public void visitLect(){}
	@Pointcut("execution(* my.ostamatii.components.StudyProccess.toDoAnExam(..))")
	public void doExam(){}
	
	private String name = "Lazy";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@After("visitLect()")
	public void relaxing(){
		System.out.println(name+": I am relaxing now");
	}
	
	@Before("visitLect()")
	public void toDoHomeWork(){
		System.out.println(name+": I am not doing my home work, I am relaxing");
	}
	
	@Before("doExam()")
	public void studyBeforeExam(){
		System.out.println(name+": I am not studying, I am relaxing");
	}
	
	@After("doExam()")
	public void studyAfterExam(){
		System.out.println(name+": I am studying a lot, I must pass an exam from 2 try");
	}
}
