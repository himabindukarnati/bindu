package ssis;
import java.util.ArrayList;
import java.util.Iterator;
	
 class Student1 {
		String name;
		int age;
		int id;
		Student1(String name,int age,int id)
		{
			this.name=name;
			this.age=age;
			this.id=id;
		}
		@Override
		public String toString() {
			return "Student1 [name=" + name + ", age=" + age + ", id=" + id + "]";
		}
		

	}
	public class Main{
		public static void main(String args[])
		{
			ArrayList <Student1> arr1=new ArrayList<Student1>();
			Student1 s1=new Student1("babu",22,2);
			Student1 s2=new Student1("karthik",22,2);
			Student1 s3=new Student1("manu",22,2);
			Student1 s4=new Student1("shashi",22,2);
			Student1 s5=new Student1("bhanu",22,2);
			arr1.add(s1);
			arr1.add(s2);
			arr1.add(s3);
			arr1.add(s4);
			arr1.add(s5);
//			for(int i=0;i<arr1.size();i++) {
//	        System.out.println(arr1.get(i).toString());
//			}
			Iterator<Student1> iterator = arr1.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
	       // System.out.println(s2.toString());
	       // System.out.println(s3.toString());
	       // System.out.println(s4.toString());
	       // System.out.println(s5.toString());
	        

			

		}
	}

