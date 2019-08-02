package com.tedu.sp01.pojo;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] arr= {78,12,25,34,55,11,23,56,1};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		int b = a(arr,78);
		System.out.println(b);
		
	}
	
	public static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j = 0;j < arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]){
					int a=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		
		return arr;
	}
	
	public static int a(int[] arr,int a) {
		int start=0;
		int end =arr.length-1;
		int index=-1;

		for(int i=0;i<arr.length;i++) {
			i=start+(end-start)/2;
			if(a==arr[i]) {
				index=i;
				return index;
			}
			
			if(a>arr[i]) {
				start=(end+1)/2+1;
				
			}
			if(a<arr[i]) {
				end=start-1;
			}
			
			
		}
		
		
		return index;
	}

}
