A part of a sorted array is misplaced, we need to find the index of the minimum of the array.
E.g. The answer for {8,9,10,11,5,6} is 4(the index of 5).
* idea: Recursively compare the leftmost(a) and rightmost(b) number of the subarrays, if a>b means the slash is in the right subarray and vice versa.
  
