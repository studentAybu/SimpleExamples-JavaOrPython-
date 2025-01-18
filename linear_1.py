import numpy as np
import pandas as pd
from sklearn.linear_model import LinearRegression


def matrix_solution(coefficients,constant_term):
    A=np.array(coefficients)
    B=np.array(constant_term)
    A_inverse=np.linalg.inv(A)
    X=np.matmul(A_inverse,B)
    return X
def least_squares_method(X,Y):
    X=np.column_stack((np.ones(len(X)),X))#One column is added to the matrix X
    beta=np.linalg.inv(X.T@X)@X.T@Y #coefficients
    
    #second way: beta=np.matmul(np.matmul(np.linalg.inv(np.matmul(X_T,X)),X_T),Y)
    return beta


A=np.array([[2,3,-1],[4,1,2],[-1,2,3]])
B=np.array([1,-2,3])
matrix_solution(A,B)

np.random.seed(42)
data={'X1': np.random.rand(100),
      'X2': np.random.rand(100),
      'X3': np.random.rand(100),
      'Y': np.random.rand(100)
      }
X=np.column_stack((data['X1'],data['X2'],data['X3']))
Y=data['Y']
coefficients=least_squares_method(X,Y)


df=pd.DataFrame(data)
X=df[['X1','X2','X3']]
Y=df['Y']

model=LinearRegression()
model.fit(X,Y)
print(f"LinearRegression: {model.intercept_}, {model.coef_}")


