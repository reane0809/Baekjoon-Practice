##예제 1
import numpy as np
import numpy.linalg

x = np.array([1,2,3,4,5])
y = np.array([8.5, 7.7, 6.9, 4.5, 2])
xsq = x**2 #x^2

X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print(f'beta0 = {beta[0]:0.2f}')
print(f'beta1 = {beta[1]:0.2f}')
print(f'beta2 = {beta[2]:0.2f}')

yhat = X @ beta
print(yhat)

##예제 2
import numpy as np
import numpy.linalg

np.random.seed(2022)

def f(x):
  return x*np.exp(-x)

mu, sigma = 0.0, 0.04
eps = np.random.normal(mu, sigma, 50)

x = np.linspace(0,1,50)
y = f(x) + eps
xsq = x**2 #x^2

X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print('beta = ', beta)

yhat = X @ beta

##15.5

import numpy as np
import numpy.linalg

np.random.seed(2022)

def R2(y,yhat,ybar):
  SSR = np.sum((y-yhat)**2)
  SST = np.sum((y-ybar)**2)
  R2 = 1 - SSR/SST
  return R2

x = np.array([1,2,3,4,5])
y = np.array([8.5, 7.7, 6.9, 4.5, 2])
ybar = np.average(y)

#linear interp
XT = np.array([[1,1,1,1,1],[1,2,3,4,5]])
X = XT.T
beta = np.linalg.inv(XT @ X) @ (XT @ y)
yhat = X @ beta

#poly interp
xsq = x**2 #x^2
X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta2 = np.linalg.inv(XT @ X) @ (XT @ y)
yhat2 = X @ beta2

#R2 calc
R2_linear = R2(y,yhat,ybar)
R2_poly = R2(y,yhat2, ybar)

print(f'R2_linear = {R2_linear:0.4f}')
print(f'R2_poly = {R2_poly:0.4f}')

##문제 7
import numpy as np
import numpy.linalg

XT = np.array([[1,1,1,1,1],[1,2,3,4,5]])
X = XT.T
y = np.array([8.5, 7, 6, 4.5, 3])

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print(f'beta0 = {beta[0]:0.2f}')
print(f'beta1 = {beta[1]:0.2f}')

yhat = X @ beta
print(f'yhat =',yhat)


##문제 8
import numpy as np
import numpy.linalg

x = np.array([1,2,3,4,5])
y = np.array([1.3, 4.1, 5.3, 6.2, 8.9])
xsq = x**2 #x^2

X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print(f'beta0 = {beta[0]:0.2f}')
print(f'beta1 = {beta[1]:0.2f}')
print(f'beta2 = {beta[2]:0.2f}')

yhat = X @ beta
print(yhat)



##문제 9
import numpy as np
import numpy.linalg

x = np.array([1,2,3,4,5])
y = np.array([1.1, 1.5, 1.9, 2.3, 3.1])
xsq = x**2 #x^2

X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print(f'beta0 = {beta[0]:0.2f}')
print(f'beta1 = {beta[1]:0.2f}')
print(f'beta2 = {beta[2]:0.2f}')

yhat = X @ beta
print(yhat)




##문제 10
import numpy as np
import numpy.linalg

x = np.array([1,2,3,4,5])
y = np.array([8.9, 5.4, 3.2, 4.3, 6.1])
xsq = x**2 #x^2

X = np.column_stack([np.ones(len(x)),x,xsq])
XT = X.T

beta = np.linalg.inv(XT @ X) @ (XT @ y)

print(f'beta0 = {beta[0]:0.2f}')
print(f'beta1 = {beta[1]:0.2f}')
print(f'beta2 = {beta[2]:0.2f}')

yhat = X @ beta
print(yhat)
