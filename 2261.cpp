#include <cstdio>
#include <vector>
#include <cmath>
#include <set>
#include <algorithm>
#define X first
#define Y second
#define all(x) x.begin(), x.end()
#define sz(x) (int)x.size()
using namespace std;

char buf[1 << 17];

inline char read() {
	static int idx = 1 << 17;
	if (idx == 1 << 17) {
		fread(buf, 1, 1 << 17, stdin);
		idx = 0;
	}
	return buf[idx++];
}
inline int readInt() {
	int sum = 0;
	bool flg = 1;
	char now = read();

	while (now == 10 || now == 32) now = read();
	if (now == '-') flg = 0, now = read();
	while (now >= 48 && now <= 57) {
		sum = sum * 10 + now - 48;
		now = read();
	}

	return flg ? sum : -sum;
}

struct Point {
	int x, y;
	Point() {}
	Point(int x, int y) : x{ x }, y{ y } {}
	bool operator<(const Point &t) const {
		if (y == t.y) return x < t.x;
		return y < t.y;
	}
};

int dist(const Point &a, const Point &b) {
	return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
}

int main() {
	int n = readInt();

	vector<Point> vec(n);
	for (int i = 0; i < n; ++i) vec[i].x = readInt(), vec[i].y = readInt();

	sort(all(vec), [](const Point& a, const Point& b) { return a.x < b.x; });

	int start = 0;
	int ans = dist(vec[0], vec[1]);
	set<Point> cdd{ vec[0], vec[1] };

	for (int i = 2; i < n; ++i) {
		Point now = vec[i];

		while (start < i) {
			Point p = vec[start];
			int x = now.x - p.x;
			if (x * x > ans) {
				cdd.erase(p);
				++start;
			}
			else break;
		}

		int d = (int)sqrt(ans) + 1;
		auto lower = cdd.lower_bound(Point(-100000, now.y - d));
		auto upper = cdd.upper_bound(Point(100000, now.y + d));
		for (auto it = lower; it != upper; ++it) {
			int tmp = dist(now, *it);
			if (tmp < ans) ans = tmp;
		}

		cdd.insert(now);
	}

	printf("%d", ans);

	return 0;
}
