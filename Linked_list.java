package Linked_list;

 class Node {
	
	int data;
	Node nextnode;
public Node(int data) {
		this.data=data;
	}
	
}
class Sll {
	Node head=null;
	Node tail=null;
	int size=0;
	public void insert(int data) {
		
		Node n=new Node(data);
		if(size==0) {
		head=n;
		size++;
        }
		else if(size>0){
			tail.nextnode=n;
		}
		tail=n;
		size++;
	}
		
		public void delete(int data) {
			if(size==0) {
				System.out.println("List is empty");
				return;
				}
			else {
				if(head.data==data) {
					head=head.nextnode;
					return;
				}
				Node prevnode=null;
				Node curnode=head;
				
				while(curnode.nextnode!=null){
					
				if(curnode.data==data){
				prevnode.nextnode=curnode.nextnode;
				size--;
				return;
			}
			else {
				prevnode=curnode;
				curnode=curnode.nextnode;
			}}
	
				if(curnode.data==tail.data) {
					tail=prevnode;
					size--;
					if(size==1) {
						head.nextnode=null;
					}
				}
				}
			}
				
	public void display() {
		if(size>0) {
			Node curnode=head;
			while(curnode.nextnode!=null) {
				System.out.println(curnode.data+"");
				curnode=curnode.nextnode;
			}
			System.out.println(curnode.data);
		}
		else {
			System.out.println("List is empty");
		}
	}
	public void gethead() {
		System.out.println(head.data);
	}
	
	public void gettail() {
		System.out.println(tail.data);
	}
	public void search() {
		
	}
	public void size() {
		System.out.println(size);
	}
}

	public class Linked_list{
		public static void main(String [] args) {
			Sll s1=new Sll ();
			s1.insert(1);
			s1.insert(2);
			s1.insert(4);
			s1.insert(9);
			
			s1.delete(4);
			s1.display();
			

		}

}
