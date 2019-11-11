import java.util.Random;
import java.util.Scanner;

public class SortingStuff {
	int mergeSwaps = 0, quickSwaps = 0;
	
	public void runStuff(String sort) {
		int[] numList;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int input, size;
		
		System.out.println("How long would you like the list of numbers to be?\n1) 10\n2) 100\n3) 1000");
		input = sc.nextInt();
		
		//Select size of array
		
		switch(input) {
		case 1:
			size = 10;
			break;
		case 2:
			size = 100;
			break;
		case 3:
			size = 1000;
			break;
		default:
			System.out.println("Invalid option");
			return;
		}
		
		numList = new int[size];
		
		System.out.print("Original Array: [");
		for(int i = 0; i < numList.length; i++) { //Fill and print out original random array
			numList[i] = rand.nextInt(numList.length - 1);
			if(i != numList.length - 1) {
				System.out.print(numList[i] + ", ");
			}
		}
		System.out.println(numList[numList.length-1] + "]");
		
		switch(sort) { //Select which sorting algorithm to use
		case "bubble":
			System.out.println("Sorting with bubble sort");
			bubbleSort(numList);
			break;
		case "insertion":
			System.out.println("Sorting with insertion sort");
			insertionSort(numList);
			break;
		case "selection":
			System.out.println("Sorting with selection sort");
			selectionSort(numList);
			break;
		case "merge":
			System.out.println("Sorting with merge sort");
			mergeSort(numList, 0);
			break;
		case "quick":
			System.out.println("Sorting with quick sort");
			quickSort(numList, 0, numList.length-1, 0);
			break;
		case "sequential":
			System.out.println("What number would you like to search for?");
			int n = sc.nextInt();
			sequentialSearch(numList, n);
			break;
		case "binary":
			System.out.println("What number would you like to search for?");
			int x = sc.nextInt();
			numList = bubbleSort(numList);
			binarySearch(numList, x);
		}
	}
	
	public int[] bubbleSort(int[] arr) { //Sort the list using the bubble sort algorithm
		int swaps = 0;
		 for(int i=0; i < arr.length; i++){  //Every element in list
             for(int j=1; j < (arr.length-i); j++){  //Move element to correct position
            	 if(arr[j-1] > arr[j]){
            		 swap(arr, j, j-1);  
            		 swaps++;
            	 }         
             }
		 }
		 printArray(arr, swaps);
		 return arr;
	}
	
	public void insertionSort(int[] arr) {
		int x, temp, swaps = 0;

		for (int i = 1; i < arr.length; i++) {  //For every element in the array
			temp = arr[i];  
			x = i-1;  
			
			while ((x > -1) && (arr[x] > temp)) { //Move element down to the correct location on the list 
				arr[x+1] = arr[x];  
				x--;
				swaps++;
			}  
			arr[x+1] = temp;
			swaps++;
		}
		
		printArray(arr, swaps);
	}
	
	public void selectionSort(int[] arr) {
		int smallest, swaps = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {  //For every element in the array
           smallest = i;  
           
            for (int j = i + 1; j < arr.length; j++){  // Find the smallest element
                if (arr[j] < arr[smallest]) {  
                    smallest = j;
                }  
            } 
            
            swap(arr, smallest, i);
            swaps++;
        }
		
		printArray(arr, swaps);
	}
	
	public void mergeSort(int[] arr, int depth) {
		
		 if (arr.length < 2) { //List is of length one, already sorted
		        return;
		    }
		    int mid = arr.length / 2;
		    int[] l = new int[mid];
		    int[] r = new int[arr.length - mid];
		 
		    for (int i = 0; i < mid; i++) {
		        l[i] = arr[i];
		        mergeSwaps++;
		    }
		    for (int i = mid; i < arr.length; i++) {
		        r[i - mid] = arr[i];
		        mergeSwaps++;
		    }
		    //Recurse with the two sides
		    mergeSort(l, depth+1); 
		    mergeSort(r, depth+1);
		 
		    merge(arr, l, r, mid, arr.length - mid);
		    
		    //If the original function call returns
		    if(depth == 0) {
		    	printArray(arr, mergeSwaps);
		    }
	}
	
	public void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	            mergeSwaps++;
	        }
	        else {
	            a[k++] = r[j++];
	            mergeSwaps++;
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	        mergeSwaps++;
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	        mergeSwaps++;
	    }
	}
	
	public void quickSort(int[] arr, int start, int end, int depth){
		 
        int partition = partition(arr, start, end);
 
        if(partition-1 > start) {
            quickSort(arr, start, partition-1, depth+1);
        }
        
        if(partition+1 < end) {
            quickSort(arr, partition+1, end, depth+1);
        }
        
        if(depth == 0) {
        	printArray(arr, quickSwaps);
        }
    }
 
    public int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i = start; i < end; i++){
            if(arr[i] < pivot) {
                int temp= arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
 
        swap(arr, start, end);
        quickSwaps++;
 
        return start;
    }
    
    public void sequentialSearch(int[] arr, int num) {
    	for(int i = 0; i < arr.length; i++) { //Loop through all elements in the array
    		if(arr[i] == num) {
    			System.out.println("The element at index " + i + " is " + num);
    			return;
    		}
    	}
    	//If the number is not found
		System.out.println(num + " not found");
    }
    
    public void binarySearch(int[] arr, int num) {
    	int left = 0;
    	int right = arr.length-1;
    	int midpoint;
    	
    	while(left <= right) {
    		midpoint = (left + right) / 2;
    		
    		if(arr[midpoint] == num) {
    			System.out.println(num + " was found at index " + midpoint);
    			return;
    		}
    		else if(arr[midpoint] < num) {
    			left = midpoint + 1;
    		}
    		else {
    			right = midpoint - 1;
    		}
    	}
    	System.out.println("The number " + num + " was not found");
    }
	
	public void swap(int[] arr, int x, int y) { //Swapping two elements of an array
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public void printArray(int[] arr, int swaps) {
		
		System.out.print("New Array: [");
		for(int i = 0; i < arr.length; i++) { //Print new sorted array
			if(i != arr.length-1) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println(arr[arr.length-1] + "]");
		System.out.println("Swaps made: " + swaps);
	}
}
