import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

//public class POSV {
//}
//
//
////class Solution {
////    public String minWindow(String s, String t) {
////        int n = s.length(), m = t.length();
////        if (n < m) return "";
////        int[] cnt = new int[150];
////        int k = 0;
////        for (char c : t.toCharArray()) {
////            if (++cnt[c] == 1) {
////                k++;
////            }
////        }
////        int l = 0, left = 0, right = 0;
////        for (int i = 0; i < s.length(); i++) {
////            char c = s.charAt(i);
////            if (--cnt[c] == 0) k--;
////            if (k == 0) {
////                while (cnt[s.charAt(l)] < 0) {
////                    ++cnt[s.charAt(l++)];
////                }
////                if (left == right || right - left > i - l + 1) {
////                    right = i + 1;
////                    left = l;
////                }
////            }
////        }
////        return s.substring(left, right);
////    }
////}
//
//class Solution {
//    public int numPrimeArrangements(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int countNP = 1;
//
//        for (int i = 2; i <= n; i++) {
//            int k = (int) Math.sqrt(i);
//            for (int j = 2; j <= k; j++) {
//                if (i % j == 0) {
//                    countNP++;
//                    break;
//                }
//            }
//        }
//        long res = 1;
//        for (int i = 1; i <= countNP; i++) {
//            res = (res * i) % 1000000007;
//        }
//        for (int i = 1; i <= n - countNP; i++) {
//            res = (res * i) % 1000000007;
//        }
//        return (int) res;
//    }
//}
//
//class Solution {
//    public List<List<Integer>> minimumAbsDifference(int[] arr) {
//        Arrays.sort(arr);
//        int minDif = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                minDif = Math.min(minDif, arr[j] - arr[i]);
//            }
//        }
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            List<Integer> tmp = new ArrayList<>();
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] - arr[i] == minDif) {
//                    tmp.add(arr[i]);
//                    tmp.add(arr[j]);
//                    break;
//                }
//            }
//
//            if (tmp.size() > 0) {
//                result.add(tmp);
//            }
//
//        }
//        return result;
//    }
//}
//
//class Solution {
//    public int[] smallestK(int[] arr, int k) {
//        Arrays.sort(arr);
//        int[] result = new int[k];
//        System.arraycopy(arr, 0, result, 0, k);
//        return result;
//
//    }
//}
//
//class Solution {
//    public int[] smallestK(int[] arr, int k) {
//        quickSort(arr, 0, arr.length - 1, k);
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = arr[i];
//        }
//        return result;
//    }
//
//    private static void quickSort(int[] arr, int startIndex, int endIndex, int k) {
//        if (startIndex >= endIndex) {
//            return;
//        }
//        int partitionIndex = quickSortPartition(arr, startIndex, endIndex);
//        if (partitionIndex == k) {
//            return;
//        }
//        if (k < partitionIndex) {
//            quickSort(arr, startIndex, partitionIndex - 1, k);
//        } else {
//            quickSort(arr, partitionIndex + 1, endIndex, k);
//        }
//    }
//
//    private static int quickSortPartition(int[] arr, int startIndex, int endIndex) {
//        int pivot = arr[endIndex];
//        int i = startIndex;
//        for (int j = startIndex; j <= endIndex - 1; j++) {
//            if (arr[j] < pivot) {
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                i++;
//            }
//        }
//        int temp = arr[endIndex];
//        arr[endIndex] = arr[i];
//        arr[i] = temp;
//        return i;
//    }
//}
//
//
//class MovingAverage {
//    List<Integer> list = new ArrayList<Integer>();
//    int size = 0;
//    int sum = 0;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MovingAverage(int size) {
//        this.size = size;
//    }
//
//    public double next(int val) {
//        list.add(val);
//        sum += val;
//        if (list.size() <= size) {
//
//            return (double) sum / list.size();
//        }
//        sum -= list.get(list.size() - size - 1);
//        return (double) sum / size;
//    }
//}
//
//class Solution {
//    public void rotate(int[][] matrix) {
//
////转置
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        if (m == 1) {
//            return;
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
////列转换
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n / 2; j++) {
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[i][n - j - 1];
//                matrix[i][n - j - 1] = tmp;
//            }
//        }
//    }
//}
//
//
//class Solution {
//    public int uniquePaths(int m, int n) {
//        if (m == 1 || n == 1) {
//            return 1;
//        }
//        int[][] ans = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            ans[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            ans[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
//            }
//        }
//        return ans[m - 1][n - 1];
//    }
//}
//
//class Solution {
//    public int minPathSum(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//
//        int[][] ans = new int[m][n];
//        int minPath = Integer.MAX_VALUE;
//        ans[0][0] = grid[0][0];
//        for (int i = 1; i < m; i++) {
//            ans[i][0] = ans[i - 1][0] + grid[i][0];
//        }
//        for (int i = 1; i < n; i++) {
//            ans[0][i] = ans[0][i - 1] + grid[0][i];
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                ans[i][j] = Math.min(ans[i - 1][j], ans[i][j - 1]) + grid[i][j];
//            }
//        }
//
//
//        return ans[m - 1][n - 1];
//    }
//}
//
//class Solution {
//    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
//
//        if (distance.length == 1) {
//            return 0;
//        }
//        int dis1 = 0;
//        int sum = 0;
//        int min = Math.min(start, destination);
//        int max = Math.max(start, destination);
//
//
//        for (int i = min; i < max; i++) {
//            dis1 += distance[i];
//        }
//        for (int i = 0; i < distance.length; i++) {
//            sum += distance[i];
//        }
//
//        return Math.min(dis1, sum - dis1);
//    }
//}


//class Solution {
//    public int[] arrayRankTransform(int[] arr) {
//        if (arr.length == 0) {
//            return new int[0];
//        }
//        if (arr.length == 1) {
//            return new int[]{1};
//        }
//        int[] res = new int[arr.length];
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < arr.length; i++) {
//            res[i] = arr[i];
//        }
//        Arrays.sort(res);
//
//        map.put(res[0], 1);
//        for (int i = 1; i < arr.length; i++) {
//
//            if (res[i] == res[i - 1]) {
//                map.put(res[i], map.get(res[i - 1]));
//            } else {
//                map.put(res[i], map.get(res[i - 1]) + 1);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//
//            res[i] = map.get(arr[i]);
//
//        }
//        return res;
//    }
//}


//class Solution {
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int maxLen = 0;
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//           if(!res.contains(nums[i])){
//               res.add(nums[i]);
//           }
//        }
//        if(res.size()==1){
//            return 1;
//        }
//        res.sort(Comparator.naturalOrder());
//        int count = 1;
//        for (int i = 1; i < res.size(); i++) {
//            if (res.get(i) == res.get(i - 1) + 1) {
//                count++;
//            } else {
//                maxLen = Math.max(maxLen, count);
//                count = 1;
//            }
//        }
//        maxLen = Math.max(maxLen, count);
//        return maxLen;
//    }
//}

//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> res = new HashSet<ListNode>();
//        while (head != null) {
//            if (!res.contains(head)) {
//                res.add(head);
//            } else {
//                return head;
//            }
//            head = head.next;
//        }
//        return null;
//    }
//}


//class Solution {
//    public ListNode sortList(ListNode head) {
//        if(head == null||head.next == null){
//            return head;
//        }
//
//
//        List<Integer> res = new ArrayList<Integer>();
//        ListNode node=new ListNode();
//        ListNode pre = node;
//        while(head != null){
//            res.add(head.val);
//            head = head.next;
//        }
//        res.sort(Comparator.naturalOrder());
//        for(int value : res){
//            ListNode cur=new ListNode(value);
//            pre.next = cur;
//            pre=cur;
//
//        }
//        return node.next;
//    }
//}
//class Solution {
//    public List<String> stringMatching(String[] words) {
//        List<String> result = new ArrayList<>();
//        if (words.length <= 1) {
//            return result;
//        }
//        for (int i = 0; i < words.length; i++) {
//            for (int j = i; j < words.length; j++) {
//                if (words[j].contains(words[i])) {
//                    result.add(words[i]);
//                }
//            }
//        }
//        return result;
//    }
//}

//class Solution {
//    public int numSquares(int n) {
//        int[] nums = new int[100];
//        for (int i = 0; i < 100; i++) {
//            nums[i] = (i + 1) * (i + 1);
//            if (n == nums[i]) {
//                return 1;
//            }
//        }
//        for (int i = 0; i < 99; i++) {
//            if (nums[i] < n && nums[i + 1] > n) {
//                return 1 + numSquares(n - nums[i]);
//            }
//        }
//        if (n > nums[99]) {
//            return 1 + numSquares(n - nums[99]);
//        }
//
//    }
//}