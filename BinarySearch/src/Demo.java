
public class Demo {
	public static void search(int arr[],int key) {
		int low = 0;
		int high = arr.length-1; 
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key == arr[mid]) {
				System.out.println("Key Found at : "+mid);
				return;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println("Key Not Found..!");
	}
}
