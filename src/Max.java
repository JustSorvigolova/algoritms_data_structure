public class Max {
    public static void main(String[] args) {
/* Group 3
*  Abdykasymov Erlan
*  Samvelyants Vladislav
*  Nurushev Talgat
*  Rustanov Akbar
* */
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {7,6,4,3,1};
        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height1 = {1,1};
        int[] height2 = {1,2,1};
        int[] height3 = {4,3,2,1,4};

        System.out.println(maxprofit(prices1));
        System.out.println(maxprofit(prices));

        System.out.println(maxarea(height));
        System.out.println(maxarea(height1));
        System.out.println(maxarea(height2));
        System.out.println(maxarea(height3));
    }

    public static int maxprofit(int[] prices){
        int minprice = prices[0];
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
            if(i < prices.length - 1){
                if(prices[i + 1] - minprice > maxprofit){
                    maxprofit = prices[i + 1] - minprice;
                }
            }
        }
        return maxprofit;
    }

    public static int maxarea(int[] height){
        int maxarea = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1; j < height.length; j++){
                int width = j - i;
                if(height[i] <= height[j]){
                    if(maxarea < height[i] * width){
                        maxarea = height[i] * width;
                    }
                }else {
                    if(maxarea < height[j] * width){
                        maxarea = height[j] * width;
                    }
                }
            }
        }
        return maxarea;
    }
}