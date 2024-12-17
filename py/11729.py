def h(n, left, middle, right):
  try:
    return cache[(n, left, right)]
  except:
    pass
  if n == 1:
    c = f'{left} {right}'
  else:
    c = f'{h(n-1, left, right, middle)}\n{left} {right}\n{h(n - 1, middle, left, right)}'
  cache[(n, left, right)] = c
  return c

cache = {}
n = int(input())
print(2 ** n  - 1, h(n, 1, 2, 3), sep='\n')
