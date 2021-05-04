#include <stdio.h>
#include <stdlib.h>

typedef struct point {
    int x;
    int y;
} point;

int compare_point(const void *a, const void *b);

int main() {
    int n;
    scanf("%d", &n);
    point *points = (point *) malloc(sizeof(point) * n);
    for(int i = 0;i < n;i++) {
        scanf("%d %d", &(points[i].x), &(points[i].y));
    }
    qsort(points, n, sizeof(point), compare_point);
    for(int i = 0;i < n;i++) {
        printf("%d %d\n", points[i].x, points[i].y);
    }
    free(points);
}

int compare_point(const void *a, const void *b) {
    const point *p1 = (point *) a;
    const point *p2 = (point *) b;
    if((p1->x) > (p2->x)) {
        return 1;
    } else if((p1->x) < (p2->x)) {
        return -1;
    } else {
        //p1.x == p2.x
        if((p1->y) > (p2->y)) {
            return 1;
        } else if ((p1->y) < (p2->y)) {
            return -1;
        } else {
            //p1 == p2;
            return 0;
        }
    }
}
