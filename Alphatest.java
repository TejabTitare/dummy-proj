class alphatest{
	
	alphatest(String s){
		//system.out.println(s);
		System.out.println(s);}

	public static void main(String[] args) 
	{
		Integer i1=new Integer(100);
		Integer i2=new Integer(200);
		

System.out.println(i1.equals(i2));

System.out.println(i1.equals(i2));

		alphatest a1= new alphatest("teju");
		alphatest a2= new alphatest("java");
//boolean equals(java.lang.object obj){
		/*if(this==a1)
			return true;
		else
			return false;*/

		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
