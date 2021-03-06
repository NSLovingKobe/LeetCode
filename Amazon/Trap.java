class Trap {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int i = 0, j = height.length - 1;
        int res = 0;
        while (i <= j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            if (leftMax < rightMax) {
                res += leftMax - height[i++];
            } else {
                res += rightMax - height[j--];
            }
        }
        return res;
    }
}