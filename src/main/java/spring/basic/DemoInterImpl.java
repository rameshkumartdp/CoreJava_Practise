package spring.basic;


public class  DemoInterImpl  implements DemoInter
{
	private String  message;
	private int salary;
	public Demo dem;

	public DemoInterImpl(String message)
	{
		this.message=message;
		System.out.println("Constructor executed");
	}
	
	public DemoInterImpl(int salary){
		this.salary=salary;
	}
	public DemoInterImpl(){
	}

	 public void setDemo(Demo dem){
		 this.dem=dem;
	 }

	 public void init() {
		 System.out.println("INIT METHOD-------->");
	 }
	 
	 public void destroy() {
		 System.out.println("DESTROY METHOD-------->");
	 }
	 
	public String wish(String uname)
	{
		return   message+salary+" "+uname+" Have a great day---->   "+dem;
	}
}