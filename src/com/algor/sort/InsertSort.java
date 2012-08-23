package com.algor.sort;

import com.util.Print;

public class InsertSort {
	
	/**
	 * ������ץ��ʱÿ��ץ����һ���Ʋ��뵽���ʵ�λ����
	 * 
	 * @param intArray �����������
	 */
	public static int[] insertSort(int[] intArray){
		int length = intArray.length;
		
		for(int j = 1; j < length; j++){
			int key = intArray[j];
			
			int i = j - 1;
			while(i >= 0 && intArray[i] > key){
				intArray[i+1] = intArray[i];
				--i;
			}
			intArray[i+1] = key;
		}
		
		return intArray;
	}
	
	public static void main(String[] args) {
		int[] intArray = {25,23,56,37,98,4,86,457};
		
		for(int i : insertSort(intArray)){
			Print.print(i+" ");
		}
		
	}

}
