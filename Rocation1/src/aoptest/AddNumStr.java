package aoptest;

public class AddNumStr {

	private String outStr = "私はアウター";


	public String addExecute(String str1, String str2){
		String newStr = str1 + str2;
		return newStr;
	}


	public void InnerExecute() {

		class InnerClass{
			void print() {
				String innerStr = "私はインナークラス";
				System.out.println(innerStr);
				System.out.println("そして、"+outStr);
			}
		}

		InnerClass inner = new InnerClass();
		inner.print();
	}



}
