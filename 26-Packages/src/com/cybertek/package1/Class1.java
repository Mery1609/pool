package com.cybertek.package1;

//import com.cybertek.package2.*;

//import com.cybertek.package2.Class2;
//import com.cybertek.package2.Class3;



public class Class1 {

	public static void main(String[] args) {
		
		//there are 3 ways to access package from outside the package
		//1-import package.*;
		//2-import package.className;
		//3-fully qualified name
		
		com.cybertek.package2.Class2 cl=new com.cybertek.package2.Class2();
		com.cybertek.package2.Class3 cl1=new com.cybertek.package2.Class3();

	}

}
