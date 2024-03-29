# -*- coding: utf-8 -*-
"""Untitled0.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1iKxvzOut87uZW5_qu9IaxSS4_CQPA3jH
"""

## 예제

import numpy as np

def f(x):
  return x**2 * np.exp(-x)

n = 3
a = 2.0
b = 4.0
h = (b-a)/n
x = np.linspace(a,b,n+1)

sums = 0.0
for i in range(n):
  sums += f(x[i]) + f(x[i+1])
result = h*sums/2
print(f'I = {result:0.4f}')

import numpy as np

def f(x):
  return x**2 * np.exp(-x)

n = 4
a = 2.0
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

import numpy as np

fx= np.array([1.0, 1.5, 2.0, 2.5, 3.0])

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

## From Hand Book
import numpy as np
from scipy import integrate as tg

def f(x):
  return x**2 * np.exp(-x)

result = tg.quad(f, 2, 4)
print(f'result = {result[0]:0.4f}')
#result ##오차율과 소수끝자리까지 출력

gauss = tg.quadrature(f, 2, 4)
print(f'gauss = {gauss[0]:0.4f}')

def f2(x):
  return np.exp(x)*np.sin(x)/(np.cos(2*x) + 3)

result2 = tg.quad(f2, 0, 1)
print(f'result = {result2[0]:0.4f}')

gauss2 = tg.quadrature(f2, 0, 1)
print(f'gauss = {gauss2[0]:0.4f}')

x = np.arange(0,5)
y = np.array([1.0, 1.5, 2.0, 2.5, 3.0])
x,y

trape = tg.trapezoid(y,x)
print(f'trapezoid = {trape}')

simpson = tg.simpson(y,x)
print(f'simpson = {simpson}')

## 함수 만들기
##  f(x) = (20sin(x)+x**2) / (x**4 * cos(-x)), 2<=x<=4

import numpy as np
from scipy import integrate as tg

def f(x):
  return 19*np.sin(x) + x**2 / x**4 * np.cos(-x)

tmp = tg.quad(f, 2, 4)
print(f'result = {tmp[0]:0.4f}')

## data 만들기
## x =  1, 2, 3, 4, 5, 6
## y = 0, 18, 42, 57, 68, 72

x = np.arange(1,7)
y = np.array([0, 18, 42, 57, 68, 72])

trape = tg.trapezoid(y,x)
print(f'trapezoid = {trape}')

simpson = tg.simpson(y,x)
print(f'simpson = {simpson}')

import scipy
print(scipy.__version__) ##scipy 버젼 확인
print(np.__version__) ##numpy 버전 확인