import numpy as np
A=np.array([[2,3,-1],[4,1,2],[-1,2,3]])
B=np.array([1,-2,3])
A_inverse=np.linalg.inv(A)
X=np.matmul(A_inverse,B)
#or two way

def matrix_solution(coefficients,constant_term):
    A=np.array(coefficients)
    B=np.array(constant_term)
    A_inverse=np.linalg.inv(A)
    X=np.matmul(A_inverse,B)
    return X
