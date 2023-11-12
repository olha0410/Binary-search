public int binarySearch(int element, int[] list) {
    int left = 0;
    int right = list.length;
    if (element > list.length-1) {
      return -1;
    }
    while (left <= right){
      int center = (left + right)/2;
      if (list[center] < element) {
        left = center+1;
      } else {if (list[center] > element) {
                right = center-1;
                } else {
                  return center+1;
                }
      }
     }
   return -1;
  }