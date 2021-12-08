
public class student {
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	void getStuData(int id,String name)
	{
		SID=id;
		Sname=name;
	}
	
	void getStuMarks(int a,int b,int c)
	{
		Sub1=a;
		Sub2=b;
		Sub3=c;
		
	}
    void totalMarks()
    {  	
    	double tMarks;
    	tMarks=(Sub1 + Sub2 + Sub3)/3;
   	
    	System.out.println("Total marks" + tMarks );
    	System.out.println("Student id" + SID );
    	System.out.println("Student name" + Sname );
  
    }
	
	public static void main(String[] args) {

		student stu = new student();
		stu.getStuData(15,"Geetu");
    	stu.getStuMarks(80,80,80);
		stu.totalMarks();
		

	}

}


