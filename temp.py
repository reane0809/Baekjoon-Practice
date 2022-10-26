##1번

import numpy as np


def f(x):
  return np.sqrt(x)


def fordiff(xi):
  xpi = xi + h
  fdf = (f(xpi) - f(xi)) / h
  return fdf


def bacdiff(xi):
  xmi = xi - h
  bdf = (f(xi) - f(xmi)) / h
  return bdf


def cendiff(xi):
  xpi = xi + h
  xmi = xi - h
  cdf = (f(xpi) - f(xmi)) / (2*h)
  return cdf


h = 1.0
xi = 3.0


print(f'forward diff: {fordiff(xi):0.4f}')
print(f'bacward diff: {bacdiff(xi):0.4f}')
print(f'cenward diff: {cendiff(xi):0.4f}')
결과:
forward diff: 0.2679
bacward diff: 0.3178
cenward diff: 0.2929
-----------------------------------------
from scipy.misc import derivative

def f(x):
  return np.sqrt(x)

h = 1.0
xi = 3.0

d = derivative(f, xi, dx=1e-1)
print(f'result = {d:0.4f}')


결과:
result = 0.2887
-----------------------------------------
##3번

import numpy as np

def f(x):
  return np.exp(x)*np.cos(x)

def fordiff(xi):
  xpi = xi + h
  fdf = (f(xpi) - f(xi)) / h
  return fdf

def bacdiff(xi):
  xmi = xi - h
  bdf = (f(xi) - f(xmi)) / h
  return bdf

def cendiff(xi):
  xpi = xi + h
  xmi = xi - h
  cdf = (f(xpi) - f(xmi)) / (2*h)
  return cdf

h = 1.0
xi = 1.0

print(f'forward diff: {fordiff(xi):0.4f}')
print(f'bacward diff: {bacdiff(xi):0.4f}')
print(f'cenward diff: {cendiff(xi):0.4f}')

##결과 : 
forward diff: -4.5436
bacward diff: 0.4687
cenward diff: -2.0375
 =================================================
from scipy.misc import derivative

def f(x):
  return np.exp(x)*np.cos(x)

h = 1.0
xi = 1.0

d = derivative(f, xi, dx=1e-1)
print(f'result = {d:0.4f}')

결과 : 
 result = -0.8312

===============================
5번
import numpy as np

def f(x):
  return x*np.cos(2*x)

def fordiff(xi):
  xpi = xi + h
  fdf = (f(xpi) - f(xi)) / h
  return fdf

def bacdiff(xi):
  xmi = xi - h
  bdf = (f(xi) - f(xmi)) / h
  return bdf

def cendiff(xi):
  xpi = xi + h
  xmi = xi - h
  cdf = (f(xpi) - f(xmi)) / (2*h)
  return cdf

h = 1.0
xi = 1.0

print(f'forward diff: {fordiff(xi):0.4f}')
print(f'bacward diff: {bacdiff(xi):0.4f}')
print(f'cenward diff: {cendiff(xi):0.4f}')

결과 : 
 forward diff: -0.8911
bacward diff: -0.4161
cenward diff: -0.6536
  
--------------------------------------
from scipy.misc import derivative

def f(x):
  return x*np.cos(2*x)

h = 1.0
xi = 1.0

d = derivative(f, xi, dx=1)
print(f'result = {d:0.4f}')

결과 : 
result = -0.6536
===========================================
7번

import numpy as np

x = np.array([5.1, 7.5, 9.1, 9.3])

dxdt_f = (x[2] - x[1])/(2-1)
dxdt_b = (x[1] - x[0])/(1-0)
dxdt_c = (x[2] - x[0])/(3-1)

print(f'forward = {dxdt_f:0.4f}')
print(f'back = {dxdt_b:0.4f}')
print(f'central = {dxdt_c:0.4f}')

결과 :
forward = 1.6000
back = 2.4000
central = 2.0000

