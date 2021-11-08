#include <iostream>
#include <stdio.h>
#include <stdint.h>
#include <string.h>

constexpr int input_size = 100000;
int input[input_size];
int tree[input_size * 2];
int n;

void build() {
    for (int i = n - 1; i > 0; --i) {
        int tree_left_child = i << 1;
        int tree_right_child = (i << 1) | 1;
        int input_left_index = tree[tree_left_child];
        int input_right_index = tree[tree_right_child];

        if (input[input_left_index] < input[input_right_index]) {
            
            tree[i] = input_left_index;
        }
        else {
            
            tree[i] = input_right_index;
        }
    }
}

// [l, r)
// return input index which has lowest height
int query(int l, int r) {
#define int_max (1 << 31) - 1
    int res_value = int_max;
    int res_index = -1;
    for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
        if (l & 1) {
            
            int input_index = tree[l++];
            int input_value = input[input_index];

            if (input_value < res_value) {
                
                res_value = input_value;
                res_index = input_index;
            }
        }

        if (r & 1) {
            
            int input_index = tree[--r];
            int input_value = input[input_index];

            if (input_value < res_value) {
                
                res_value = input_value;
                res_index = input_index;
            }
        }
    }

    return res_index;
}

// [l, r)
uint64_t calc(uint64_t l, uint64_t r) {
    uint64_t lowest_index = (uint64_t)query((int)l, (int)r);
    uint64_t lowest_height = (uint64_t)input[lowest_index];
    uint64_t area = (r - l) * lowest_height;

    if (l < lowest_index) {
        
        uint64_t left_area = calc(l, lowest_index);

        if (area < left_area) {
            
            area = left_area;
        }
    }

    if (lowest_index + 1 < r) {
        
        uint64_t right_area = calc(lowest_index + 1, r);

        if (area < right_area) {
            
            area = right_area;
        }
    }

    return area;
}

int io_buf_index = 0;
char* io_buf;

void io_init() {
    
    fseek(stdin, 0, SEEK_END);
    long io_size = ftell(stdin);
    fseek(stdin, 0, SEEK_SET);
    io_buf = (char*)malloc(io_size);

    int total_read_size = 0;
    int cur_read_size = 0;
    while (total_read_size < io_size) {
        
        cur_read_size = fread(&io_buf[total_read_size], 1, io_size, stdin);
        total_read_size += cur_read_size;
    }
}

void io_deinit() {
    free(io_buf);
}

char read_char() {
    return io_buf[io_buf_index++];
}

int read_int() {
    
    char ch = '\0';
    do {
        ch = read_char();

        if (!(ch == ' ' || ch == '\n' || ch == '\r' || ch == '\r\n')) {
            
            break;
        }
    } while (true);

    int ret = ch - '0';
    while ((ch = read_char()) >= '0' && ch <= '9') {
        
        ret = ret * 10 + (ch - '0');
    }

    return ret;
}

int main() {
    using namespace std;

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    io_init();

    while (true) {
        n = read_int();
        if (n == 0)
            break;

        memset(tree, 0, sizeof(int) * input_size * 2);

        for (int i = 0; i < n; ++i) {
            
            input[i] = read_int();
            tree[n + i] = i;
        }

        build();
        cout << calc(0, (uint64_t)n) << '\n';
    }

    io_deinit();

    return 0;
}
