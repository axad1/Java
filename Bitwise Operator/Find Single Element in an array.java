class Main{
	public static void main(String args[]){
		int a[] = {1,2,5,2,1};
		int res = 0;
		for(int i=0; i<a.length; i++){
			res = res ^ a[i];
		}

		System.out.println("res = " + res);
	}
}