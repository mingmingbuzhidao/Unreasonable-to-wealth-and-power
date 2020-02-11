/**
 * 核心算法： 
 * 当i=0||j=0时,c[i,j]=0 
 * 当xi=yj时,c[i,j]=c[i-1,j-1]+1 
 * 当xi!=yj时,c[i,j]=0
 * 
 * 算例中考虑了会出现多个最长公共子串的情况
 * 且所有LCS均输出
 * 
 * @author Chill Lyn
 *
 */
class LongestCommonSubstring {
	public static void main(String[] args) {
		// 定义两个字符串
		String x = "abcde";
		String y = "cdcdeabc";

		lcs(x, y);

	}

	public static void lcs(String x, String y) {
		// 定义动态规划二维数组
		int[][] c = new int[x.length() + 1][y.length() + 1];
		// 最长公共子串长度
		int maxLength = 0;
		// 可能出现的最长公共子串的个数
		int count = 1;
		// 用于存储最长公共子串末尾元素索引的数组
		int[] index = new int[x.length()];

		for (int j = 0; j < y.length() + 1; j++) {
			for (int i = 0; i < x.length() + 1; i++) {
				// 当i=0||j=0时 c[i,j]=0
				// 定义动态数组时，数组内元素默认值为0
				// 此处if语句方便理解算法
				if ((i == 0) || (j == 0)) {
					c[i][j] = 0;
					// 当xi=yj时 c[i,j]=c[i-1,j-1]+1
				} else if (x.charAt(i - 1) == y.charAt(j - 1)) {
					c[i][j] = c[i - 1][j - 1] + 1;

					if (c[i][j] > maxLength) {
						maxLength = c[i][j];
						// 每一次最长公共子串长度更新，重置索引数组
						// 每一次最长公共子串长度更新，重置个数
						for (int k = 0; k < count; k++) {
							index[k] = 0;
						}
						count = 1;
						index[count - 1] = i;

						// 如果c[i][j]==maxLength，则说明出现新的一个LCS
						// 索引数组增加一个元素用于存储新LCS的索引
						// 子串个数+1
					} else if (c[i][j] == maxLength) {
						index[count] = i;
						count++;
					}

					// 当xi!=yj时 0
				} else {
					c[i][j] = 0;
				}

			}
		}

		// 打印动态规划表c[i,j]
		System.out.println("动态规划表c[i,j]:");
		for (int j = 0; j < y.length() + 1; j++) {
			for (int i = 0; i < x.length() + 1; i++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

		// 打印最长公共子串
		for (int i = 1; i <= count; i++) {
			System.out.print("Longest Common Substring " + i + ": ");
			for (int j = maxLength; j > 0; j--) {
				System.out.print(x.charAt(index[i - 1] - j));
			}
			System.out.println();
		}

		System.out.println("Amount of Longest Common Substring: " + count);

		System.out.println("Max length of Longest Common Substring: " + maxLength);

	}
}