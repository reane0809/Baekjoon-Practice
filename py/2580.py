class Cell:
    def __init__(self):
        self.determined_num = None
        self.duplicated = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        self.candidates = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        self.blocks = []
        self.candidates_size = 9

    def determine(self, determined_num):
        self.determined_num = determined_num
        for block in self.blocks:
            block.conflict_check(determined_num)

    def undo(self):
        for block in self.blocks:
            block.undo_conflict_check(self.determined_num)
        self.determined_num = None

    def __str__(self):
        return str(self.determined_num)


class Block:
    def __init__(self,block_cells):
        self.block_cells = block_cells
        for cell in block_cells:
            cell.blocks.append(self)

    def conflict_check(self, determined_num):
        for cell in self.block_cells:
            cell.duplicated[determined_num] += 1
            if cell.duplicated[determined_num] == 1:
                cell.candidates.remove(determined_num)
                cell.candidates_size -= 1

    def undo_conflict_check(self, undo_number):
        for cell in self.block_cells:
            cell.duplicated[undo_number] -= 1
            if cell.duplicated[undo_number] == 0:
                cell.candidates.append(undo_number)
                cell.candidates_size += 1


def solve():
    if len(cells) == 0:
        for i in range(9):
            for j in range(9):
                print(board[i][j].determined_num, end=" ")
            print()
        return True
    else:
        powerful_cell = find_empty()
        for candidate in powerful_cell.candidates.copy():
            powerful_cell.determine(candidate)
            if solve():
                return True
            powerful_cell.undo()
        cells.append(powerful_cell)
        return False


def find_empty():
    cells.sort(key=lambda cell: cell.candidates_size, reverse=True)
    return cells.pop()


if __name__ == '__main__':
    board = [[Cell() for j in range(9)] for i in range(9)]
    cells = [board[i][j] for i in range(9) for j in range(9)]
    for i in range(9):
        same_row = board[i]
        same_col = []
        same_box = []
        box_col = (i // 3) * 3
        box_row = (i % 3) * 3
        for j in range(9):
            same_col.append(board[j][i])
            same_box.append(board[box_col + j // 3][box_row + j % 3])
        Block(same_row)
        Block(same_col)
        Block(same_box)
    for i in range(9):
        new_col = list(map(int, input().split()))
        for j in range(9):
            if new_col[j] != 0:
                cells.remove(board[i][j])
                board[i][j].determine(new_col[j])

    solve()
