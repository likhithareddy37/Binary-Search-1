// Time Complexity :O(logn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int start=0;
        int end=1;
        
        while(reader.get(end)< target && reader.get(end)<Integer.MAX_VALUE)
        {
            start=end;
            end=end*2;
        }
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(reader.get(mid)==target)
            {
                return mid;
            }
            
            if(reader.get(mid)<target)
            {
                start=mid+1;
            }
            
            else
            {
                end=mid-1;
            }
        }
        
        return -1;
    }
}