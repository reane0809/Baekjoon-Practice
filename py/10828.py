from sys import stdin,stdout

stack = []
n = int(stdin.readline())
for _ in range(n):
	cmd = stdin.readline().split()
	if cmd[0] == "push":
		stack.append(cmd[1])
	elif cmd[0] == "pop":
		try:
			stdout.write(stack.pop(-1)+"\n")
		except:
			stdout.write(str(-1)+"\n")
	elif cmd[0] == "size":
		stdout.write(str(len(stack))+"\n")
	elif cmd[0] == "empty":
		if len(stack) == 0:
			stdout.write(str(1)+"\n")
		else:
			stdout.write(str(0)+"\n")
	elif cmd[0] == "top":
		try:
			stdout.write(str(stack[-1])+"\n")
		except:
			stdout.write(str(-1)+"\n")
