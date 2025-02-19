class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
         List<Integer> ans=new ArrayList<>();
         int[] rm=new int[m.length];
         int[] cm=new int[m[0].length];
         for(int i=0;i<m.length;i++){
            rm[i]=Integer.MAX_VALUE;
            for(int j=0;j<m[0].length;j++){
                rm[i]=Math.min(m[i][j],rm[i]);
            }
         }
         for(int i=0;i<m[0].length;i++){
            cm[i]=Integer.MIN_VALUE;
            for(int j=0;j<m.length;j++){
                cm[i]=Math.max(m[j][i],cm[i]);
            }
         
         }
         System.out.println(Arrays.toString(rm));
         System.out.print(Arrays.toString(cm));
         for(int i=0;i<rm.length;i++){
            for(int j=0;j<cm.length;j++)
            if(rm[i]==cm[j]) ans.add(rm[i]);
         }
        
         return ans;

    }
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort - N Rectangles
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] l=new int[n];
		int[] b=new int[n];
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    l[i]=sc.nextInt();
		    b[i]=sc.nextInt();
		    ar[i]=l[i]*b[i];
		}
		sort(l,b,ar);
		String[] ans=new String[n];
		for(int i=0;i<n;i++){
		    ans[i]=l[i]+" "+b[i]+" "+ar[i];
		}
		
		Arrays.sort(ans);
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(ans[j].equals("")) continue;
		     if(Integer.parseInt(ans[j].split(" ")[2])==ar[i])   
		    {
		System.out.println(ans[j]);ans[j]="";break;
}}}
	}
	static void sort(int[] le,int[] br,int[] ar){
	    for(int i=0;i<ar.length;i++){
	        for(int j=i+1;j<ar.length;j++){
	            if(ar[i]>ar[j]){
	                swap(ar,i,j);
	                swap(br,i,j);
	                swap(le,i,j);
	            }
	        }
	    }
	}
	static void swap(int[] ar,int i,int j){
	    int t=ar[i];
	    ar[i]=ar[j];
	    ar[j]=t;
	}
}
