## 1
import numpy as np

def f(x):
  return x**2

n = 5
a = 0.0
b = 2.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = 0.0
for i in range(n):
  sums += f(x[i]) + f(x[i+1])
result = h*sums/2
print(f'I = {result:0.4f}')

-------------------------------------
I = 2.7200
-------------------------------------

## 2
import numpy as np

def f(x):
  return x**3 + 1

n = 5
a = 2.0
b = 1.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = 0.0
for i in range(n):
  sums += f(x[i]) + f(x[i+1])
result = h*sums/2
print(f'I = {result:0.4f}')

-------------------------------------
I = -4.7800
-------------------------------------

## 3
import numpy as np

def f(x):
  return x * np.cos(x)

n = 6
a = 0.0
b = 4.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = f(x[0]) + f(x[n])
for i in range(1,n):
  if i%2 == 0:
    sums += 2 * f(x[i])
  else:
    sums += 4 * f(x[i])
sums = h * sums/3
print(f'I = {sums:0.4f}')

-------------------------------------
I = -4.6784
-------------------------------------

## 4
import numpy as np

def f(x):
  return x**2 * np.sin(x)

n = 6
a = 1.0
b = 3.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = f(x[0]) + f(x[n])
for i in range(1,n):
  if i%2 == 0:
    sums += 2 * f(x[i])
  else:
    sums += 4 * f(x[i])
sums = h * sums/3
print(f'I = {sums:0.4f}')

-------------------------------------
I = 5.5536
-------------------------------------

## 5
import numpy as np

def f(x):
  return np.exp(2) * x

n = 6
a = 0.0
b = 2.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = f(x[0]) + f(x[n])
for i in range(1,n):
  if i%2 == 0:
    sums += 2 * f(x[i])
  else:
    sums += 4 * f(x[i])
sums = h * sums/3
print(f'I = {sums:0.4f}')

-------------------------------------
I = 14.7781
-------------------------------------

## 6
import numpy as np

def f(x):
  return 2 * x**2 + 3
N = 2
xi = np.array([1.0/np.sqrt(3), -1.0/np.sqrt(3)])
w = np.array([1.0, 1.0])

sums = 0.0

for i in range(N):
  sums += w[i] * f(xi[i])

print(f'I = {sums:0.4f}')

-------------------------------------
I = 7.3333
-------------------------------------







-------------------------------------

-------------------------------------

## 8
import numpy as np

def f(x):
  return np.exp(x) / np.sqrt(x**2 + 1)

N = 3
xi = np.array([0.0, np.sqrt(3.0/5.0), -np.sqrt(3.0/5.0)])
w = np.array([8.0/9.0, 5.0/9.0, 5.0/9.0])

sums = 0.0

for i in range(N):
  sums += w[i] * f(xi[i])

print(f'I = {sums:0.4f}')

-------------------------------------
I = 2.0443
-------------------------------------

## 9
import numpy as np

fx= np.array([11.0, 11.5, 12.0, 12.5, 13.0])

a = 0.0
b = 4.0

n = len(fx)
N = n-1
h = (b-a)/N

sums = 0.0
for i in range(N):
    sums += fx[i] + fx[i+1]
I = h*sums/2
print(f'I = {I:0.4f}')

-------------------------------------
I = 48.0000
-------------------------------------

## 10
import numpy as np

fx= np.array([21.0, 21.5, 22.0, 19.5, 15.0])

a = 0.0
b = 4.0

n = len(fx)
N = n-1
h = (b-a)/N

sums = 0.0
for i in range(N):
    sums += fx[i] + fx[i+1]
I = h*sums/2
print(f'I = {I:0.4f}')

-------------------------------------
I = 81.0000
-------------------------------------
