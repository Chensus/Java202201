//package com.java;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//import static java.util.Arrays.binarySearch;
//import static java.util.Arrays.sort;
//import static java.util.stream.Collectors.toList;
//
//public class exercise2 {
//
//    public static void main(String[] args){
//        int a=59/7;
//        int b=59%7;
//        System.out.println(a);
//        System.out.println(b);
//
//
//    }
//
//
//}
//class Solution00 {
//    public int romanToInt(String s) {
//        int val = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            switch (s.charAt(i)) {
//
//                case 'M':
//                    val += 1000;
//                    break;
//                case 'D':
//                    val += 500;
//                    break;
//                case 'C':
//                    val += 100 * (val >= 500 ? -1 : 1);
//                    break;
//                case 'L':
//                    val += 50;
//                    break;
//                case 'X':
//                    val += 10 * (val >= 50 ? -1 : 1);
//                    break;
//                case 'V':
//                    val += 5;
//                    break;
//                case 'I':
//                    val += (val >=5 ? -1 : 1);
//                    break;
//                default :
//                    break;
//            }
//
//        }
//        return val;
//    }
//
//}
//
//
//class Solution0 {
//    public String longestCommonPrefix(String[] strs) {
//        int lengthStr = strs[0].length();
//
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() < lengthStr) {
//                lengthStr = strs[i].length();
//            }
//
//        }
//        StringBuffer lcp=new StringBuffer(lengthStr);
//        boolean flag = true;
//        for (int j = 0; j < lengthStr; j++) {
//            for (int i = 0; i < strs.length; i++) {
//                if (strs[i].charAt(j) != strs[0].charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                lcp.append(strs[0].charAt(j));
//            } else {
//                break;
//            }
//
//
//        }
//
//        return  lcp.toString();
//    }
//}
//class Solution1 {
//    public static int[] twoSum(int[] nums, int target) {
//        int []indx = new int[2];
//        for(int i=0;i<nums.length;i++) {
//            for(int j=0;j<nums.length;j++) {
//                if(nums[i]+nums[j]==target)
//                {
//                    indx[0]=i;
//                    indx[1]=j;
//                }
//            }
//
//        }
//
//        return indx;
//
//
//    }
//};
//
//class Solution2 {
//    public boolean isPalindrome(int x) {
//        String  strx=String.valueOf(x);
//        boolean flag=true;
//        for(int i=0;i<strx.length();i++){
//            if(strx.charAt(i)!=strx.charAt(strx.length()-i-1)){
//                flag=false;
//            }
//        }
//        return flag;
//    }
//}
//
//
//class Solution3 {
//    public int reverse(int x) {
//        if (x==-2147483648){
//            return 0;
//        }
//        else{
//            int absx=Math.abs(x);
//            double intx= 0;
//
//
//            System.out.println(absx);
//            String strx = String.valueOf(absx);
//            StringBuffer mstrx = new StringBuffer(strx);
//            mstrx.reverse();
//
//            intx = Double.valueOf(mstrx.toString());
//
//            System.out.println(intx);
//            if(intx>Integer.MAX_VALUE){
//                intx=0;
//            } else if (x<0) {
//                intx=-intx;
//
//            }
//            return (int)intx;
//        }
//    }
//}
//
//
//class Solution20 {
//    public boolean isValid(String s) {
//
//        if (s.length() % 2 != 0) {
//            return false;
//        } else {
//            StringBuilder stackstr = new StringBuilder(s.length());
//            for (int i = 0; i < s.length(); i++) {
//                switch (s.charAt(i)) {
//                    case '(': {
//                        stackstr.append("(");
//                        break;
//                    }
//                    case '[': {
//                        stackstr.append("[");
//                        break;
//                    }
//                    case '{': {
//                        stackstr.append("{");
//                        break;
//                    }
//                    case ')': {
//                        stackstr.append(")");
//                        if (stackstr.length() > 1 && stackstr.charAt(stackstr.length() - 2) == '(') {
//                            stackstr.delete(stackstr.length() - 2, stackstr.length());
//                        }
//                        break;
//                    }
//                    case ']': {
//                        stackstr.append("]");
//
//                        if (stackstr.length() > 1 && stackstr.charAt(stackstr.length() - 2) == '[') {
//                            stackstr.delete(stackstr.length() - 2, stackstr.length());
//                        }
//                        break;
//                    }
//                    case '}': {
//                        stackstr.append("}");
//
//                        if (stackstr.length() > 1 && stackstr.charAt(stackstr.length() - 2) == '{') {
//                            stackstr.delete(stackstr.length() - 2, stackstr.length());
//                        }
//                        break;
//                    }
//                    default:
//                        break;
//                }
//
//            }
//            return stackstr.length() == 0;
//
//
//        }
//    }
//
//}
////class ListNode {
////    int val;
////    ListNode next;
////
////    ListNode() {
////    }
////
////    ListNode(int val) {
////        this.val = val;
////    }
////
////    ListNode(int val, ListNode next) {
////        this.val = val;
////        this.next = next;
////    }
////}
//class Solution21 {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode mergeList= new ListNode(0);
//        ListNode  newList =mergeList;
//        while (list1!= null && list2!= null) {
//            if (list1.val <=list2.val) {
//                newList.next= list1;
//                newList = newList.next;
//                list1 = list1.next;
//            } else {
//                newList.next = list2;
//                newList = newList.next;
//                list2 = list2.next;
//            }
//
//
//        }
//        if (list1!= null) {
//
//
//            newList.next=list1;
//        }
//        else {
//            newList.next=list2;
//        }
//        return  mergeList.next;
//    }
//
//
//}
////import static java.util.Arrays.sort;
//class Solution26 {
//
//    public int removeDuplicates(int[] nums) {
//        int flength = nums.length;
//        if (nums.length==2&&nums[0] == nums[1]) {flength--;}
//        else if(nums.length>2) {
//            for (int i = 0; i < nums.length-1; i++) {
//                if (nums[i+1] == nums[i]) {
//                    flength--;
//                    nums[i] = 10005;
//
//                }
//            }
//           // sort(nums);
//        }
//        return flength;
//    }
//}
//
//class Solution27{
//    public int removeElement(int[] nums, int val) {
//        int flength=nums.length;
//        if (nums.length>0) {
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == val) {
//                    nums[i] = 105;
//                    flength--;
//                }
//            }
//            sort(nums);
//        }
//        return flength;
//    }
//}
//class Solution28 {
//    public int strStr(String haystack, String needle) {
//        int indexn=0;
//        if (needle.length() > haystack.length()) {
//            indexn= -1;
//        } else if (needle.length() == 0) {
//            indexn= 0;
//        } else if (needle.length() <= haystack.length()) {
//            indexn = haystack.indexOf(needle);
//
//        }
//
//        return indexn;
//    }
//
//}
//class Solution35 {
//    public int searchInsert(int[] nums, int target) {
//        int index = 0;
//        if (target < nums[0]) {
//            index = 0;
//        } else if (target > nums[nums.length - 1]) {
//            index = nums.length;
//        } else {
//            index = binarySearch(nums, target);
//
//            if (index <0) {
//
//                for (int i = 0; i < nums.length - 1; i++) {
//                    if (target > nums[i] && target < nums[i + 1]) {
//                        index = i + 1;
//                    }
//
//                }
//
//            }
//        }
//        return index;
//    }
//
//}
//class Solution386 {
//    public List<Integer> lexicalOrder(int n) {
//        ArrayList<String> str = new ArrayList<String>(n);
//        for(int i = 1; i <=n; i++){
//            str.add(i+"");
//        }
//        str.sort(Comparator.naturalOrder());
//        List<Integer> integerList = str.stream().map(Integer::parseInt).collect(toList());
//        return integerList;
//    }
//}
////class Solution2 {
////    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        ListNode addlist=new ListNode(0);
////        ListNode newlist=addlist;
////        if (l1 == null) {newlist.next=l2;
////        }else if (l2 == null) {newlist.next=l1;
////        }
////        else {newlist.val=0;
////            int carry=0;
////            while(l1!=null||l2!=null||carry!=0){
////                int l1val=l1!=null?l1.val:0;
////                int l2val=l2!=null?l2.val:0;
////                int sum=l1val+l2val+carry;
////                carry=sum>=10?1:0;
////                ListNode sumnode=new ListNode(sum%10);
////                newlist.next=sumnode;
////                newlist=sumnode;
////                if(l1!=null) {l1=l1.next;}
////                if(l2!=null){ l2=l2.next;}
////            }
////        }
////        return addlist.next;
////    }
////}

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//import static java.util.Arrays.binarySearch;
//import static java.util.Arrays.sort;
//
//class Solution15 {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> zerocplist = new ArrayList<>(0);
//
//        if (nums.length >= 3) {
//            sort(nums);
//            for (int i = 0; i < nums.length - 1; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    int k = binarySearch(nums, -nums[i] - nums[j]);
//                    List<Integer> zerocp = new ArrayList<>(0);
//                    if (k > 0 && k != i && k != j) {
//                        zerocp.add(nums[i]);
//                        zerocp.add(nums[j]);
//                        zerocp.add(nums[k]);
//                        zerocp.sort(Comparator.naturalOrder());
//                        if (!zerocplist.contains(zerocp)) {
//                            zerocplist.add(zerocp);
//
//                        }
//                    }
//                }
//
//
//            }
//        }
//        return zerocplist;
//    }
//}
//class Solution15a {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> zerocplist = new ArrayList<>(0);
//
//        if (nums.length >= 3) {
//            sort(nums);
//            for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
//                int left = i + 1;
//                int right = nums.length - 1;
//
//
//                while (left < right) {
//                    int Zerof = nums[left] + nums[i] + nums[right];
//                    List<Integer> zerocp = new ArrayList<>(0);
//                    if (Zerof == 0) {
//                        zerocp.add(nums[i]);
//                        zerocp.add(nums[left]);
//                        zerocp.add(nums[right]);
//                        if (!zerocplist.contains(zerocp)) {
//                            zerocplist.add(zerocp);
//                        }
//                        left++;
//                        right--;
//                    }
//                    else if(Zerof<0){
//                        left++;
//                    }else{
//                        right--;
//                    }
//                }
//            }
//        }
//        return zerocplist;
//    }
//}
//双指针
//class Solution11 {
//    public int maxArea(int[] height) {
//        int maxS=0;
//        if(height.length>=2) {
//            for (int i = 0,j=height.length - 1; i < j; ) {
//                int minh = height[i]<height[j]?height[i++] : height[j--];
//                maxS = Math.max(maxS,(j-i+1)*minh);
//
//            }
//        }
//        return maxS;
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
//class Solution821 {
//    public int[] shortestToChar(String s, char c) {
//        ArrayList<Integer> indexc = new ArrayList<Integer>(0);
//        int[] ans = new int[s.length()];
//        if (s.length() == 1) {
//            ans[0] = 0;
//        } else {
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == c) {
//                    ans[i] = 0;
//                    indexc.add(i);
//                }
//                ans[i] = 10005;
//            }
//            for (int i = 0; i < ans.length ; i++) {
//                for (int index: indexc) {
//                    ans[i] = Math.min(ans[i],Math.abs(index - i));
//                }
//            }
//        }
//        return ans;
//    }
//}

//class Solution357 {
//    public int countNumbersWithUniqueDigits(int n) {
//
//        if (n == 0) {
//            return 1;
//        } else if (n == 1) {
//            return 10;
//        } else {
//            double numUD = 10;
//
//
//            for (int j = n; j > 1; j--) {
//                double numN = 9;
//                //当前n位有多少不重复的数
//                for (int i = 0; i < j-1; i++) {
//                    numN *= 9 - i;
//                }
//                numUD += numN;
//            }
//
//            return (int) numUD;
//        }
//    }
//}
//class Solution819 {
////    public String mostCommonWord(String paragraph, String[] banned) {
////        String mfword = "";
////        paragraph=paragraph.toLowerCase();
////        paragraph=paragraph.replace('!',' ').replace('?',' ').replace('\'',' ').replace(',',' ').replace(';',' ').replace('.',' ').trim();
////        String[] wordlist = paragraph.split(" ");
////
////        if (wordlist.length == 1) {
////            mfword = wordlist[0];
////        } else {
////            Map<String, Integer> word2num = new HashMap<>(wordlist.length);
////            Map<String, Integer> banword = new HashMap<>(banned.length);
////            for (String str : banned) {
////                banword.put(str, 1);
////            }
////            for (String str : wordlist) {
////                if (!banword.containsKey(str)&&!str.equals("")) {
////                    word2num.put(str, word2num.getOrDefault(str, 0) + 1);
////                }
////            }
////            int max = -1;
////            for (String str : word2num.keySet()) {
////                if (word2num.get(str) > max) {
////                    mfword = str;
////                    max = word2num.get(str);
////                }
////            }
////        }
////        return mfword;
////    }
////}


//
//class Solution171 {
//    public int titleToNumber(String columnTitle) {
//        if (columnTitle.length() == 0) {
//            return 0;
//        } else if (columnTitle.length() == 1) {
//            return columnTitle.charAt(0)- 64;
//        } else {
//            int[] t2nums = new int[columnTitle.length()];
//            int s2sum = 0;
//            for (int i = 0; i < t2nums.length; i++) {
//                t2nums[i] = columnTitle.charAt(i) - 64;
//                s2sum += Math.pow(26, t2nums[t2nums.length-1 - i]);
//            }
//            return s2sum;
//        }
//
//
//    }
//}


/////java+hashMap 这道题说的是对应关系，那首先想到的集合就是Map，将key（a）-value（dog）存在一起，每当遇到一个字母就去查看对应的单词。 失败有两种情况： 1.key存在，经过查找字母对应的单词和这个单词不匹配； 2.key不存在，但是这个单词已经被存了；
//class Solution290 {
//    public boolean wordPattern(String pattern, String s) {
//        if (pattern.length() == 0 && s.length() == 0) {
//            return false;
//        }
//        String[] words = s.split(" ");
//        if (words.length != pattern.length()) {
//            return false;
//        } else {
//            HashMap<Character, String> w2p = new HashMap<>();
//            for (int i = 0; i < words.length; i++) {
//                char temp = pattern.charAt(i);
//                if (w2p.containsKey(temp)) {
//
//                    if (!w2p.get(temp).equals(words[i])) {
//                        return false;
//                    }
//                } else {
//                    if (w2p.containsValue(words[i])) {
//                        return false;
//                    }
//                    w2p.put(temp, words[i]);
//                }
//            }
//            return true;
//        }
//    }
//
//    //    public static boolean wordPattern(String pattern, String str) {
////        if(pattern == null || str==null) return false;
////        String[] string = str.split(" ");
////        if(pattern.length() != string.length) return false;
////        HashMap<Character,String> map = new HashMap<>();
////
////        for(int i=0; i<pattern.length(); i++){
////            char tmp = pattern.charAt(i);
////            //key已经在
////            if(map.containsKey(tmp)){
////                //不对应就失败
////                if(!map.get(tmp).equals(string[i])) return false;
////            }
////            //key不存在
////            else{
////                //两个value的值一样 a-dog b-dog->false
////                if (map.containsValue(string[i])) return false;
////                else
////                //添加k-v值
////                map.put(tmp,string[i]);
////            }
////        }
////        return true;
////    }
//
//}
///class Solution342 {
//    public boolean isPowerOfFour(int n) {
//        if (n < 0) {
//            return false;
//        } else {
//            for (int i = 0; i <= 15; i++) {
//                if (Math.pow(4, i) == n) {
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//}
//
//class Solution344 {
//    public void reverseString(char[] s) {
//        if (s.length <= 1) {
//            return;
//        } else {
//            int lenStr = s.length / 2;
//            for (int i = 0; i < lenStr; i++) {
//                char temp = s[i];
//                s[i] = s[s.length - 1 - i];
//                s[s.length - 1 - i] = temp;
//            }
//        }
//    }
//}
//class Solution922 {
//    public int[] sortArrayByParityII(int[] nums) {
//        ArrayList<Integer> temp = new ArrayList<Integer>(nums.length / 2);
//        ArrayList<Integer> temp1 = new ArrayList<Integer>(nums.length / 2);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                temp.add(nums[i]);
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 1) {
//                temp1.add(nums[i]);
//            }
//        }
//
//        for (int i = 0, j = 0; i < nums.length; i = i + 2, j++) {
//            nums[i] = temp.get(j);
//        }
//
//        for (int i = 1, j = 0; i < nums.length; i = i + 2, j++) {
//            nums[i] = temp1.get(j);
//        }
//        return nums;
//    }
//}
//
//class Solution922a {
//    public int[] sortArrayByParityII(int[] A) {
//        int j = 1;
//        for (int i = 0; i < A.length - 1; i = i + 2) {
//            if ((A[i] & 1) != 0) {
//                while ((A[j] & 1) != 0) {
//                    j = j + 2;
//                }
//                int tmp = A[i];
//                A[i] = A[j];
//                A[j] = tmp;
//            }
//        }
//        return A;
//    }
//}
//
//class Solution922b {
//    public int[] sortArrayByParityII(int[] A) {
//        int[] result = new int[A.length];
//        int ji = 1;
//        int ou = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] % 2 == 0) {
//                result[ou] = A[i];
//                ou += 2; //偶数下标移动
//            } else {
//                result[ji] = A[i];
//                ji += 2; //奇数下标移动
//            }
//        }
//        return result;
//    }
//}
//
//class Solution1305 {
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (root1 == null && root2 == null) {
//            return res;
//        } else {
//            res.addAll(inorder(root1));
//            res.addAll(inorder(root2));
//            res.sort(Comparator.naturalOrder());
//            return res;
//        }
//    }
//
//    public List<Integer> inorder(TreeNode root) {
//        List<Integer> inod = new ArrayList<Integer>();
//        if (root == null) {
//            return inod;
//        } else if (root.right == null && root.left == null) {
//            inod.add(root.val);
//            return inod;
//        } else {
//            inod.addAll(inorder(root.left));
//            inod.add(root.val);
//            inod.addAll(inorder(root.right));
//            return inod;
//        }
//    }
//}
//
//class Solution1305a {
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        return merge(inorderTraversal(root1, new ArrayList<>()), inorderTraversal(root2, new ArrayList<>()));
//    }
//
//    public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
//        List<Integer> ans = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i) <= list2.get(j)) {
//                ans.add(list1.get(i));
//                i++;
//            } else {
//                ans.add(list2.get(j));
//                j++;
//            }
//        }
//        if (i == list1.size()) {
//            for (; j < list2.size(); j++) {
//                ans.add(list2.get(j));
//            }
//        } else {
//            for (; i < list1.size(); i++) {
//                ans.add(list1.get(i));
//            }
//        }
//        return ans;
//    }
//
//    public List<Integer> inorderTraversal(TreeNode t, List<Integer> ans) {
//        if (t != null) {
//            inorderTraversal(t.left, ans);
//            ans.add(t.val);
//            inorderTraversal(t.right, ans);
//        }
//        return ans;
//    }
//}
//class Solution1305b {
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        List<Integer> nums1 = new ArrayList<Integer>();
//        List<Integer> nums2 = new ArrayList<Integer>();
//        inorder(root1, nums1);
//        inorder(root2, nums2);
//
//        List<Integer> merged = new ArrayList<Integer>();
//        int p1 = 0, p2 = 0;
//        while (true) {
//            if (p1 == nums1.size()) {
//                merged.addAll(nums2.subList(p2, nums2.size()));
//                break;
//            }
//            if (p2 == nums2.size()) {
//                merged.addAll(nums1.subList(p1, nums1.size()));
//                break;
//            }
//            if (nums1.get(p1) < nums2.get(p2)) {
//                merged.add(nums1.get(p1++));
//            } else {
//                merged.add(nums2.get(p2++));
//            }
//        }
//        return merged;
//    }
//
//    public void inorder(TreeNode node, List<Integer> res) {
//        if (node != null) {
//            inorder(node.left, res);
//            res.add(node.val);
//            inorder(node.right, res);
//        }
//    }
//}


//class Solution1323error {//看错题目,这是不变数字中6和9的个数
//    public int maximum69Number(int num) {
//        if (num == 6 || num == 9) {
//            return 9;
//        }
//        String numstr = Integer.toString(num);
//        String[] numstrs = numstr.split("");
//        int left = 0;
//        int right = numstrs.length - 1;
//        while (left <= right) {
//            if ("6".equals(numstrs[left]) && "9".equals(numstrs[right])) {
//                String temp = numstrs[left];
//                numstrs[right] = numstrs[left];
//                numstrs[right] = temp;
//                left++;
//                right--;
//            } else if ("6".equals(numstrs[left]) && "6".equals(numstrs[right])) {
//                right--;
//            } else if ("9".equals(numstrs[left]) && "9".equals(numstrs[right])) {
//                left++;
//            } else {
//                left++;
//                right--;
//            }
//        }
//        String res="";
//        for (String s:numstrs){
//            res+=s;
//        }
//        return Integer.parseInt(res);
//    }
//}
//class Solution1323 {
//    public int maximum69Number(int num) {
//        if (num == 6 || num == 9) {
//            return 9;
//        }
//        String numstr = Integer.toString(num);
//        String[] numstrs = numstr.split("");
//        for(int i=0;i<numstrs.length; i++){
//            if(numstrs[i].equals("6")){
//                numstrs[i]="9";
//                break;
//            }
//        }
//        String res="";
//        for (String s:numstrs){
//            res+=s;
//        }
//        return Integer.parseInt(res);
//    }
//}
//class Solution1323a {
//    public int maximum69Number (int num) {
//        /**
//         1.如果全是9则不需要翻转，如果存在6，则将最高位数上的6翻转为9即可
//         2.怎么找到最高位数？
//         3.String.valueOf()
//         */
//        String s = String.valueOf(num);
//        s = s.replaceFirst("6","9");
//        return Integer.parseInt(s);
//
//    }
//}


