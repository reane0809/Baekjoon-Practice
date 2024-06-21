#include<iostream>
#include<algorithm>
using namespace std;
class Student {
public:
	string name;
	int age;

	bool operator <(Student& student) const {
		return this->age < student.age;
	}

};
bool compare(const Student& a, const Student& b) {
	return a.age < b.age;
}
int main() {
	ios::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
	int a, studentage[100000];
	string studentname[100000];
	Student students[100000];
	cin >> a;
	for (int i = 0; i < a; i++) {
		cin >> studentage[i] >> studentname[i];
	}
	for (int i = 0; i < a; i++) {
		students[i].name = studentname[i];
		students[i].age = studentage[i];
	}

	stable_sort(students, students + a, compare);
	for (int i = 0; i < a; i++) {
		cout << students[i].age << ' ' << students[i].name << "\n";
	}
	return 0;
}
