package Stack1;

	class Stack {
		String st[];
		int top;
		int size;

		public  Stack(int size) {
			st = new String[size];
			top = -1;
			this.size = size;
		}

		public  Stack() {
			st = new String[10];
			top = -1;
			size = 10;
		}

		public boolean push(String val ) {
	         if(isEmpty()) {
	             top+=1;
	             st[top]=val;
	             return true;
	         }
	         else {
	             if(!isFull()) {
	                 top+=1;
	                 st[top]=val ;
	                 return true;
	                 
	             }
	             else {
	                 System.out.println("stack is Full. ");
	                 return false;
	             }
	         }
	         
	     }

		public boolean isEmpty() {
			if (top == -1) {
				return true;
			} else {
				if (size > top) {
					return false;
				} else {
					return true;
				}
			}
		}

		public boolean isFull() {
			if (size < top) {
				return true;
			} else {
				return false;
			}
		}

		public String pop() {
			if(isEmpty()){
			return null;
			
			}
			return st[top];

		}
		public String peak() {
			if(top==-1) {
				System.out.println("is empty");
				return null;
		}
			else {
				return st[top];
			}
			
		}
	}
	

	