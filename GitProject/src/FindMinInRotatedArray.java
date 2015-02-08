
public class FindMinInRotatedArray
{
	
public int findMin(int[] A)
{
if(A==null) return 0;
int mid = A.length/2;
int last = A.length-1;
if(A[mid]>A[last]) return binarySearch(A,mid,last);
else return binarySearch(A,0,mid);

}

public int binarySearch(int[] A, int mid, int last)
{
int newMid = (mid+last)/2;
if(newMid == last) return A[mid];
if(A[mid] < A[mid+1]) return A[mid];
else if(mid+1 == last) return A[last];
else return binarySearch(A,newMid,last);
}

public static void main(String[] s)
{

	// reset point in 2nd half
	int[] A = {4,5,6,7,1,2};
	// reset point at the last
	int[] A1 = {5,6,7,-1};
	//reset point in the first half
	int[] A2 = {5,1,2,3,4};
	// reset point at first element
	int[] A3 = {1,2,3,4};
	FindMinInRotatedArray f = new FindMinInRotatedArray();
    System.out.println("result for A = "+f.findMin(A));
    System.out.println("result for A1 = "+f.findMin(A1));
    System.out.println("result for A2 = "+f.findMin(A2));
    System.out.println("result for A3 = "+f.findMin(A3));
}



}