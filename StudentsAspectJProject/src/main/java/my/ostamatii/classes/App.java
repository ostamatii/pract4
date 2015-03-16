package my.ostamatii.classes;

import my.ostamatii.components.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
	    
	    GoodStudent good = (GoodStudent) context.getBean("goodStudentBean");
	    LazyStudent lazy = (LazyStudent) context.getBean("lazyStudentBean");
	    
	    StudyProccess study = (StudyProccess) context.getBean("studyProccessBean");
	    System.out.println("new semester:");
		for(int i=0; i<3; i++) {
			study.visitLecture();
			System.out.println("");
		}
		study.toDoAnExam();

		System.out.println("");
    }
}
