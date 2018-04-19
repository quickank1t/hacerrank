# Problem

Colleen is having a birthday! She will have a cake with one candle for each year of her age. When she blows out the candles, she’ll only be able to blow out the tallest ones.

Find and print the number of candles she can successfully blow out.

# Input Format

The first line contains a single integer, , denoting the number of candles on the cake. 
The second line contains  space-separated integers, where each integer  describes the height of candle .

# Constraints

Output Format 
Print the number of candles the can be blown out on a new line.

# Sample Input 

4
3 2 1 3

# Sample Output 

2
# Explanation 

The maximum candle height is 3 and there are two candles of that height.

# Solution

Approch 1: with time complexity 0(N * N)

1. find the biggest element from the array of candels by iterating over N times
2. And then count the number of times the biggest number occurance again by iterating over N times

Approch 2: With time complexity O(N) (<a href="https://github.com/quickank1t/hacerrank/blob/master/Birthday%20Cake%20Candles/src/Solution.java">Solution</a>   )

1. Define a hashtable
2. iterate N times and <br>
  a. if key is not there in hashtable then insert in hashtable with key= size of the candel and value= count of the number as 1 <br>
  b. else increment the count of the number by 1 for hash table with key <br>
  c. also keep a track of the highest number<br>
3. just get the hashvalue with key= highest number
