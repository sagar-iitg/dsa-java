package com.sagar.design.pattern;

//lazy loading
//eager loading


class Singleton{


	private static volatile Singleton instance=null;

	//no one can instantiate
	private Singleton()
	{

		if(instance!=null)
			throw  new RuntimeException("Please don't try to be smart");

		//System.out.println("Hello");

	}

	public static Singleton getInstance()
	{


		synchronized (Singleton.class){
			if(instance==null)
				instance=new Singleton();

			return instance;
		}




	}


}

class GFG{


	public static void main(String[] args) {

		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

	}
}