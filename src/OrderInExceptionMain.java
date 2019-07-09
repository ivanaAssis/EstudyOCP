public class OrderInExceptionMain {

	public static void main(String[] args) {
		int x = 10, y = 2;
		try{
			for (int z =2;z>=0;z--){
				int ans = x/z;
				System.out.print(ans+"");
			}
		}catch (Exception e1){
			System.out.print("E1");
		}catch (ArithmeticException e1){
			System.out.print("E1");
		}
	}
}
