package Oops;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.Name ="Avanya";
		E1.EmpId= 10;
		E1.Department="Director";


		E1.Display();
		Bank B=new Bank();
		
		B.Displaybalance();
		int Bal=B.Getbalance();
		System.out.println("balance is " +  B.Getbalance());
		System.out.println("New balance is " + Bal);
         
		BOABank b1= new BOABank();
		b1.CCbalance();
		
		Overloadingexample obj=new Overloadingexample();
		int rectarea= obj.GetArea(2,5);
		System.out.println("araea is "+ rectarea);
		
		Chrome Ch=new Chrome();
		Ch.OpenBrowser();
		
		Browser Br=new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.Displayname();
		
		HondaCar car1=new HondaCar();
		CarInterface car2=new HondaCar();
		
		Encapsulation En= new Encapsulation();
		En.setBalance(2000);
		System.out.println(En.getBalance());
	}

}
