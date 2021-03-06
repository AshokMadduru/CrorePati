

/*
Question class with question, level and correctAnswer as protected instance variables.
Provide the following methods in the Question class.
	public String getQuestion() - returns the question text
	public int getLevel() - returns the question level which is from 1 to 15
	public String getCorrectAnswer() - returns the correct answer to this question
 */
public class Question {

	protected String question,correctAnswer;
	protected int level;
	
	public Question(String que,int lev,String ans){
		this.question=que;
		this.level=lev;
		this.correctAnswer=ans;
	}
	
	
	public String getQuestion(){
		return this.question;
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public String getCorrectAnswer(){
		return this.correctAnswer;
	}
}
