//package com.java;
//
//import java.util.*;
//
////class Solution908 {
////    public int SmallestRangeI(int[] nums, int k) {
////        Arrays.sort(nums);
////        return Math.max(nums[nums.length - 1] - nums[0] - k * 2, 0);
////    }
////}
////
////class Solution961 {
////    public int repeatedNTimes(int[] nums) {
////        Set<Integer> set = new HashSet(nums.length / 2 + 1);
////        for (int num : nums) {
////            if (set.contains(num)) {
////                return num;
////            } else {
////                set.add(num);
////            }
////        }
////        return nums[0];
////    }
////}
////
////class Solution961a {
////    public int repeatedNTimes(int[] A) {
////        Arrays.sort(A);
////        return A[A.length / 2] == A[A.length - 1] ? A[A.length / 2] : A[A.length / 2 - 1];
////    }
////}
////
////class Solution961LeetCode1 {
////    public int repeatedNTimes(int[] nums) {
////        int n = nums.length;
////        Random random = new Random();
////
////        while (true) {
////            int x = random.nextInt(n), y = random.nextInt(n);
////            if (x != y && nums[x] == nums[y]) {
////                return nums[x];
////            }
////        }
////    }
////}
////
////class Solution961LeetCode2 {
////    public int repeatedNTimes(int[] nums) {
////        int n = nums.length;
////        for (int gap = 1; gap <= 3; ++gap) {
////            for (int i = 0; i + gap < n; ++i) {
////                if (nums[i] == nums[i + gap]) {
////                    return nums[i];
////                }
////            }
////        }
////        // 不可能的情况
////        return -1;
////    }
////}
////
////class SolutionOII029 {
////    public int[] constructArr(int[] a) {
////        if (a.length <= 1) {
////            return new int[]{0};
////        }
////        int[] res = new int[a.length];
////        for (int i = 0; i < a.length; i++) {
////
////            res[i] = getMup(a, i);
////
////        }
////        return res;
////    }
////
////    public int getMup(int[] a, int i) {
////
////        int[] temp = new int[a.length];
////        a[i] = 1;
////        int mupSum = 1;
////        for (int num : a) {
////            mupSum *= num;
////        }
////        return mupSum;
////    }
////}
////
//////class RandomizedSetOII030 {
//////    List<Integer> rs;
//////
//////    /**
//////     * Initialize your data structure here.
//////     */
//////    public RandomizedSet() {
//////        rs = new ArrayList<Integer>();
//////    }
//////
//////    /**
//////     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
//////     */
//////    public boolean insert(int val) {
//////        if (rs.contains(val)) {
//////            return false;
//////        }
//////        rs.add(val);
//////        return true;
//////
//////    }
//////
//////    /**
//////     * Removes a value from the set. Returns true if the set contained the specified element.
//////     */
//////    public boolean remove(int val) {
//////        if (rs.contains(val)) {
//////            rs.remove(Integer.valueOf(val));
//////            return true;
//////        }
//////
//////        return false;
//////
//////    }
//////
//////
//////    /**
//////     * Get a random element from the set.
//////     */
//////    public int getRandom() {
//////        return rs.get(new Random().nextInt(rs.size() - 1));
//////    }
//////}
////
//////class RandomizedSet{
//////    /*
//////    数组+map
//////    利用数组维护所有插入的元素
//////    map记录插入的元素在数组中的下标
//////    即key为插入的val value为val在数组中的index
//////    当需要删除元素时，利用map获取元素的下标
//////    然后将最后一个元素覆盖该下标元素，并删除最后一个元素
//////    同时需要利用map维护变化
//////
//////    执行用时：20 ms, 在所有 Java 提交中击败了99.94%的用户
//////    内存消耗：90.1 MB, 在所有 Java 提交中击败了12.34%的用户
//////*/
//////    Map<Integer, Integer> map;
//////    List<Integer> arr;
//////    int size;
//////    static Random rd = new Random();
//////
//////    public RandomizedSet() {
//////        map = new HashMap<>();
//////        arr = new ArrayList<>();
//////    }
//////
//////    public boolean insert(int val) {
//////        if(map.containsKey(val)) return false;
//////        arr.add(val);
//////        map.put(val, size++);
//////        return true;
//////    }
//////
//////    public boolean remove(int val) {
//////        if(!map.containsKey(val)) return false;
//////        int index = map.get(val);       // 获取val的下标index
//////        int lastNum = arr.get(--size);  // 获取最后一个元素last
//////        arr.set(index, lastNum);  // 利用last覆盖index
//////        map.put(lastNum, index);  // 改变map中last的index
//////        map.remove(val);    // 删除map中的val
//////        arr.remove(size);   // 删除最后一个元素
//////        return true;
//////    }
//////
//////    public int getRandom() {
//////        return arr.get(rd.nextInt(size));
//////    }
//////}
////class RandomizedSet {
////    private Set<Integer> set;
////    private List<Integer> list;
////    private Random random;
////
////    /**
////     * Initialize your data structure here.
////     */
////    public RandomizedSet() {
////        this.set = new HashSet<>();
////        this.list = new ArrayList<>();
////        this.random = new Random();
////    }
////
////    /**
////     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
////     */
////    public boolean insert(int val) {
////        boolean result = set.add(val);
////        if (result) {
////            list.add(val);
////        }
////        return result;
////    }
////
////    /**
////     * Removes a value from the set. Returns true if the set contained the specified element.
////     */
////    public boolean remove(int val) {
////        boolean result = set.remove(val);
////        if (result) {
////            // 其实，List集合也是支持删除指定元素值的元素的，但是需要传入的参数是一个 Object 对象类型
////            // 所以，这里把基本类型的 int 装箱为对象类型 Integer
////            Integer value = val;
////            list.remove(value);
////        }
////        return result;
////    }
////
////    /**
////     * Get a random element from the set.
////     */
////    public int getRandom() {
////        return list.get(random.nextInt(list.size()));
////    }
////}
////
////class RandomizedSet {//LeetCode-Solution
////    List<Integer> nums;
////    Map<Integer, Integer> indices;
////    Random random;
////
////    public RandomizedSet() {
////        nums = new ArrayList<Integer>();
////        indices = new HashMap<Integer, Integer>();
////        random = new Random();
////    }
////
////    public boolean insert(int val) {
////        if (indices.containsKey(val)) {
////            return false;
////        }
////        int index = nums.size();
////        nums.add(val);
////        indices.put(val, index);
////        return true;
////    }
////
////    public boolean remove(int val) {
////        if (!indices.containsKey(val)) {
////            return false;
////        }
////        int index = indices.get(val);
////        int last = nums.get(nums.size() - 1);
////        nums.set(index, last);
////        indices.put(last, index);
////        nums.remove(nums.size() - 1);
////        indices.remove(val);
////        return true;
////    }
////
////    public int getRandom() {
////        int randomIndex = random.nextInt(nums.size());
////        return nums.get(randomIndex);
////    }
////}
////
////public class LRUCache {
////    private int capacity;
////    private int currentSize = 0;
////    private Map<Integer, Node> map = new HashMap<>();
////    private Node head = new Node();
////    private Node tail = new Node();
////
////    public LRUCache(int capacity) {
////        this.capacity = capacity;
////        head.next = tail;
////        tail.pre = head;
////    }
////
////    public int get(int key) {
////        if (map.containsKey(key)) {
////            Node node = map.get(key);
////            removeNode(node);
////            moveToHead(node);
////            return node.value;
////        }
////        return -1;
////    }
////
////    public void put(int key, int value) {
////        if (map.containsKey(key)) {
////            Node node = map.get(key);
////            node.value = value;
////            removeNode(node);
////            moveToHead(node);
////        } else {
////            this.currentSize++;
////            Node node = new Node(key, value);
////            map.put(key, node);
////            moveToHead(node);
////            if (this.currentSize > this.capacity) {
////                deleteTail();
////            }
////        }
////    }
////
////    //删除节点
////    public void removeNode(Node node) {
////        node.pre.next = node.next;
////        node.next.pre = node.pre;
////    }
////
////    //将节点移到辅助节点head之后
////    public void moveToHead(Node node) {
////        //插到头节点head之后
////        node.next = head.next;
////        head.next.pre = node;
////        head.next = node;
////        node.pre = head;
////    }
////
////    //删除辅助节点tail之前的第一个节点
////    public void deleteTail() {
////        map.remove(tail.pre.key);
////        tail.pre.pre.next = tail;
////        tail.pre = tail.pre.pre;
////        this.currentSize--;
////    }
////
////    class Node {
////        public int key;
////        public int value;
////        public Node pre = null;
////        public Node next = null;
////
////        public Node(int key, int value) {
////            this.key = key;
////            this.value = value;
////        }
////
////        public Node() {
////        }
////    }
////}
////
////
////class LRUCache extends LinkedHashMap<Integer, Integer> {//LeetCode-Solution
////    private int capacity;
////
////    public LRUCache(int capacity) {
////        super(capacity, 0.75F, true);
////        this.capacity = capacity;
////    }
////
////    public int get(int key) {
////        return super.getOrDefault(key, -1);
////    }
////
////    public void put(int key, int value) {
////        super.put(key, value);
////    }
////
////    @Override
////    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
////        return size() > capacity;
////    }
////}
////
////public class LRUCache {//LeetCode-Solution
////
////    class DLinkedNode {
////        int key;
////        int value;
////        DLinkedNode prev;
////        DLinkedNode next;
////
////        public DLinkedNode() {
////        }
////
////        public DLinkedNode(int _key, int _value) {
////            key = _key;
////            value = _value;
////        }
////    }
////
////    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
////    private int size;
////    private int capacity;
////    private DLinkedNode head, tail;
////
////    public LRUCache(int capacity) {
////        this.size = 0;
////        this.capacity = capacity;
////        // 使用伪头部和伪尾部节点
////        head = new DLinkedNode();
////        tail = new DLinkedNode();
////        head.next = tail;
////        tail.prev = head;
////    }
////
////    public int get(int key) {
////        DLinkedNode node = cache.get(key);
////        if (node == null) {
////            return -1;
////        }
////        // 如果 key 存在，先通过哈希表定位，再移到头部
////        moveToHead(node);
////        return node.value;
////    }
////
////    public void put(int key, int value) {
////        DLinkedNode node = cache.get(key);
////        if (node == null) {
////            // 如果 key 不存在，创建一个新的节点
////            DLinkedNode newNode = new DLinkedNode(key, value);
////            // 添加进哈希表
////            cache.put(key, newNode);
////            // 添加至双向链表的头部
////            addToHead(newNode);
////            ++size;
////            if (size > capacity) {
////                // 如果超出容量，删除双向链表的尾部节点
////                DLinkedNode tail = removeTail();
////                // 删除哈希表中对应的项
////                cache.remove(tail.key);
////                --size;
////            }
////        } else {
////            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
////            node.value = value;
////            moveToHead(node);
////        }
////    }
////
////    private void addToHead(DLinkedNode node) {
////        node.prev = head;
////        node.next = head.next;
////        head.next.prev = node;
////        head.next = node;
////    }
////
////    private void removeNode(DLinkedNode node) {
////        node.prev.next = node.next;
////        node.next.prev = node.prev;
////    }
////
////    private void moveToHead(DLinkedNode node) {
////        removeNode(node);
////        addToHead(node);
////    }
////
////    private DLinkedNode removeTail() {
////        DLinkedNode res = tail.prev;
////        removeNode(res);
////        return res;
////    }
////}
////
////class SolutionOII033LeetCode1 {
////    public List<List<String>> groupAnagrams(String[] strs) {
////        Map<String, List<String>> map = new HashMap<String, List<String>>();
////        for (String str : strs) {
////            char[] array = str.toCharArray();
////            Arrays.sort(array);
////            String key = new String(array);
////            List<String> list = map.getOrDefault(key, new ArrayList<String>());
////            list.add(str);
////            map.put(key, list);
////        }
////        return new ArrayList<List<String>>(map.values());
////    }
////}
////
////class SolutionOII033LeetCode2 {
////    public List<List<String>> groupAnagrams(String[] strs) {
////        Map<String, List<String>> map = new HashMap<String, List<String>>();
////        for (String str : strs) {
////            int[] counts = new int[26];
////            int length = str.length();
////            for (int i = 0; i < length; i++) {
////                counts[str.charAt(i) - 'a']++;
////            }
////            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
////            StringBuffer sb = new StringBuffer();
////            for (int i = 0; i < 26; i++) {
////                if (counts[i] != 0) {
////                    sb.append((char) ('a' + i));
////                    sb.append(counts[i]);
////                }
////            }
////            String key = sb.toString();
////            List<String> list = map.getOrDefault(key, new ArrayList<String>());
////            list.add(str);
////            map.put(key, list);
////        }
////        return new ArrayList<List<String>>(map.values());
////    }
////}
////
////class SolutionOII035 {
////    public int findMinDifference(List<String> timePoints) {
////        int[] mArray = new int[timePoints.size() * 2];
////        for (int i = 0; i < timePoints.size(); i++) {
////            String[] temp = timePoints.get(i).split(":");
////            mArray[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
////            mArray[i + timePoints.size()] = mArray[i] + 1440;
////        }
////        int minDifference = 1440;
////        Arrays.sort(mArray);
////        for (int i = 0; i < mArray.length - 1; i++) {
////            minDifference = Math.min(minDifference, mArray[i + 1] - mArray[i]);
////        }
////
////
////        return minDifference;
////    }
////}
////
////class SolutionOII035LeetCode1 {
////    public int findMinDifference(List<String> timePoints) {
////        Collections.sort(timePoints);
////        int ans = Integer.MAX_VALUE;
////        int t0Minutes = getMinutes(timePoints.get(0));
////        int preMinutes = t0Minutes;
////        for (int i = 1; i < timePoints.size(); ++i) {
////            int minutes = getMinutes(timePoints.get(i));
////            ans = Math.min(ans, minutes - preMinutes); // 相邻时间的时间差
////            preMinutes = minutes;
////        }
////        ans = Math.min(ans, t0Minutes + 1440 - preMinutes); // 首尾时间的时间差
////        return ans;
////    }
////
////    public int getMinutes(String t) {
////        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
////    }
////}
////
////class SolutionOII035LeetCode2 {
////    public int findMinDifference(List<String> timePoints) {
////        int n = timePoints.size();
////        if (n > 1440) {
////            return 0;
////        }
////        Collections.sort(timePoints);
////        int ans = Integer.MAX_VALUE;
////        int t0Minutes = getMinutes(timePoints.get(0));
////        int preMinutes = t0Minutes;
////        for (int i = 1; i < n; ++i) {
////            int minutes = getMinutes(timePoints.get(i));
////            ans = Math.min(ans, minutes - preMinutes); // 相邻时间的时间差
////            preMinutes = minutes;
////        }
////        ans = Math.min(ans, t0Minutes + 1440 - preMinutes); // 首尾时间的时间差
////        return ans;
////    }
////
////    public int getMinutes(String t) {
////        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
////    }
////}
////
////class SolutionOII038 {
////    public int[] dailyTemperatures(int[] temperatures) {
////        int[] result = new int[temperatures.length];
////        for (int i = 0; i < temperatures.length - 1; i++) {
////            int count = 1;
////            for (int j = i + 1; j < temperatures.length; j++) {
////                if (temperatures[j] > temperatures[i]) {
////                    result[i] = count <= temperatures.length - i - 1 ? count : 0;
////                    break;
////                } else {
////                    count++;
////                }
////
////            }
////        }
////        result[temperatures.length - 1] = 0;
////        return result;
////    }
////}
////
////class SolutionOII038LeetCode1 {
////    public int[] dailyTemperatures(int[] temperatures) {
////        int length = temperatures.length;
////        int[] ans = new int[length];
////        Deque<Integer> stack = new LinkedList<Integer>();
////        for (int i = 0; i < length; i++) {
////            int temperature = temperatures[i];
////            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
////                int prevIndex = stack.pop();
////                ans[prevIndex] = i - prevIndex;
////            }
////            stack.push(i);
////        }
////        return ans;
////    }
////}
////
////class SolutionOII038LeetCode2 {
////    public int[] dailyTemperatures(int[] temperatures) {
////        int length = temperatures.length;
////        int[] ans = new int[length];
////        int[] next = new int[101];
////        Arrays.fill(next, Integer.MAX_VALUE);
////        for (int i = length - 1; i >= 0; --i) {
////            int warmerIndex = Integer.MAX_VALUE;
////            for (int t = temperatures[i] + 1; t <= 100; ++t) {
////                if (next[t] < warmerIndex) {
////                    warmerIndex = next[t];
////                }
////            }
////            if (warmerIndex < Integer.MAX_VALUE) {
////                ans[i] = warmerIndex - i;
////            }
////            next[temperatures[i]] = i;
////        }
////        return ans;
////    }
////}
////
////
////class SolutionOII037 {
////    public int[] asteroidCollision(int[] asteroids) {
////        int len = asteroids.length;
////        Deque<Integer> stack = new LinkedList<>();
////        for (int i = 0; i < len; i++) {
////            //stack为空或当前值大于0，直接添加到栈顶
////            if (stack.isEmpty() || asteroids[i] > 0) {
////                stack.addLast(asteroids[i]);
////                continue;
////            }
////            int curr = -asteroids[i];
////            //栈顶的值为整数，且当前值绝对值比栈顶的值大，栈顶的值要消除
////            while (!stack.isEmpty() && stack.getLast() > 0 && curr > stack.getLast()) {
////                stack.removeLast();
////            }
////            if (!stack.isEmpty()) {
////                //栈不为空，且栈顶的值等于当前值的绝对值，需要消除栈顶的值
////                if (stack.getLast() == curr) {
////                    stack.removeLast();
////                    //栈不为空，且栈顶的值小于0，将当前的值（小于0）添加进栈顶
////                } else if (stack.getLast() < 0) {
////                    stack.addLast(asteroids[i]);
////                }
////                //栈为空，将当前的值（小于0）添加进栈顶
////            } else {
////                stack.addLast(asteroids[i]);
////            }
////        }
////        int size = stack.size();
////        int[] res = new int[size];
////        for (int i = 0; i < size; i++) {
////            res[i] = stack.removeFirst();
////        }
////        return res;
////    }
////}
////
//class Solution929a {
//    public int numUniqueEmails(String[] emails) {
//        if (emails.length == 0) {
//            return 0;
//        }
//        Set<String> uniqueEmails = new HashSet<>();
//        for (int i = 0; i < emails.length; i++) {
//            String[] tmp = emails[i].split("@");
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < tmp[0].length(); j++) {
//                if (tmp[0].charAt(j) == '+') {
//                    break;
//                }
//                if (tmp[0].charAt(j) != '+' && tmp[0].charAt(j) != '.') {
//                    sb.append(tmp[0].charAt(j));
//                }
//
//            }
//            sb.append("@").append(tmp[1]);
//            uniqueEmails.add(sb.toString());
//        }
//        return uniqueEmails.size();
//    }
//
//
//}
//
//class Solution929LeetCode {
//    public int numUniqueEmails(String[] emails) {
//        Set<String> emailSet = new HashSet<String>();
//        for (String email : emails) {
//            int i = email.indexOf('@');
//            String local = email.substring(0, i).split("\\+")[0]; // 去掉本地名第一个加号之后的部分
//            local = local.replace(".", ""); // 去掉本地名中所有的句点
//            emailSet.add(local + email.substring(i));
//        }
//        return emailSet.size();
//    }
//}
//
//class SolutionOII046LeetCode1  {//深度优先搜索
//    public List<Integer> rightSideView(TreeNode root) {
//        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
//        int max_depth = -1;
//
//        Deque<TreeNode> nodeStack = new ArrayDeque<TreeNode>();
//        Deque<Integer> depthStack = new ArrayDeque<Integer>();
//        nodeStack.push(root);
////        depthStack.push(0);
//
//        while (!nodeStack.isEmpty()) {
//            TreeNode node = nodeStack.pop();
//            int depth = depthStack.pop();
//
//            if (node != null) {
//                // 维护二叉树的最大深度
//                max_depth = Math.max(max_depth, depth);
//
//                // 如果不存在对应深度的节点我们才插入
//                if (!rightmostValueAtDepth.containsKey(depth)) {
//                    rightmostValueAtDepth.put(depth, node.val);
//                }
//
//                nodeStack.push(node.left);
//                nodeStack.push(node.right);
//                depthStack.push(depth + 1);
//                depthStack.push(depth + 1);
//            }
//        }
//
//        List<Integer> rightView = new ArrayList<Integer>();
//        for (int depth = 0; depth <= max_depth; depth++) {
//            rightView.add(rightmostValueAtDepth.get(depth));
//        }
//
//        return rightView;
//    }
//}
//
//class SolutionOII046LeetCode2  {//广度优先搜索
//    public List<Integer> rightSideView(TreeNode root) {
//        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
//        int max_depth = -1;
//
//        Queue<TreeNode> nodeQueue = new ArrayDeque<TreeNode>();
//        Queue<Integer> depthQueue = new ArrayDeque<Integer>();
//        nodeQueue.add(root);
//        depthQueue.add(0);
//
//        while (!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.remove();
//            int depth = depthQueue.remove();
//
//            if (node != null) {
//                // 维护二叉树的最大深度
//                max_depth = Math.max(max_depth, depth);
//
//                // 由于每一层最后一个访问到的节点才是我们要的答案，因此不断更新对应深度的信息即可
//                rightmostValueAtDepth.put(depth, node.val);
//
//                nodeQueue.add(node.left);
//                nodeQueue.add(node.right);
//                depthQueue.add(depth + 1);
//                depthQueue.add(depth + 1);
//            }
//        }
//
//        List<Integer> rightView = new ArrayList<Integer>();
//        for (int depth = 0; depth <= max_depth; depth++) {
//            rightView.add(rightmostValueAtDepth.get(depth));
//        }
//
//        return rightView;
//    }
//}
//
//class SolutionOII046 {
//    public List<Integer> rightSideView(TreeNode root) {//层次遍历
//        List<Integer> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            for (int i = 0; i < n; i++) {
//                TreeNode cur = queue.remove();
//                if (i == 0) list.add(cur.val);
//                if (cur.right != null) queue.add(cur.right);
//                if (cur.left != null) queue.add(cur.left);
//            }
//        }
//        return list;
//    }
//}
//
//class SolutionOII047 {
//    public TreeNode pruneTree(TreeNode root) {
//        return dfs(root);
//    }
//    public TreeNode dfs(TreeNode node){
//        if(node==null){
//            return null;
//        }
//        node.left  = dfs(node.left);
//        node.right = dfs(node.right);
//
//        return node.left==null && node.right==null && node.val==0? null:node;
//    }
//}
//class SolutionOII047a {
//    public TreeNode pruneTree(TreeNode root){
//        if(root == null){
//            return null;
//        }
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        TreeNode curNode = root;
//        TreeNode prevNode = null;
//        while(curNode != null || !stack.isEmpty()){
//            while(curNode != null){
//                stack.offerLast(curNode);
//                curNode = curNode.left;
//            }
//            curNode = stack.peekLast();
//            if(curNode.right != null && curNode.right != prevNode) {
//                curNode = curNode.right;
//            } else {
//                curNode = stack.pollLast();
//                if(curNode.val == 0 && curNode.left == null && curNode.right == null){
//                    //curNode为栈区变量，直接修改curNode对堆区的树没有影响
//                    //curNode = null;
//
//                    //tmpNode为栈区变量,tmpNode.left和tmpNode.right为堆区变量，修改left和right会修改树的节点
//                    if(!stack.isEmpty()){
//                        //tmpNode为父节点,curNode为子节点
//                        TreeNode tmpNode = stack.peekLast();
//                        if(tmpNode.left == curNode){
//                            tmpNode.left = null;
//                        } else if(tmpNode.right == curNode){
//                            tmpNode.right = null;
//                        }
//                    } else {
//                        //出栈前栈中只有一个节点，直接返回
//                        return null;
//                    }
//                }
//                prevNode = curNode;
//                curNode = null;
//            }
//        }
//        return root;
//    }
//}
//
//
//class SolutionOII047c {
//    public TreeNode pruneTree(TreeNode root) {
//        dfs(root);
//        if(root.val==0&&root.left==null&&root.right==null){
//            root=null;
//        }
//        return root;
//    }
//
//    void dfs(TreeNode root){
//        if(root==null) return;
//        dfs(root.left);
//        dfs(root.right);
//        if(root.left!=null&&root.left.val==0&&root.left.left==null&&root.left.right==null){
//            root.left=null;
//        }
//        if(root.right!=null&&root.right.val==0&&root.right.left==null&&root.right.right==null){
//            root.right=null;
//        }
//    }
//
//    public TreeNode pruneTree2(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode left = pruneTree(root.left);
//        root.left = left;
//        TreeNode right = pruneTree(root.right);
//        root.right = right;
//        // 叶子节点退化操作
//        if (left == null && right == null && root.val == 0) {
//            return null;
//        }
//        return root;
//    }
//}


import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}