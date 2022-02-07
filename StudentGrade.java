//Brian Knapp
//Set up class and Ints.
public class StudentGrade{
	private int assign1;
	private int assign2;
	private int assign3;
	private int Test2;
	private int Test1;
	private int participation;

    public StudentGrade(int assign1, int assign2, int assign3, int Test1, int Test2, int participation){
    	this.assign1=assign1;
    	this.assign2=assign2;
    	this.assign3=assign3;
    	this.Test1=Test1;
    	this.Test2=Test2;
    	this.participation=participation;
    }
    
    //Getter and setter methods for assignments, tests, and participation.
    public void setAssign1(int assign1){
        this.assign1=assign1;
    }
    public int getAssign1(){
        return assign1;
    }
    public void setAssign2(int assign2){
        this.assign2=assign2;
    }
    public int getAssign2(){
        return assign2;
    }
    public void setAssign3(int assign3){
        this.assign3=assign3;
    }
    public int getAssign3(){
        return assign3;
    }
    public void setTest1(int Test1){
        this.Test1=Test1;
    }
    public int Test1(){
        return Test1;
    }
    public void setTest(int Test2){
        this.Test2=Test2;
    }
    public int getTest2(){
        return Test2;
    }
    public void setParticipation(int participation){
        this.participation=participation;
    }
    public int getParticipation(){
        return participation;
    }
}