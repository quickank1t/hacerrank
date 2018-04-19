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
2. And then call the count the number of biggest number again by iterating over N times

Making the time compleyity N square 

Approch 2: With time complexity O(N)

1. Define a hashtable
2. iterate the complete 