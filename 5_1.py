'''
write a program to read a postive input 'n' from the user and print the following pattern 

Assume the input 'n' will always be a postive integer 

input = 5
output = 
A*1
B*C*3*2
D*E*F*6*5*4
G*H*I*J*10*9*8*7
K*L*M*N*O*15*14*13*12*11
 
Note - If in the above pattern if the alphabet exceed 'Z' then start print again from 'A'
'''

n = int(input())

j = 0
k = 1
string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

for i in range(n):
    a = i
    while(a+1):
        print(string[j%26] + "*", end = '')
        j+=1
        a-=1
    a = i
    while(a):
        print(str(k+a) + '*', end='')
        a-=1
    print(str(k), end='')
    k=k+i+1
    print()
