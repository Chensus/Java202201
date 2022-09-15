//package com.java;
//
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//import static java.util.Arrays.binarySearch;
//
//public class Leetcode {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
////        System.out.println();
////        String paragraph ="Bob. hIt, baLl";
////        String[] banned = {"bob","hit"};
////        System.out.println(solution.mostCommonWord(paragraph, banned));
////
////        System.out.println(solution.convertToTitle(26));
////        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
////        System.out.println(solution.sortedArrayToBST(nums));
////
//   }
//}
//
//
//class Solution345 {
//    public String reverseVowels(String s) {
//        if (s.length() <= 1) {
//            return s;
//        } else {
//            String[] strArray = s.split("");
//            int i = 0, j = s.length() - 1;
//            while (i < j) {
//                if ("a".equals(strArray[i]) || "e".equals(strArray[i]) || "i".equals(strArray[i]) || "o".equals(strArray[i]) ||
//                        "u".equals(strArray[i]) || "A".equals(strArray[i]) || "E".equals(strArray[i]) || "I".equals(strArray[i]) ||
//                        "O".equals(strArray[i]) || "U".equals(strArray[i])) {
//                    if ("a".equals(strArray[j]) || "e".equals(strArray[j]) || "i".equals(strArray[j]) || "o".equals(strArray[j]) ||
//                            "u".equals(strArray[j]) || "A".equals(strArray[j]) || "E".equals(strArray[j]) || "I".equals(strArray[j]) ||
//                            "O".equals(strArray[j]) || "U".equals(strArray[j])) {
//                        String temp = strArray[i];
//                        strArray[i] = strArray[j];
//                        strArray[j] = temp;
//                        i++;
//                        j--;
//                    } else {
//                        j--;
//                    }
//                } else {
//                    i++;
//                }
//            }
//            StringBuilder result = new StringBuilder();
//            for (String str : strArray) {
//                result.append(str);
//            }
//            return result.toString();
//        }
//    }
//}
//
//
//class Solution349 {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        if (nums1.length == 0 && nums2.length == 0) {
//            return new int[0];
//        } else {
//            HashSet<Integer> set1 = new HashSet<Integer>();
//            HashSet<Integer> set2 = new HashSet<Integer>();
//            for (int num1 : nums1) {
//                set1.add(num1);
//            }
//            for (int num2 : nums2) {
//                set2.add(num2);
//            }
//            result.addAll(set1);
//            result.retainAll(set2);
//            int[] intersec = new int[result.size()];
//            for (int i = 0; i < result.size(); i++) {
//                intersec[i] = result.get(i);
//            }
//            return intersec;
//        }
//    }
//}
//
//class Solution349a {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        if (nums1.length == 0 && nums2.length == 0) {
//            return new int[0];
//        } else {
//            HashSet<Integer> set1 = new HashSet<Integer>();
//
//            for (int num1 : nums1) {
//                set1.add(num1);
//            }
//            for (int num2 : nums2) {
//                if (set1.contains(num2)) {
//                    result.add(num2);
//                }
//            }
//            int[] intersec = new int[result.size()];
//            for (int i = 0; i < result.size(); i++) {
//                intersec[i] = result.get(i);
//            }
//            return intersec;
//        }
//    }
//}
//
//class Solution883 {
//    public int projectionArea(int[][] grid) {
//        if (grid.length == 0) {
//            return 0;
//        } else {
//            int S = 0;
//
//            int[] arr = new int[grid[0].length];
//            for (int i = 0; i < grid.length; i++) {
//                int maxY = 0;
//                for (int j = 0; j < grid[i].length; j++) {
//                    if (grid[i][j] != 0) {
//                        S++;
//
//                        maxY = Math.max(maxY, grid[i][j]);
//                        arr[j] = Math.max(arr[j], grid[i][j]);
//                    }
//                }
//                S += maxY;
//            }
//            for (int a : arr) {
//                S += a;
//            }
//            return S;
//        }
//    }
//}
//
//class Solution476 {
//    public int findComplement(int num) {
//        int temp = num, c = 0;
//        while (temp > 0) {
//            temp >>= 1;
//            c = (c << 1) + 1;
//        }
//        return num ^ c;
//    }
//}
//
//class Solution463 {
//    public int islandPerimeter(int[][] grid) {
//        //重点关注前面遍历过得方格，如果之前有相邻方格，就-2;
//        if (grid == null || grid.length == 0) {
//            return 0;
//        }
//        int rsp = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] == 1) {
//                    rsp += 4;
//                    if (i > 0 && grid[i - 1][j] == 1) {
//                        rsp -= 2;
//                    }
//                    if (j > 0 && grid[i][j - 1] == 1) {
//                        rsp -= 2;
//                    }
//                }
//            }
//        }
//        return rsp;
//    }
//}
//
//class Solution541 {
//    public String reverseStr(String s, int k) {
//        if (s.length() <= k) {
//            StringBuilder sb = new StringBuilder(s);
//            return sb.reverse().toString();
//        } else if (s.length() <= 2 * k) {
//            StringBuilder sb = new StringBuilder(s.substring(0, k + 1));
//            return sb.reverse().toString() + s.substring(k + 1, s.length());
//        } else {
//            int model2k = s.length() % (2 * k);
//            int endindex = s.length() - model2k;
//            StringBuilder res = new StringBuilder();
//            for (int i = 0; i <= endindex - 2 * k; i = i + 2 * k) {
//                StringBuilder sb = new StringBuilder(s.substring(i, k + i));
//                res.append(sb.reverse().toString()).append(s.substring(i + k, i + 2 * k));
//            }
//            return res.toString() + reverseStr(s.substring(endindex, s.length()), k);
//        }
//    }
//
//
//    class Solution905 {//双指针，找好判断条件
//
//        public int[] sortArrayByParity(int[] nums) {
//            if (nums.length == 1) {
//                return nums;
//            }
//            int i = 0;
//            int j = nums.length - 1;
//            while (i <= j) {
//                if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                    i++;
//                    j--;
//                } else if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
//                    i++;
//                    j--;
//                } else if (nums[i] % 2 == 1 && nums[j] % 2 == 1) {
//                    j--;
//                } else {
//                    i++;
//                }
//            }
//            return nums;
//        }
//    }
//}
//
//class Solution520 {
//    public boolean detectCapitalUse(String word) {
//        if (word.length() == 1) {
//            return true;
//        }
//        char[] abc = word.toCharArray();
//        int lnum = 0;
//        int unum = 0;
//        for (int i = 0; i < abc.length; i++) {
//            if (abc[i] >= 'a' && abc[i] <= 'z') {
//                lnum++;
//            }
//            if (abc[i] >= 'A' && abc[i] <= 'Z') {
//                unum++;
//            }
//        }
//        boolean foundA = false;
//        if (unum > 1 && unum < abc.length) {
//            foundA = false;
//        } else if (unum == 1) {
//            foundA = abc[0] >= 'A' && abc[0] <= 'Z';
//        } else {
//            foundA = true;
//        }
//
//        return lnum == abc.length || unum == abc.length || foundA;
//    }
//}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//class Solution617 {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//
//        if (root1 == null && root2 == null) {
//            return null;
//        } else if (root1 != null && root2 == null) {
//            return root1;
//        } else if (root1 == null) {
//            return root2;
//        } else {
//            TreeNode merge = new TreeNode();
//            merge.val = root1.val + root2.val;
//            merge.left = mergeTrees(root1.left, root2.left);
//            merge.right = mergeTrees(root1.right, root2.right);
//            return merge;
//        }
//    }
//}
//
//class Solution637 {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> avg = new ArrayList<Double>();
//        if (root == null) {
//            return avg;
//        } else if (root.left == null && root.right == null) {
//            avg.add((double) root.val);
//            return avg;
//        } else if (root.left != null && root.right == null) {
//            avg.add((double) root.val);
//            avg.addAll(averageOfLevels(root.left));
//            return avg;
//        } else if (root.left == null) {
//            avg.add((double) root.val);
//            avg.addAll(averageOfLevels(root.right));
//            return avg;
//        } else {
//
//            avg.add((double) root.val);
//            avg.add((double) (root.left.val + root.right.val) / 2);
////此时每层平均值怎么加？？？
//            return avg;
//        }
//    }
//}
//
//class Solution637queue {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> res = new ArrayList<>();
//        if (root == null) return res;
//        Queue<TreeNode> list = new LinkedList<>();
//        list.add(root);
//        while (list.size() != 0) {
//            int len = list.size();
//            double sum = 0;
//            for (int i = 0; i < len; i++) {
//                TreeNode node = list.poll();
//                sum += node.val;
//                if (node.left != null) list.add(node.left);
//                if (node.right != null) list.add(node.right);
//            }
//            res.add(sum / len);
//        }
//        return res;
//    }
//}
//
//class Node {
//    public boolean val;
//    public boolean isLeaf;
//    public Node topLeft;
//    public Node topRight;
//    public Node bottomLeft;
//    public Node bottomRight;
//
//
//    public Node() {
//        this.val = false;
//        this.isLeaf = false;
//        this.topLeft = null;
//        this.topRight = null;
//        this.bottomLeft = null;
//        this.bottomRight = null;
//    }
//
//    public Node(boolean val, boolean isLeaf) {
//        this.val = val;
//        this.isLeaf = isLeaf;
//        this.topLeft = null;
//        this.topRight = null;
//        this.bottomLeft = null;
//        this.bottomRight = null;
//    }
//
//    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
//        this.val = val;
//        this.isLeaf = isLeaf;
//        this.topLeft = topLeft;
//        this.topRight = topRight;
//        this.bottomLeft = bottomLeft;
//        this.bottomRight = bottomRight;
//    }
//};
//
//class Solution427 {
//     /*
//        递归
//
//        整个过程都是先检查大方块是否是叶子节点，如果是叶子节点则结束
//        如果不是叶子节点则分成四个小方块继续进行上一步
//        直到找到所有叶子节点
//
//        执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//        内存消耗：41.7 MB, 在所有 Java 提交中击败了31.12%的用户
//    */
//
//
//    int[][] grid;
//    Node root = new Node();
//
//    public Node construct(int[][] grid) {
//        this.grid = grid;
//        getNode(root, 0, grid.length, 0, grid[0].length);
//        return root;
//    }
//
//    Node getNode(Node node, int top, int bottom, int left, int right) {
//        if (top + 1 == bottom || isLeaf(top, bottom, left, right)) {
//            node.val = grid[top][left] != 0;
//            node.isLeaf = true;
//            return node;
//        }
//        node.val = true;
//
//        int tmpRight = (right + left) >> 1, tmpBottom = (bottom + top) >> 1;
//
//        node.topLeft = getNode(new Node(), top, tmpBottom, left, tmpRight);
//        node.topRight = getNode(new Node(), top, tmpBottom, tmpRight, right);
//        node.bottomLeft = getNode(new Node(), tmpBottom, bottom, left, tmpRight);
//        node.bottomRight = getNode(new Node(), tmpBottom, bottom, tmpRight, right);
//
//        return node;
//    }
//
//    boolean isLeaf(int top, int bottom, int left, int right) {
//        int sum = 0;
//        for (int i = top; i < bottom; i++) {
//            for (int j = left; j < right; j++) {
//                sum += grid[i][j];
//            }
//        }
//        return sum == 0 || sum == (bottom - top) * (right - left);
//    }
//}
//
//class Solution501 {
//    int preVal = 0, curTimes = 0, maxTimes = 0;
//    ArrayList<Integer> list = new ArrayList<Integer>();
//
//    public int[] findMode(TreeNode root) {
//        traversal(root);
//        //list转换为int[]
//        int size = list.size();
//        int[] ans = new int[size];
//        for (int i = 0; i < size; i++) {
//            ans[i] = list.get(i);
//        }
//        return ans;
//    }
//
//    //二叉搜索树中序遍历是递增顺序
//    public void traversal(TreeNode root) {
//        if (root != null) {
//            traversal(root.left);
//            //判断当前值与上一个值的关系, 更新 curTimes 和 preVal
//            if (preVal == root.val) {
//                curTimes++;
//            } else {
//                preVal = root.val;
//                curTimes = 1;
//            }
//            //判断当前数量与最大数量的关系, 更新 list 和 maxTimes
//            if (curTimes == maxTimes) {
//                list.add(root.val);
//            } else if (curTimes > maxTimes) {
//                list.clear();
//                list.add(root.val);
//                maxTimes = curTimes;
//            }
//            traversal(root.right);
//        }
//    }
//}
//
//class Solution917 {
//    public String reverseOnlyLetters(String s) {
//        StringBuilder sb = new StringBuilder();
//        StringBuilder nsb = new StringBuilder(s);
//        ArrayList<Integer> index = new ArrayList<Integer>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                sb.append(s.charAt(i));
//                index.add(i);
//            }
//        }
//        String abc = sb.reverse().toString();
//        for (int i = 0; i < index.size(); i++) {
//            nsb.setCharAt(index.get(i), abc.charAt(i));
//        }
//        return nsb.toString();
//    }
//}
//
//class Solution108 {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums.length == 0) {
//            return null;
//        } else if (nums.length == 1) {
//            return new TreeNode(nums[0]);
//        } else {
//            int n = nums.length;
//            TreeNode root = new TreeNode(nums[n / 2]);
//            int[] numsleft = new int[n / 2];
//            int[] numsright = new int[n - n / 2 - 1];
//            for (int i = 0; i < n; i++) {
//                if (i < n / 2) {
//                    numsleft[i] = nums[i];
//                }
//                if (i > n / 2) {
//                    numsright[i - n / 2 - 1] = nums[i];
//                }
//            }
//            root.left = sortedArrayToBST(numsleft);
//            root.right = sortedArrayToBST(numsright);
//            return root;
//        }
//    }
//}
//
////class Solution599 {//今天这道题比较简单。
////    //首先，观察题目给定的范围，list1 和 list2 的长度不超过 1000，所以，我们可以考虑使用暴力来求解。
////
////    //使用暴力的话，我们需要记录 最小索引和，具体地，我们可以先遍历 list1，再在 list2 中找到相同的字符串，
////    // 如果存在，则让两者的索引相加，与最小索引和对比，如果小，则替换之并清除结果集且把当前值加入结果集，如果相等，则加入结果集。
////
////    public String[] findRestaurant(String[] list1, String[] list2) {
////        List<String> ans = new ArrayList<>();
////        int n1 = list1.length, n2 = list2.length;
////        int min = Integer.MAX_VALUE;
////        for (int i = 0; i < n1; i++) {
////            for (int j = 0; j < n2; j++) {
////                if (list1[i].equals(list2[j])) {
////                    if (i + j == min) {
////                        ans.add(list1[i]);
////                    } else if (i + j < min) {
////                        min = i + j;
////                        ans.clear();
////                        ans.add(list1[i]);
////                    }
////                }
////            }
////        }
////        return (String[]) ans.toArray(new String[0]);
////    }
////
////    public String[] findRestaurant1(String[] list1, String[] list2) {
////        return IntStream.range(0, list1.length + list2.length)
////                .boxed()
////                .collect(Collectors.groupingBy(i -> i < list1.length ? list1[i] : list2[i - list1.length]))
////                .entrySet()
////                .stream()
////                .filter(entry -> entry.getValue().size() == 2)
////                .collect(Collectors.groupingBy(entry -> entry.getValue().get(0) + entry.getValue().get(1), TreeMap::new, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
////                .values()
////                .iterator()
////                .next()
////                .toArray(new String[0]);
////    }
////}
////
////
////class Solution599leetcode {//
////
////    public String[] findRestaurant(String[] list1, String[] list2) {
////        Map<String, Integer> index = new HashMap<String, Integer>();
////        for (int i = 0; i < list1.length; i++) {
////            index.put(list1[i], i);
////        }
////
////        List<String> ret = new ArrayList<String>();
////        int indexSum = Integer.MAX_VALUE;
////        for (int i = 0; i < list2.length; i++) {
////            if (index.containsKey(list2[i])) {
////                int j = index.get(list2[i]);
////                if (i + j < indexSum) {
////                    ret.clear();
////                    ret.add(list2[i]);
////                    indexSum = i + j;
////                } else if (i + j == indexSum) {
////                    ret.add(list2[i]);
////                }
////            }
////        }
////        return ret.toArray(new String[ret.size()]);
////    }
////}}
//
////class Solution {
////    int sum = 0;
////
////    public int findTilt(TreeNode root) {
////        if (root == null) {
////            return 0;
////        } else if (root.left == null && root.right == null) {
////            return 0;
////        } else {
////            getValue(root);
////            return sum;
////        }
////    }
////
////    public int getValue(TreeNode root) {
////        if (root == null) {
////            return 0;
////        } else if (root.left == null ||root.right == null) {
////            return 0;
////        }
////        else {
////            int left=0;
////            left+=root.left==null||root.right== null?root.val:0;
////
////        }
////    }
////}




