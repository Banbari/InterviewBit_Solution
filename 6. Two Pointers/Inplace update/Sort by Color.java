public class Solution {
    static ArrayList<Integer> a=null;
    static ArrayList<Integer> b=null;
    static void merging(int low, int mid, int high) {
   int l1, l2, i;

   for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
      if(a.get(l1)<=a.get(l2))
         b.set(i,a.get(l1++));
      else
         b.set(i, a.get(l2++));
   }
   
   while(l1 <= mid)    
      b.set(i++,a.get(l1++));

   while(l2 <= high)   
      b.set(i++, a.get(l2++));

   for(i = low; i <= high; i++)
      a.set(i, b.get(i));
}

static void sort(int low, int high) {
   int mid;
   
   if(low < high) {
      mid = (low + high) / 2;
      sort(low, mid);
      sort(mid+1, high);
      merging(low, mid, high);
   } else { 
      return;
   }   
}
	public void sortColors(ArrayList<Integer> a) {
	    this.a=a;
	    this.b=new ArrayList(a.size());
	    for(int i=0;i<a.size();i++)
	    b.add(-1);
	    sort(0,a.size()-1);
	    
	}
}
