package singelton.design.pattern;

public class SingeltonClass {
	
	/*** Early Loading Case 1****/
	
//	private static SingeltonClass singletonInstance = new SingeltonClass();
	private static SingeltonClass singletonInstance =null;
	private SingeltonClass(){
		 
	 }

	//Get the only object available
	/*** Early Loading Case 1****/
//	   public static SingeltonClass getInstance(){
//	      return singletonInstance;
//	   }
	 public static SingeltonClass getInstance(){
		 
		 /*** Late binding Case 2 ***/
		 if(singletonInstance==null) {
			 return new  SingeltonClass();
		 }
	      return singletonInstance;
	   }
	   
	   public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonInstance);
	   }
	   
}
