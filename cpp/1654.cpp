#include <stdio.h>
#include <algorithm>
using namespace std;
int d[10002];
int n, m;
#define INT_MAX ((1ll<<31ll)-1ll)
int MAX(int a, int b) {
	return a > b ? a : b;
}
// 220 -> 11개
// 200/20 -> 10개  만약 200/21 이였어 그럼 9개 나오지, 9개 나오는 것들은 189(21*9)부터 시작해서 210(21*10)까지
// 180 -> 9개  right_idx 미포함
long long dnq(int left_idx, int right_idx, long long cut_size) {
	if (left_idx >= right_idx) return 0;

	int mid_idx = (left_idx + right_idx) / 2;
	long long m_val = (long long)d[mid_idx] / cut_size;

	int* thresh_low = upper_bound(d + left_idx, d + right_idx, (int)m_val*(int)cut_size - 1);
	
	int* thresh_high;
	if ((long long)(m_val + 1ll)*(long long)cut_size > INT_MAX) thresh_high = &d[n + 1];
	else thresh_high = lower_bound(d + left_idx, d + right_idx, (int)(m_val + 1)*(int)cut_size); // 미포함

	long long res = (thresh_high - thresh_low) * m_val;
	res += dnq(left_idx, thresh_low - d, cut_size);
	res += dnq(thresh_high - d, right_idx, cut_size);
	return res;
}
int solve(long long cut_size) {
	// 최소 기대 값 -> MINIMUM에서 나오는 갯수 * 전체 길이 -> 이것보다 작으면 무조건 성공
	if (((long long)d[1] / cut_size)*(long long)n >= (long long)m) return 1;
	if (((long long)d[n]/cut_size) * (long long)n < (long long)m) return 0;
	return dnq(1, n+1, cut_size) >= (long long)m;
}
int main() {
	int max = 0;
	long long low = 1, high = 0;
	scanf("%d %d", &n, &m);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &d[i]);
		high = MAX(high, (long long)d[i]);
	}
	sort(d + 1, d + 1 + n);
	high = high+1;
	while (low < high) { // high 미포함 high를 포함할 시 low+high+1로 해줘야
		long long mid = (low + high) / 2;
		int res = solve(mid);
		
		if (res) {
			low = mid + 1;
		}
		else {
			high = mid;
		}
	}
	printf("%lld\n", low-1);
}
