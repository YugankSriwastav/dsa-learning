# Merge Sort

Merge Sort works on the Divide and Conquer approach.

First, we divide the array into two parts by finding the middle index.
Then we recursively divide both parts again and again until each subarray contains only one element.
When `low >= high`, it means the array cannot be divided further, so we return.

After all the divisions are complete, the merging process starts.

During merging, we have two sorted subarrays. 
One pointer starts from the left subarray and another pointer starts from the right subarray.
We compare both values and store the smaller one in a temporary array. 
If one subarray gets finished first, w
e simply copy the remaining elements of the other subarray into the temporary array.

Finally, we copy all elements from the temporary array back to the original array.

Time Complexity: `O(n log n)`
because the array is divided `log n` times and at every level we process all `n` elements during merging.

Space Complexity: `O(n)`
because we use an extra temporary array while merging.
