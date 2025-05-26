public static ArrayList<Integer> occur(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        int last = -1;
        ArrayList<Integer> res = new ArrayList<>();
        while (start<=end) {
            int mid = (end - start)/2 + start;
            if (target == arr[mid]) {
                first = end;
                end = mid - 1;
                last = start;
                start = mid + 1;
                res.add(first);
                res.add(last);
            }
        }
        return res;
    }