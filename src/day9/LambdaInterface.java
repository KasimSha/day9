package day9;

public class LambdaInterface {
	public static void main(String[] args) {
		Addition ad=(n1,n2) -> n1+n2;
		System.out.println(ad.add(2,4));
		
		Myname mn= (name1,name2) -> name1+" "+name2;
		System.out.println(mn.name("hello", "keyan"));
		
		Myid md=(n1,n2) -> {
			if(n1 > n2) {
				return 0;
			}
		return n1;
		};
		System.out.println(md.id(4, 6));
	}
	
	
}

interface Addition{
	int  add(int n1,int n2);
	
}

interface Myname{
	String  name(String name1,String name2);
}

interface Myid{
	double id(int name1,double name2);
	
}
