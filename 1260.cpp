#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>

using namespace std;

void dfs(vector<int>* v, int start, int* check) {
		check[start] = 1;
		cout << start << " ";

		for(int i=0; i<v[start].size(); i++){
			if(check[v[start].at(i)]!=1){
				dfs(v, v[start].at(i), check);
			}			
		}
}

void bfs(vector<int>* v, int start, int* check) {
	queue<int> q;
	check[start] = 1;
	q.push(start);

	while(!q.empty()){
		int node = q.front();
		q.pop();
		cout << node << " ";

		for(int i=0; i<v[node].size(); i++){
			if(check[v[node].at(i)]!=1){
				check[v[node].at(i)]=1;
				q.push(v[node].at(i));
			}	
		}
	}

}

int main(void) {
	ios_base::sync_with_stdio(false);

	int N, M, V;
	cin >> N >> M >> V;
	vector<int> v[N+1];

	for(int i=0; i<M; i++) {
		int start, end;
		cin >> start >> end;
		v[start].push_back(end);
		v[end].push_back(start);
	}

	for(int i=0; i<N+1; i++) {
		sort(v[i].begin(), v[i].end());
	}

	int dfs_check[N+1] = {0,};
	int bfs_check[N+1] = {0,};
	dfs(v, V, dfs_check);
	cout << "\n";
	bfs(v, V, bfs_check);

	return 0;
}
